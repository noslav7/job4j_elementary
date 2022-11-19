package ru.job4j.loop;

public class Task146 {
    public static void loop(int[] nums) {
        int weightSum = 0;
        int newWeight = 0;
        int peopleNum = 0;
        int newNum = 0;
        for (int i = 0; i < nums.length; i++) {
            newWeight += nums[i];
            newNum++;
            if (newWeight <= 300 && newNum <= 4) {
                weightSum = newWeight;
                peopleNum = newNum;
            } else if (newNum > 4 && newWeight > 300) {
                System.out.println("Людей: " + peopleNum + ", вес: " + weightSum
                        + ", отказ: Много людей и перегруз");
                return;
            } else if (newNum > 4) {
                System.out.println("Людей: " + peopleNum + ", вес: " + weightSum
                        + ", отказ: " + "Много людей");
                return;
            } else {
                System.out.println("Людей: " + peopleNum + ", вес: " + weightSum
                        + ", отказ: Перегруз");
                return;
            }
        }
        System.out.println("Людей: " + peopleNum + ", вес: " + weightSum
                + ", отказ: Нет");
    }
}
