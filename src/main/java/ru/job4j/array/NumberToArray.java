package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String temp = Integer.toString(number);
        int[] newIntArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newIntArray[i] = temp.charAt(i) - '0';
        }
        int temporary = 0;
        for (int i = 0; i < newIntArray.length / 2; i++) {
            temporary = newIntArray[i];
            newIntArray[i] = newIntArray[newIntArray.length - 1 - i];
            newIntArray[newIntArray.length - 1 - i] = temporary;
        }
        return newIntArray;
    }
}
