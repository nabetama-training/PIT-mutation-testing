package org.example.singleton;

public class Singleton {

    private static Singleton me = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (me == null) {
            me = new Singleton();
        }
        return me;
    }
}
