package com.erdem.tutorial.randomizer;

import android.app.Activity;
import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class Randomizer {

    private static final String RANDOMIZER_SUFFIX = "_Randomizer";

    private Randomizer() {

    }

    public static void bind(Activity activity) {
        try {

            Class bindingClass = Class.forName(activity.getClass().getCanonicalName() + RANDOMIZER_SUFFIX);
            //noinspection unchecked
            Constructor constructor = bindingClass.getConstructor(activity.getClass());
            constructor.newInstance(activity);

        } catch (ClassNotFoundException e) {
            Log.e("TAG", "Meaningful Message", e);
        } catch (NoSuchMethodException e) {
            Log.e("TAG", "Meaningful Message", e);
        } catch (IllegalAccessException e) {
            Log.e("TAG", "Meaningful Message", e);
        } catch (InstantiationException e) {
            Log.e("TAG", "Meaningful Message", e);
        } catch (InvocationTargetException e) {
            Log.e("TAG", "Meaningful Message", e);
        }
    }

}
