package com.example.demo.fan;

public class Fan {
        private int id;
        private String brand;
        private boolean isSwitchOn = false;


        private FanSpeed speed = FanSpeed.OFF;

        public void switchOnTheFan() {
            if (isSwitchOn) {
                System.out.println("Fan is already Spinning at speed: " + speed);
            } else {
                System.out.println("Starting fan with speed LOW");
                isSwitchOn = true;
                speed = FanSpeed.LOW;
            }
        }

        public void switchOffTheFan() {
            if (!isSwitchOn) {
                System.out.println("Fan is not Spinning");
            } else {
                System.out.println("Fan is Stopped");
                isSwitchOn = false;
                speed = FanSpeed.OFF;
            }
        }

        // Method to change speed
        public void changeSpeed(FanSpeed newSpeed) {
            if (isSwitchOn) {
                speed = newSpeed;
                System.out.println("Fan speed changed to: " + speed);
            } else {
                System.out.println("Can't change speed Fan is off.");
            }
        }

        public FanSpeed getSpeed() {
            return speed;
            }

        public void increaseSpeed() {
             speed=speed.increase();
        }
        public void decreaseSpeed() {
            speed = speed.decrease();
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id= id;
        }
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public boolean isSwitchOn() {
            return false;
        }
    }



