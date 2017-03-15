package com.erdem.tutorial.randomizer;

import java.util.Random;

import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

class AnnotatedRandomString extends AnnotatedRandomElement {

    private static final String QUALIFIER_STRING = "java.lang.String";
    private static final String SEED = "ABCDEFGHJKLMNOPRSTUVYZabcdefghjklmnoprstuvyz";

    AnnotatedRandomString(Element element) {
        super(element);
    }

    @Override
    public boolean isTypeValid(Elements elements, Types types) {
        TypeMirror elementType = element.asType();
        TypeMirror string = elements.getTypeElement(QUALIFIER_STRING).asType();
        return types.isSameType(elementType, string);
    }

    @Override
    public String getRandomValue() {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randIndex = random.nextInt(SEED.length());
            builder.append(SEED.charAt(randIndex));
        }
        return "\"" + builder.toString() + "\"";
    }
}
