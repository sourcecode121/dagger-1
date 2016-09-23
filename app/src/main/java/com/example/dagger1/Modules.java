package com.example.dagger1;

/**
 * Created by Anand on 23/09/2016.
 */
public final class Modules {
    static Object[] list(){
        return new Object[] {
                new AndroidModule(),
                new Dagger1Module()
        };
    }
}
