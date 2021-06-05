package ru.job4j.ru.job4j.converter;


import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float rub = 140f;
        float rTeExpected = 2.0f;
        float rub4euro = Converter.rubleToEuro(rub);
        Assert.assertEquals(rTeExpected, rub4euro, 0.1f);
    }

    @Test
    public void whenConvert170RublesThen3Dollars() {
        float rub = 170f;
        float rTdExpected = 2.8f;
        float rub4dollar = Converter.rubleToDollar(rub);
        Assert.assertEquals(rTdExpected, rub4dollar, 0.1f);
    }

    @Test
    public void whenConvert50EuroThen3500Rubles() {
        float eur = 50f;
        float eTrExpected = 3500.0f;
        float euro4ruble = Converter.euroToRuble(eur);
        Assert.assertEquals(eTrExpected, euro4ruble, 0.1f);
    }

    @Test
    public void whenConvert100DollarsThen6000Rubles() {
        float usd = 100f;
        float dTrExpected = 6000.0f;
        float dollar4ruble = Converter.dollarToRuble(usd);
        Assert.assertEquals(dTrExpected, dollar4ruble, 0.1f);
    }

    @Test
    public void whenConvert100EuroThen117Dollars() {
        float euro = 100f;
        float eTdExpected = 116.7f;
        float euro4dollar = Converter.euroToDollar(euro);
        Assert.assertEquals(eTdExpected, euro4dollar, 0.1f);
    }

    @Test
    public void dollarToEuro() {
        float usd = 200f;
        float dTeExpected = 171.4f;
        float dollar4euro = Converter.dollarToEuro(usd);
        Assert.assertEquals(dTeExpected, dollar4euro, 0.1f);
    }

    @Test
    public void main() {
    }
}