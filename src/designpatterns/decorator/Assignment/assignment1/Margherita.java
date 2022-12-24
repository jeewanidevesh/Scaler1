package designpatterns.decorator.Assignment.assignment1;

public class Margherita implements PizzaConstituents{

    PizzaConstituents pizzaConstituents;

    public Margherita(){

    }

    public Margherita(PizzaConstituents pizzaConstituents){
        this.pizzaConstituents=pizzaConstituents;
    }
    @Override
    public int getCost() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getCost()+200;
        }
        return 200;
    }

    @Override
    public String getDescription() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getDescription()+"+ Margherita";
        }
        return "Margherita";
    }
}
