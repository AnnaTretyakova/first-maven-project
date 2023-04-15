package ru.itgirl;

import java.util.Scanner;

enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

public class App {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, напечатайте день недели на английском языке: ");
        Scanner input = new Scanner(System.in);

        try {
            DayOfWeek day = DayOfWeek.valueOf(input.nextLine().toUpperCase());
            switch (day) {
                case MONDAY:
                    System.out.println("Понедельник");
                    break;
                case TUESDAY:
                    System.out.println("Вторник");
                    break;
                case WEDNESDAY:
                    System.out.println("Среда");
                    break;
                case THURSDAY:
                    System.out.println("Четверг");
                    break;
                case FRIDAY:
                    System.out.println("Пятница");
                    break;
                case SATURDAY:
                    System.out.println("Суббота");
                    break;
                case SUNDAY:
                    System.out.println("Воскресенье");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Вы напечатали неверное название! " + e.getMessage());
        }
    }
}
