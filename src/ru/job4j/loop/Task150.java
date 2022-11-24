package ru.job4j.loop;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int accountNewValue = account;
        int operations = 0;
        for (int i = 0; i < transfers.length; i++) {
            accountNewValue = accountNewValue + transfers[i];
            if (accountNewValue < overdraft || transfers[i] == 0) {
                break;
            }
            account = accountNewValue;
            operations++;
        }
        System.out.println("Остаток: " + account + ", операций: " + operations);
    }

    public static void main(String[] args) {
        int[] transfers = {-400, 200, 100, -1000};
        loop(-100, 500, transfers);
    }
}
