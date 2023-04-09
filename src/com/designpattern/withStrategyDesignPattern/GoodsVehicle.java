package com.designpattern.withStrategyDesignPattern;

import com.designpattern.withStrategyDesignPattern.strategy.DriveStrategy;
import com.designpattern.withStrategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStrategy());
    }
}
