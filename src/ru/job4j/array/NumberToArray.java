package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String temp = Integer.toString(number);
        String temp2;
        int temp3;
        int [] arrayOfInts = new int[temp.length()];
        for(int i = 0; i <= temp.length(); i++) {
            if (i != temp.length()) {
                temp2 = temp.substring(i, i+1);
            } else {
                temp2 = temp.substring(i);
            }
            temp3 =  Integer.parseInt(temp2);
            arrayOfInts[i] = temp3;
        }
        return arrayOfInts;
    }
}
