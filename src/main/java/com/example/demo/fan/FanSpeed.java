package com.example.demo.fan;

public enum FanSpeed {
    OFF, LOW, MEDIUM, HIGH;
    public FanSpeed increase() {
        return switch (this) {
            case OFF -> LOW;
            case LOW -> MEDIUM;
            case MEDIUM -> HIGH;
            case HIGH -> HIGH;
        };
    }
    public FanSpeed decrease() {
        return switch(this) {
            case OFF -> MEDIUM;
            case MEDIUM -> OFF;
            case HIGH -> LOW;
            case LOW -> OFF;
        };
    }
}