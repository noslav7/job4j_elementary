package ru.job4j.condition;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        int sec = seconds % 60;
        int minutes = seconds / 60;
        if (seconds >= 3600) {
            System.out.println("Расчет не производится");
        } else {
            System.out.println("Минут: " + minutes + ", секунд: " + sec);
        }
    }

    public static void main(String[] args) {
        secondsToMinutes(3700);
    }
}
