package ru.job4j.loop;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int requiredChildren = children;
        int requiredAdults = adults;
        int countGroups = 0;
        int soldChildren = 0;
        int soldAdults = 0;
        for (int i = 0; i < cNum.length; i++) {
            if (cNum[i] <= children && aNum[i] <= adults) {
                soldChildren += cNum[i];
                soldAdults += aNum[i];
                children -= cNum[i];
                adults -= aNum[i];
                countGroups++;
            }
        }
        int childrenLeft = requiredChildren - soldChildren;
        int adultsLeft = requiredAdults - soldAdults;
        System.out.println( "Группы: " + countGroups + ", Взрослых: " + soldAdults + ", детей: " + soldChildren
                + ", осталось билетов взр: " + adultsLeft + ", осталось билетов дет: " + childrenLeft);
}
}
