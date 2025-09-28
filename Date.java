package org.example;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(Scanner scanner) {
        while (true) {
            System.out.print("Введите дату в формате ДД.ММ.ГГГГ: ");
            String dateInput = scanner.nextLine().trim();
            if (dateInput.isEmpty()) {
                System.out.println("Ошибка введено пустое значение");
                continue;
            }
            String[] parts = dateInput.split("\\.");
            if (parts.length != 3) {
                System.out.println("Ошибка неверный формат даты");
                continue;
            }
            if (!InputValidator.isValidNumber(parts[0]) || !InputValidator.isValidNumber(parts[1]) || !InputValidator.isValidNumber(parts[2])) {
                System.out.println("Ошибка введено не число");
                continue;
            }
            day = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
            if (day < 1 || day > 31) {
                System.out.println("Ошибка день должен быть от 1 до 31");
                continue;
            }
            if (month < 1 || month > 12) {
                System.out.println("Ошибка месяц должен быть от 1 до 12");
                continue;
            }
            if (year < 1 || year > 9999) {
                System.out.println("Ошибка год должен быть от 1 до 9999");
                continue;
            }
            break;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}