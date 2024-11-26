package org.example;

public class Main {
    public static void main(String[] args) {
        addPlace("Paris");
        addPrice(800);
    }
   static void addPlace(String place){
        System.out.println(place);
    }
    static int addPrice(int price){
        System.out.println(price*0.85);
        return price;
    }
}