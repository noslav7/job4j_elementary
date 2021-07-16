package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        int[] destroyInt = new int[seq.length];
        for (int i = 0; i < seq.length; i++) {
            int numberFromChar = Character.getNumericValue(i);
            destroyInt[i] = numberFromChar;
        }
       for (int i = 0; i < destroyInt.length; i++) {
                if (i < 6) {
                    destroyInt[i] = 0;
                }
                if (i > destroyInt.length - 6) {
                    destroyInt[i] = 1;
                }
        }

        return seq;
    }
}
