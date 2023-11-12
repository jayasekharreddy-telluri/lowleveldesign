package daytwo;

import daytwo.observer.EmailAlertObserverImpl;
import daytwo.observer.MobileAlertObserverImpl;
import daytwo.observer.NotificationAlertObserver;
import daytwo.observerpattren.observable.IphoneObservableImpl;
import daytwo.observerpattren.observable.StocksObservable;

public class Store {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observerOne = new EmailAlertObserverImpl("jai@gmail.com",iphoneStockObservable);

        NotificationAlertObserver observerTwo = new EmailAlertObserverImpl("sai@gmail.com",iphoneStockObservable);


        NotificationAlertObserver observerThree = new MobileAlertObserverImpl("jai@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(observerOne);

        iphoneStockObservable.add(observerTwo);

        iphoneStockObservable.add(observerThree);


        iphoneStockObservable.setStockCount(10);
    }
}
