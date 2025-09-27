package org.example;

import java.util.Scanner;

public class Month {
    private int month;

    public Month(Scanner scanner) {
        while (true) {
            System.out.print("Введите месяц (ЧИСЛОМ) ");
            String monthInput = scanner.nextLine().trim();
            if (monthInput.isEmpty()) {
                System.out.println("Ошибка введено пустое что то");
                continue;
            }
            if (!InputValidator.isValidNumber(monthInput)) {
                System.out.println("Ошибка введено не число");
                continue;
            }
            month = Integer.parseInt(monthInput);
            if (month < 1 || month > 12) {
                System.out.println("Ошибка месяц должен быть от 1-12");
                continue;
            }
            break;
        }
    }

    public int getMonth() {
        return month;
    }
}