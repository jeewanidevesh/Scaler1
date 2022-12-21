package designpatterns.decorator;

public class OrangeCone implements IceCreamConeConstituents{

    IceCreamConeConstituents iceCreamConeConstituents;

    public OrangeCone(){}
    public OrangeCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }

    public void setVitaminCLevel(int newLevel){

    }
}
