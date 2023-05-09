package ru.job4j.array;
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i - 1) == (data.get(i) + data.get(i + 1)) / 2) {
                for (Integer datum : data) {
                    sum = sum + datum;
                }
            } else {
                return 0;
            }
        }
        return sum;
    }
}
