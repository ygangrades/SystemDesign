package com.designpattern.withStrategyDesignPattern;

import com.designpattern.withStrategyDesignPattern.strategy.DriveStrategy;
import com.designpattern.withStrategyDesignPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(new SportsDriveStrategy());
    }
}
