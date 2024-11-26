package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
      addPlace("Paris");
        addPrice(800);
        adddate(LocalDate.now());
    }
    static void adddate(LocalDate date){
        System.out.println(date);
        System.out.println("Hello Paris!");
        
    }
   static void addPlace(String place){
        System.out.println(place);
    }
    static int addPrice(int price){
        System.out.println(price*0.85);
        return price;
    }
}