package org.example;

import java.util.Scanner;

public class Day {
    private int day;

    public Day(Scanner scanner) {
        while (true) {
            System.out.print("Введите день (ЧИСЛОМ) ");
            String dayInput = scanner.nextLine().trim();
            if (dayInput.isEmpty()) {
                System.out.println("Ошибка введено пустое значение");
                continue;
            }
            if (!InputValidator.isValidNumber(dayInput)) {
                System.out.println("Ошибка введено не число");
                continue;
            }
            day = Integer.parseInt(dayInput);
            if (day < 1 || day > 31) {
                System.out.println("Ошибка день должен быть от 1 - 31");
                continue;
            }
            break;
        }
    }

    public int getDay() {
        return day;
    }
}
