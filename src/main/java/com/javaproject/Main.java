package com.javaproject;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,month,day;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Welcome to Java Console BirthDay Calculator \n");
        
        System.out.print("Enter Year:");
        year = scanner.nextInt();
        System.out.print("Enter Month:");
        month = scanner.nextInt();
        System.out.print("Enter Day:");
        day = scanner.nextInt();
        System.out.println("");
        LocalDate localDate = LocalDate.of(year,month, day);
        System.out.println("Your age is: " + AgeCalculator.calculateAge(localDate));
    }
}