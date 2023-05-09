package ru.job4j.loop;

public class Task82 {
    public static void loop(int[] promo, int[] ticket) {
        int freeTickets = 0;
        int sumTicketsNumber = 0;
        for (int i = 0; i < promo.length; i++) {
            freeTickets = freeTickets + promo[i] / 10;
            sumTicketsNumber = sumTicketsNumber + promo[i];
        }
        for (int i = 0; i < ticket.length; i++) {
            sumTicketsNumber = sumTicketsNumber + ticket[i];
        }
        System.out.println("Продано билетов: " + sumTicketsNumber + ", выдано бесплатно: " + freeTickets);
    }
}
