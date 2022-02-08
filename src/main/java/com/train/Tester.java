package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tickets = 0;
        int key = 0;
        int end = -1;
        int loop = 1;
        while (tickets != end) {
            key = loop;
            System.out.print("loop " + loop + ", Please enter number of tickets, or enter -1 to finish booking");
            loop = loop + 1;
            tickets = scanner.nextInt();
            if (tickets == end) {
            } else {
                System.out.print("How many round-trip tickets: ");
                int round = scanner.nextInt();
                Ticket ticket = new Ticket(tickets, round);
                ticket.print();
            }

        }


    }


}
