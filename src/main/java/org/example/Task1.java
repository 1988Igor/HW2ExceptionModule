package org.example;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
у пользователя ввод данных.
 */


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        float number = getUserFloatInput();
        System.out.println("Your float number: " + number);
    }

    public static float getUserFloatInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float number");

        float number;
        while (true) {
            try {
                number = Float.parseFloat(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a float number");
            }
        }
        scanner.close();
        return number;
    }
}






