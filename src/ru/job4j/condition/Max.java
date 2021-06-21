package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, short addition) {
        return left > right ? left + addition : right + addition;
    }

    public static int max(int left, int right, short addition, byte value) {
        return left > right ? (left + addition) * value : (right + addition) * value;
    }
}
