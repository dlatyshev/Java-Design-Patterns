package org.dmytroqa.singleton.threadsafe;

import org.dmytroqa.singleton.naive.Singleton;

public class TheadSafeSingleton {

    private static volatile TheadSafeSingleton instance;

    public String value;

    private TheadSafeSingleton() {
    }

    public static TheadSafeSingleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        TheadSafeSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new TheadSafeSingleton();
            }
            return instance;
        }
    }
}
