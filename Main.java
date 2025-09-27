package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Day day = new Day(scanner);
        Month month = new Month(scanner);
        Year year = new Year(scanner);

        int daysInMonth = DaysInMonth.getDaysInMonth(month.getMonth(), year.getYear());
        while (day.getDay() > daysInMonth) {
            System.out.println("Ошибка нету столько дней в месяце");
            day = new Day(scanner);
        }

        int dayOfWeek = DayOfWeekCalculator.calculateDayOfWeek(day.getDay(), month.getMonth(), year.getYear());
        String dayName = DayOfWeekCalculator.getDayName(dayOfWeek);

        System.out.println("День: " + day.getDay());
        System.out.println("Месяц: " + month.getMonth());
        System.out.println("Год: " + year.getYear());
        System.out.println("День недели: " + dayName);
    }
}