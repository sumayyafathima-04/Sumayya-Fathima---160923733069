package com.example.demo.services;

import com.example.demo.fan.Fan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FanService {
    ArrayList<Fan> fanArrayList = new ArrayList<Fan>();
    int overAllCount = 0;
    int countOfFansOn = 0;
    Fan f1 = new Fan();

    public FanService() {
        int i = 1;
        while (i < 180) {
            Fan f = new Fan();
            fanArrayList.add(f);
            i++;
        }
    }
    public void switchOn(Integer fanNumber) {
        Fan f1 = fanArrayList.get(fanNumber);
        if (f1.isSwitchOn() == false) {
            System.out.println("Starting the fan");
            f1.switchOnTheFan();
            overAllCount++;
            countOfFansOn++;
        } else {
            System.out.println("main.java.internship.fan.Fan is already running");
        }
    }
    public void switchOff(Integer fanNumber) {
        f1.switchOffTheFan();
        System.out.println("main.java.internship.fan.Fan is switched off ");
        overAllCount++;
        countOfFansOn--;
    }
    public void increase(Integer fanNumber) {

        f1.increaseSpeed();
        System.out.println("main.java.internship.fan.Fan speed is: " + f1.getSpeed());
    }
    public void decrease() {
        f1.decreaseSpeed();
        System.out.println("main.java.internship.fan.Fan speed is: " + f1.getSpeed());
    }
    public void report() {
        System.out.println("No of fans switched on status: " + countOfFansOn);
        System.out.println("Overall count of buttons tested: " + overAllCount);
    }
}
