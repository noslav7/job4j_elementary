package ru.job4j.condition;

public class Task77 {
    public static void diffNumAmount(int num) {
        int num1, num2, num3, count = 0;
        num1 = num / 100;
        num2 = num % 100 / 10;
        num3 = num % 100 % 10;
        if (num1 != num2) {
            count++;
            if (num2 != num3 && num1 != num3) {
                count = count + 2;
            }
            System.out.println(count);
            return;
        } else if (num2 != num3) {
            count++;
            System.out.println(count);
            return;
        } else {
            System.out.println(count);
        }
    }
}
