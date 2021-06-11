package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row == 0 && cell == 0) || (row == 1 && cell == 1) || (row == 2 && cell == 2) || (row == 3 && cell == 3) || (row == 4 && cell == 4);
                boolean right = (row == size - 1 && cell == 0) || (row == size - 2 && cell == 1) || (row == size - 3 && cell == 2) || (row == size - 4 && cell == 3) || (row == size - 5 && cell == 4);
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}

