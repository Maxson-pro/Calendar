package org.example;

import java.util.Scanner;

public class Year {
    private int year;
    public Year(Scanner scanner) {
        while (true) {
            System.out.print("Введите год (ЧИСЛОМ) ");
            String yearInput = scanner.nextLine().trim();
            if (yearInput.isEmpty()) {
                System.out.println("Ошибка введено пустое значение");
                continue;
            }
            if (!InputValidator.isValidNumber(yearInput)) {
                System.out.println("Ошибка введено не число");
                continue;
            }
            year = Integer.parseInt(yearInput);
            if (year < 1 || year > 9999) {
                System.out.println("Ошибка год должен быть от 1 до 9999");
                continue;
            }
            break;
    }
}
        public int getYear() {
        return year;
    }
}

