package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private static  Amazon instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers=new ArrayList<>();

    public static Amazon getInstance(){
        if(instance==null){
            instance=new Amazon();
        }

        return instance;
    }

    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    void deregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber:orderPlacedSubscribers){
            orderPlacedSubscriber.announceOrderPlaced();
        }
    }

}
