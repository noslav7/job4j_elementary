package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, short addition) {
        return max(left, right) + addition;
    }

    public static int max(int left, int right, short addition, byte value) {
        return max(left, right, addition) * value;
    }
}
