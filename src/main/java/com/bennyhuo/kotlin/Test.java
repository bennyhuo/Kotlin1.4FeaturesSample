package com.bennyhuo.kotlin;

import kotlin.reflect.KProperty;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object[] values = (Object[]) MyOtherClass.class.getDeclaredField("$$delegatedProperties").get(null);
        for (Object property :values){
            System.out.println(property);
        }
    }
}
