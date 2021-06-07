package ru.job4j.condition;

public class LogicAnd {

            public boolean check(int num) {
            boolean positive = num > 0;
            boolean even = num % 2 == 0;
            boolean check = false;
            if (positive && even) {
                check = true;
            }
            return check;
        }
}
