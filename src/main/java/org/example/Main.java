package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        adddate(LocalDate.now());
    }
    static void adddate(LocalDate date){
        System.out.println(date);
        System.out.println("Hello Paris!");
    }
}