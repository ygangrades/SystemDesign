package com.designpattern.observablePattern.observer;

import com.designpattern.observablePattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StockObservable stockObservable;
    public MobileAlertObserverImpl(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "Product is is stock hurry up!");
    }

    private void sendMsgOnMobile(String username, String msg) {
        System.out.println("Message sent to :"+username);
    }
}
