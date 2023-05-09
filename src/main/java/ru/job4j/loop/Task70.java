package ru.job4j.loop;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;


        for (int i = 0; i < coords.length; i = i + 2) {
            int xaSquare = ((coords[i]) - x) * ((coords[i]) - x);
            int ybSquare = ((coords[i + 1]) - y) * ((coords[i + 1]) - y);
            int squaresCoordsSum = xaSquare + ybSquare;
            if  (squaresCoordsSum < r * r) {
                in++;
            } else if (squaresCoordsSum == r * r) {
                on++;
            }
        }

        System.out.println("На окружности: " + on + ", внутри: " + in);
    }
}
