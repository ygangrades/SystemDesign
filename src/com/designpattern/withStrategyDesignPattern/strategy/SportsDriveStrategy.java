package com.designpattern.withStrategyDesignPattern.strategy;

import com.designpattern.withStrategyDesignPattern.strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sport Drive Capabilities");
    }
}
