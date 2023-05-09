package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isBlank()) {
            return false;
        }
        if (isSpecialSymbol(name.charAt(0)) || isLowerLatinLetter(name.charAt(0))) {
            char[] nameChars = name.toCharArray();
            for (int i = 1; i < nameChars.length; i++) {
                if (!(isSpecialSymbol(nameChars[i]) || isUpperLatinLetter(nameChars[i])
                        || isLowerLatinLetter(nameChars[i]) || Character.isDigit(nameChars[i]))) {
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
        boolean specialSymbol = false;
        if (code == 36 || code == 95) {
            specialSymbol = true;
        }
        return specialSymbol;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean upperLatinLetter = false;
        if (code >= 65 && code <= 90) {
            upperLatinLetter = true;
        }
        return upperLatinLetter;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean lowerLatinLetter = false;
        if (code >= 97 && code <= 122) {
            lowerLatinLetter = true;
        }
        return lowerLatinLetter;
    }
}
