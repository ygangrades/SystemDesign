package com.designpattern.observablePattern.observable;

import com.designpattern.observablePattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneAlertObservable implements StockObservable {
    public List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: notificationAlertObservers){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
