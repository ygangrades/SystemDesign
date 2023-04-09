package com.designpattern.withStrategyDesignPattern;

import com.designpattern.withStrategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        this.driveStrategy.drive();
    }
}
