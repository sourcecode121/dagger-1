package com.example.dagger1;

import dagger.Module;

/**
 * Created by Anand on 23/09/2016.
 */
@Module(
        complete = false,
        injects = {
                Dagger1Application.class,
                MainActivity.class
        }
)
public class Dagger1Module {

}
