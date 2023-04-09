package com.designpattern.observablePattern.observer;

import com.designpattern.observablePattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StockObservable stockObservable;
    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock hurry up!");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("Email send to :"+emailId);
    }
}
