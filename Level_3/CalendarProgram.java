package com.gla.Level_3;

import java.util.Scanner;

public class CalendarProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12) and year: ");
        int month = sc.nextInt();
        int year = sc.nextInt();

        displayCalendar(month, year);
        sc.close();
    }

    public static void displayCalendar(int m, int y) {
        String monthName = getMonthName(m);
        int numDays = getNumDays(m, y);
        int firstDay = getFirstDay(1, m, y); // Day of week for the 1st

        System.out.println("\n    " + monthName + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }


        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }


    public static String getMonthName(int m) {
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[m];
    }


    public static int getNumDays(int m, int y) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m];
    }

    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0));
    }


    public static int getFirstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
}
