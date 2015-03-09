//package com.company;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Mersedes"), new Car("BMW"), new Car("Fiat"), new Car("Reno"), new Car("Lada"), new SelfFixesCar("Porshe"), new SelfFixesCar("Infiniti")};
        Race myRace = new Race(500, cars);
        myRace.start(0);
    }
}
