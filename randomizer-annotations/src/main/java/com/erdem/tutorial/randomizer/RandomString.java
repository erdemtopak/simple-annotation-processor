package com.erdem.tutorial.randomizer;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Retention(CLASS)
@Target(value = FIELD)
public @interface RandomString {
}
