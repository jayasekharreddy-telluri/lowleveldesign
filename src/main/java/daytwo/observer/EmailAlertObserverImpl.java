package daytwo.observer;

import daytwo.observerpattren.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;

    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId,StocksObservable observable){

        this.emailId =emailId;

        this.observable =  observable;

    }

    @Override
    public void update() {

        sendMail(emailId,"stocks avaliable hurry up...");
    }

    public void sendMail(String emaiId,String msg){

        System.out.println("mail sent to : "+ emailId);
    }
}
