package ru.job4j.array;

public class Task77 {
    public static void array(int[] first, int[] second, int[] third) {
        int sumFirst = 0;
        int sumSecond = 0;
        int sumThird = 0;
        sumFirst += first[0];
        sumFirst += second[0];
        sumFirst += third[0];
        sumSecond += first[1];
        sumSecond += second[1];
        sumSecond += third[1];
        sumThird += first[2];
        sumThird += second[2];
        sumThird += third[2];
        System.out.println("Первый: " + sumFirst + ", второй: " + sumSecond + ", третий: " + sumThird);
    }
}
