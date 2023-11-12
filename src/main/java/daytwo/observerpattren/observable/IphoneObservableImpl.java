package daytwo.observerpattren.observable;

import daytwo.observer.NotificationAlertObserver;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observableList = new ArrayList<>();

    public int stockCount = 0;


    @Override
    public void add(NotificationAlertObserver observer) {

        observableList.add(observer);

    }

    @Override
    public void remove(NotificationAlertObserver observer) {

        observableList.remove(observer);

    }


    @Override
    public void notifySubscribers() {

        for (NotificationAlertObserver observer : observableList){

            observer.update();
        }

    }

    @Override
    public void setStockCount(int newStockAdded) {

        if (stockCount == 0){
            notifySubscribers();
        }

        stockCount = stockCount + newStockAdded;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
