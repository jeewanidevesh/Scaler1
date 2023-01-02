package designpatterns.observer;

public class EmailSender implements OrderPlacedSubscriber{

    public EmailSender(){
        Amazon amazon=Amazon.getInstance();
        amazon.registerSubscriber(this);
    }

    private void sendEmail() {
        System.out.println("Sending Email");
    }

    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }
}
