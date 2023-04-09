package com.designpattern.withStrategyDesignPattern;

import com.designpattern.withStrategyDesignPattern.strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SportsDriveStrategy());
    }
}
