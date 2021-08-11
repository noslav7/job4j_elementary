package ru.job4j.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        int size = nums.length;
        for (int i = 0; i < count; i++) {
            int temp = nums[size - 1];
            for (int j = size - 1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < 1; i++) {
            int temp = nums[size - 1];
            for (int j = size - 1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}
