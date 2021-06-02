package ru.job4j.ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rte = value / 70;
        return rte;
    }

    public static float rubleToDollar(float value) {
        float rtd = value / 60;
        return rtd;
    }

    public static float euroToRuble(float value) {
        float enr = value * 70;
        return enr;
    }

    public static float dollarToRuble(float value) {
        float dtr = value * 60;
        return dtr;
    }

    public static float euroToDollar(float value) {
        float etd = (value / 60) * 70;
        return etd;
    }

    public static float dollarToEuro(float value) {
        float dte = (value / 70) * 60;
        return dte;
    }

    public static void main(String[] args) {
        float rub4euro = Converter.rubleToEuro(140f);
        float rub4dollar = Converter.rubleToDollar(170f);
        float euro4ruble = Converter.euroToRuble(50f);
        float dollar4ruble = Converter.dollarToRuble(100f);
        float euro4dollar = Converter.euroToDollar(100f);
        float dollar4euro = Converter.dollarToEuro(200f);
        System.out.println("140 rubles are " + rub4euro + " euro.");
        System.out.println("160 rubles are " + rub4dollar + " USD.");
        System.out.println("50 euro are " + euro4ruble + " rubles.");
        System.out.println("100 USD are " + dollar4ruble + " rubles.");
        System.out.println("100 euro are " + euro4dollar + " USD.");
        System.out.println("200 USD are " + dollar4euro + " euro.");
    }
}
