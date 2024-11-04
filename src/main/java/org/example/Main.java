package org.example;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

        try{
            Class<?> clazz = Class.forName("Calculator");
            Calculator calculator = (Calculator) clazz.getDeclaredConstructor().newInstance(1);
            //Constructor<?> clazzConstructor =  clazz.getDeclaredConstructor(int.class);
            //clazzConstructor .setAccessible(true);
            //Calculator calculator2 = (Calculator) clazzConstructor.newInstance(1);
            //Add add = clazz.getDeclaredMethod(add, 1);
            //add.setAccessible(true);
            calculator.toString();

            //Class clazz = Class.forName("Calculator");
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
