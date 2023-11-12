package daytwo.observer;

import daytwo.observerpattren.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;

    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable) {

        this.userName = emailId;

        this.observable = observable;

    }

    @Override
    public void update() {

        sendMsgOnMobile(userName, "stocks avaliable hurry up...");
    }

    public void sendMsgOnMobile(String userName, String msg) {

        System.out.println("msg sent to : " + userName);
    }
}
