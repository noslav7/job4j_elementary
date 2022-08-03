package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (Character.isLetter(name.charAt(0)) && Character.isLowerCase(name.charAt(0))) {
            char[] nameChars = name.toCharArray();
            for (int i = 0; i < nameChars.length; i++) {
                if (!isSpecialSymbol(i) || isUpperLatinLetter(i) || isLowerLatinLetter(i)) {
                    valid = false;
                    break;
                }
            }
        } else {
            valid = false;
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        return false;
    }
}
