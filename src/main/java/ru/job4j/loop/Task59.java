package ru.job4j.loop;

public class Task59 {
    public static void loop(int num, int[] array) {
        int countLess = 0;
        int countEqual = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                countEqual++;
            } else if (array[i] < num) {
                countLess++;
            }
        }
        System.out.println("Равно: " + countEqual + ", меньше: " + countLess);
    }
}
