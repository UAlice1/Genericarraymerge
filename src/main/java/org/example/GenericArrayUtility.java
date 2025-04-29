//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.lang.reflect.Array;

public class GenericArrayUtility {
    public GenericArrayUtility() {
    }

    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if (a == null && b == null) {
            return (T[])(new Object[0]);
        } else if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else {
            T[] merged = (T[])((Object[])Array.newInstance(a.getClass().getComponentType(), a.length + b.length));
            System.arraycopy(a, 0, merged, 0, a.length);
            System.arraycopy(b, 0, merged, a.length, b.length);
            return merged;
        }
    }
}
