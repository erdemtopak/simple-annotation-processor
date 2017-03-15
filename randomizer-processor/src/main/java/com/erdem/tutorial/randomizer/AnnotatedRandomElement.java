package com.erdem.tutorial.randomizer;

import javax.lang.model.element.Element;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

abstract class AnnotatedRandomElement {

    Element element;
    Name qualifiedClassName;
    Name simpleClassName;
    Name elementName;
    TypeMirror elementType;

    AnnotatedRandomElement(Element element) {
        this.element = element;
        elementName = element.getSimpleName();
        simpleClassName = element.getEnclosingElement().getSimpleName();
        TypeElement enclosingElement = ((TypeElement) element.getEnclosingElement());
        qualifiedClassName = enclosingElement.getQualifiedName();
        elementType = element.asType();
    }

    Name getQualifiedClassName() {
        return qualifiedClassName;
    }

    Name getSimpleClassName() {
        return simpleClassName;
    }

    Name getElementName() {
        return elementName;
    }

    TypeMirror getElementType() {
        return elementType;
    }

    Element getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "Qualified class name : " + qualifiedClassName.toString() + "\n"
                + "Simple class name : " + simpleClassName.toString() + "\n"
                + "Element name : " + elementName.toString() + "\n"
                + "Element type : " + elementType.toString() + "\n";
    }

    abstract boolean isTypeValid(Elements elements, Types types);

    abstract String getRandomValue();
}
