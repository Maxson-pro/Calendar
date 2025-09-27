package org.example;

public class DayOfWeekCalculator {
    public static int calculateDayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int h = (day + (13 * (month + 1)) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
        return h;
    }

    public static String getDayName(int dayOfWeek) {
        String[] days = {"Суббота", "Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница"};
        return days[dayOfWeek];
    }
}