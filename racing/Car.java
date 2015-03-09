//package com.company;

public class Car {
    int position;
    int n2o;
    int speed;
    String name;
    boolean broken;

    public void move() {


        if (!broken) {
            if ((Math.random() * 100) > 60) {
                position += speed + n2o;
            } else {
                position += speed;
            }
            if ((Math.random() * 100) > 95) {
                broken=true;
                System.out.println(name+ " is broken!");
            }

        }
    }

    public Car(String name) {
        n2o = 20;
        speed = 10;
        position = 0;
        broken=false;
        this.name=name;
    }


    public String toString(){
        return "Car with name: " + name+". Position - "+position;
    }
}

