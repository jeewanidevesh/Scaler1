package designpatterns.decorator.Assignment.assignment1;

public class Tomato implements PizzaConstituents{

    PizzaConstituents pizzaConstituents;

    public Tomato(){

    }

    public Tomato(PizzaConstituents pizzaConstituents){
        this.pizzaConstituents=pizzaConstituents;
    }


    @Override
    public int getCost() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getCost()+30;
        }
        return 30;
    }

    @Override
    public String getDescription() {

        if(pizzaConstituents!=null){
            return pizzaConstituents.getDescription()+"+ Tomato";
        }
        return "Tomato";
    }
}
