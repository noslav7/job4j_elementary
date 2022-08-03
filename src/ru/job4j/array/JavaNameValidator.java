package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        char[] nameChars = name.toCharArray();
        if ((isSpecialSymbol(nameChars[0]) || isLowerLatinLetter(nameChars[0]))
                && name.charAt(0) != Character.MIN_VALUE) {
            for (int i = 1; i < nameChars.length; i++) {
                if (!(isSpecialSymbol(nameChars[i]) || isUpperLatinLetter(nameChars[i])
                        || isLowerLatinLetter(nameChars[i]))) {
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
