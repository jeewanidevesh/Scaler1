package designpatterns.decorator;

public class ChocolateCone implements IceCreamConeConstituents{
    IceCreamConeConstituents iceCreamConeConstituents;

    public ChocolateCone(){

    }

    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }


    @Override
    public int getCost() {
        if(iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getCost()+30;
        }

        return 30;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getDescription()+"+ Chocolate Cone";
        }
        return "ChocolateCone";
    }
}
