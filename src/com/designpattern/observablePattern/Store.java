package com.designpattern.observablePattern;

import com.designpattern.observablePattern.observable.IphoneAlertObservable;
import com.designpattern.observablePattern.observable.StockObservable;
import com.designpattern.observablePattern.observer.EmailAlertObserverImpl;
import com.designpattern.observablePattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneAlertObservable();
        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl("xyz@abc.com",stockObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserverImpl("xyz@abc.com",stockObservable);
        NotificationAlertObserver notificationAlertObserver3 = new EmailAlertObserverImpl("xyz@abc.com",stockObservable);
        stockObservable.add(notificationAlertObserver1);
        stockObservable.add(notificationAlertObserver2);
        stockObservable.add(notificationAlertObserver3);

        stockObservable.setStockCount(10);
    }
}
