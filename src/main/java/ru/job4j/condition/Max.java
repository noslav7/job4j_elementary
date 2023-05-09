package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int addition) {
        return max(left, max(right, addition));
    }

    public static int max(int left, int right, int addition, int value) {
        return max(left, max(right, addition, value));
    }
}
