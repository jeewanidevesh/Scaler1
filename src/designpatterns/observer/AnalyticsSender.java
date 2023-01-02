package designpatterns.observer;

public class AnalyticsSender implements OrderPlacedSubscriber,OrderCancelledSubscriber{

    public AnalyticsSender(){
        Amazon amazon=Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {
        System.out.println("Updating analytics");
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Updating analytics");
        //return "Updating analytics";
    }
}
