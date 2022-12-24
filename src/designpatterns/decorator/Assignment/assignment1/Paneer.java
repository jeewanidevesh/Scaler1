package designpatterns.decorator.Assignment.assignment1;

public class Paneer implements PizzaConstituents{

    PizzaConstituents pizzaConstituents;

    public Paneer(){

    }

    public Paneer(PizzaConstituents pizzaConstituents){
        this.pizzaConstituents=pizzaConstituents;
    }

    @Override
    public int getCost() {

        if(pizzaConstituents!=null){
            return pizzaConstituents.getCost()+60;
        }
        return 60;
    }

    @Override
    public String getDescription() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getDescription()+"+ Paneer";
        }
        return "Paneer";
    }
}
