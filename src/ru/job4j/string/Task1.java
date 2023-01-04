package ru.job4j.string;

public class Task1 {
    public static String maxMatch(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strings = {"столовая", "стол", "столица", "столяр"};
        System.out.println(maxMatch(strings));
    }
}
