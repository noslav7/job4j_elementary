package ru.job4j.condition;

public class Task37 {
    public static void numsCompare(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num1 < num2){
            System.out.println(num2);
        } else {
            System.out.println("Равны");
        }
    }
}
