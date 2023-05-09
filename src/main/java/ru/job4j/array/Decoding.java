package ru.job4j.array;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int[] cypheredArray = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            cypheredArray[i] = ints[i] % number;
        }
        return cypheredArray;
    }
}
