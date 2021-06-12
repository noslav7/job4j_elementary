package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива short: " + ages.length);
        String[] sirnames = new String[100500];
        System.out.println("Размер массива String: " + sirnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива float: " + prices.length);
    }
}
