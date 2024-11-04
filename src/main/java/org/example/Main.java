package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main3(String[] args) {

        try{
            Class<?> clazz = Class.forName("Calculator");
            Constructor<?> clazzConstructor =  clazz.getDeclaredConstructor(int.class);
            clazzConstructor .setAccessible(true);
            Calculator calculator2 = (Calculator) clazzConstructor.newInstance(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
