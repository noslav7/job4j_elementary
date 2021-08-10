package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String sirName = fio[0].toString();
        String name = fio[1].toString();
        String patronymic = fio[2].toString();
        return sirName + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".";
    }
}
