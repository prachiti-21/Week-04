package com.annotation;

class LegacyAPI{
    @Deprecated
    public void oldFeature(){
        System.out.println("This is old");
    }
    public void newFeature(){
        System.out.println("This is new");
    }
}
public class LegacyApiAnno {
    public static void main(String[] args) {


        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.oldFeature();
        legacyAPI.newFeature();
    }
}