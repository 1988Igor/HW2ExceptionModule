package org.example;

import java.io.IOException;
import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";

        while (string.isEmpty()) {
            System.out.print("Enter a string: ");
            string = scanner.nextLine();

            try {
                if (string.isEmpty()) {
                    throw new Exception("The empty string is not allowed.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Your string: " + string);
    }
}


