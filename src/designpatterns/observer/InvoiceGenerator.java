package designpatterns.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator(){
        Amazon amazon=Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        generateInvoice();
    }

    private void generateInvoice() {
        System.out.println("Generate Invoice");
    }
}
