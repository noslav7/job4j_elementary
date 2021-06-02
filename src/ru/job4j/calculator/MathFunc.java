package ru.job4j.calculator;

import java.sql.PreparedStatement;

public class MathFunc {
    public static int func1(int x) {
        int result = x * 100;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        MathFunc.func1(100);
    }
}
