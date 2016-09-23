package com.example.dagger1;

import dagger.ObjectGraph;

/**
 * Created by Anand on 23/09/2016.
 */
public final class Injector {

    private static ObjectGraph graph = null;

    public static void init(final Object... modules){
        graph = ObjectGraph.create(modules);
        graph.injectStatics();
    }

    public static void init(final Object target, Object... modules){
        init(modules);
        inject(target);
    }

    public static void inject(final Object target){
        graph.inject(target);
    }
}
