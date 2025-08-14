package com.example.demo.fan;

import java.util.ArrayList;
import java.util.Scanner;

public class FanDemo {
    public static void main(String[] args) {
        ArrayList<Fan> fanArrayList = new ArrayList<Fan>();

        int i = 1;
        while (i <= 180) {
            Fan f = new Fan();
            fanArrayList.add(f);
            i++;
        }
        System.out.println("No of fans in the warehouse: " + fanArrayList.size());
        Scanner sc = new Scanner(System.in);
        boolean outerRunning = true;
        int countOfFansOn = 0;
        int overAllCount = 0;
        while (outerRunning == true) {
            System.out.println("Enter the fan number to test: ");
            int fanSelected = sc.nextInt();
            Fan f1 = fanArrayList.get(fanSelected);
            boolean running = true;
            while (running == true) {
                System.out.println("---Fan controls----");
                System.out.println("1. Switch on the Fan");
                System.out.println("2. Switch off the Fan");
                System.out.println("3. Increase the Fan Speed");
                System.out.println("4.Decrease the Fan Speed");
                System.out.println("5.To select another Fan");
                System.out.println("6. Get Report");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        if (f1.isSwitchOn() == false) {
                            System.out.println("Starting the fan");
                            f1.switchOnTheFan();
                            overAllCount++;
                            countOfFansOn++;
                        } else {
                            System.out.println("main.java.internship.fan.Fan is already running");
                        }
                    }
                    case 2 -> {
                        f1.switchOffTheFan();
                        System.out.println("main.java.internship.fan.Fan is switched off ");
                        overAllCount++;
                        countOfFansOn--;
                    }
                    case 3 -> {
                        f1.increaseSpeed();
                        System.out.println("main.java.internship.fan.Fan speed is: " + f1.getSpeed());
                    }
                    case 4 -> {
                        f1.decreaseSpeed();
                        System.out.println("main.java.internship.fan.Fan speed is: " + f1.getSpeed());
                    }
                    case 5 -> {
                        running = false;
                        overAllCount++;
                        //System.out.println("");
                    }
                    case 6 -> {
                        System.out.println("No of fans switched on status: " + countOfFansOn);
                        System.out.println("Overall count of buttons tested: " + overAllCount);
                    }
                }
            }
        }
    }
}
