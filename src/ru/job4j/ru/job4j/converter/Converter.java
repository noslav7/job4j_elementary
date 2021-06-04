package ru.job4j.ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static float euroToDollar(float value) {
        return (value / 60) * 70;
    }

    public static float dollarToEuro(float value) {
        return (value / 70) * 60;
    }

    public static void main(String[] args) {

        float rub4euro = Converter.rubleToEuro(140f);
        float rTeExpected = 2.0f;
        boolean rubEuro = rTeExpected == rub4euro;
        System.out.println("140 rubles are " + rub4euro + " euro. Test result : " + rubEuro);

        float rub4dollar = Converter.rubleToDollar(170f);
        float rTdExpected = 2.8333333f;
        boolean rubDollar = rTdExpected == rub4dollar;
        System.out.println("160 rubles are " + rub4dollar + " USD. Test result : " + rubDollar);

        float euro4ruble = Converter.euroToRuble(50f);
        float eTrExpected = 3500.0f;
        boolean euroRuble = eTrExpected == euro4ruble;
        System.out.println("50 euro are " + euro4ruble + " rubles. Test result : " + euroRuble);

        float dollar4ruble = Converter.dollarToRuble(100f);
        float dTrExpected = 6000.0f;
        boolean dollarRuble = dTrExpected == dollar4ruble;
        System.out.println("100 USD are " + dollar4ruble + " rubles. Test result : " + dollarRuble);

        float euro4dollar = Converter.euroToDollar(100f);
        float eTdExpected = 116.666664f;
        boolean euroDollar = eTdExpected == euro4dollar;
        System.out.println("100 euro are " + euro4dollar + " USD. Test result : " + euroDollar);

        float dollar4euro = Converter.dollarToEuro(200f);
        float dTeExpected = 171.42857f;
        boolean dollarEuro = dTeExpected == dollar4euro;
        System.out.println("200 USD are " + dollar4euro + " euro. Test result : " + dollarEuro);
    }
}
