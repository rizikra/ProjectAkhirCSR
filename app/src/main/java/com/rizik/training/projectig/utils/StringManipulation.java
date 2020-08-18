package com.rizik.training.projectig.utils;

public class StringManipulation {
    public static String expandUsername(String username){
        return username.replace(".", " ");
    }
    public static String condenUsername(String username){
        return username.replace(" ",".");
    }
}
