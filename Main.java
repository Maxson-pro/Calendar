package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date date = new Date(scanner);

        int daysInMonth = DaysInMonth.getDaysInMonth(date.getMonth(), date.getYear());
        while (date.getDay() > daysInMonth) {
            System.out.println("Ошибка нету столько дней в месяце");
            date = new Date(scanner);
        }

        int dayOfWeek = DayOfWeekCalculator.calculateDayOfWeek(date.getDay(), date.getMonth(), date.getYear());
        String dayName = DayOfWeekCalculator.getDayName(dayOfWeek);

        System.out.println("День: " + date.getDay());
        System.out.println("Месяц: " + date.getMonth());
        System.out.println("Год: " + date.getYear());
        System.out.println("День недели: " + dayName);
    }
}
