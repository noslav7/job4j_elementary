package ru.job4j.loop;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int count = 0;
        int sum = 0;
        int[] numArray = new int[num];
        for (int i = 0; i < numArray.length; i++) {
            count++;
            if (count == 1) {
                numArray[i] = a1;
            } else if (count == 2) {
                numArray[i] = a2;
                sum = a1 + a2;
            } else if (count > 2) {
                numArray[i] = (numArray[i - 2] + numArray[i- 1]);
                sum = sum + numArray[i];
            }
        }
        System.out.println(sum);
    }
}
