package com.example.demo.fan;

public class FanTest {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setId(1);
        f1.setBrand("Usha main.java.internship.fan.Fan");
        f1.switchOnTheFan();
        f1.switchOnTheFan();
        f1.changeSpeed(FanSpeed.MEDIUM);
        f1.changeSpeed(FanSpeed.HIGH);
        f1.switchOffTheFan();
        f1.changeSpeed(FanSpeed.LOW);
        f1.switchOffTheFan();

        System.out.println("main.java.internship.fan.Fan ID: " + f1.getId());
        System.out.println("main.java.internship.fan.Fan Brand: " + f1.getBrand());
        System.out.println("main.java.internship.fan.Fan Speed: " + f1.getSpeed());
    }
}
