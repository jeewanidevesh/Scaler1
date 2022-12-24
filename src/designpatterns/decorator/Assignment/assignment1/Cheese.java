package designpatterns.decorator.Assignment.assignment1;

public class Cheese implements PizzaConstituents{

    PizzaConstituents pizzaConstituents;

    public Cheese(){

    }

    public Cheese(PizzaConstituents pizzaConstituents){
        this.pizzaConstituents=pizzaConstituents;
    }

    @Override
    public int getCost() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getCost()+80;
        }
        return 80;
    }

    @Override
    public String getDescription() {

        if(pizzaConstituents!=null){
            return pizzaConstituents.getDescription()+"+ Cheese";
        }
        return "Cheese";
    }
}
