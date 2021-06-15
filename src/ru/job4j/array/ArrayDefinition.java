package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива short: " + ages.length);
        String[] sirnames = new String[100500];
        System.out.println("Размер массива String: " + sirnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива float: " + prices.length);
        String[] names = new String[4];
        names[0] = "Valentin Rachkov";
        names[1] = "Petr Arsentev";
        names[2] = "Petr Bogomolov";
        names[3] = "Korobeinikov Stas";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
