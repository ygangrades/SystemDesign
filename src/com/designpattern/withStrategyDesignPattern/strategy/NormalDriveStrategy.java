package com.designpattern.withStrategyDesignPattern.strategy;

import com.designpattern.withStrategyDesignPattern.strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Capabilities");
    }
}
