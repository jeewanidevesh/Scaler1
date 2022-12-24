package designpatterns.decorator.Assignment.assignment1;

public class Olive implements PizzaConstituents{

    PizzaConstituents pizzaConstituents;

    public Olive(){

    }

    public Olive(PizzaConstituents pizzaConstituents){
        this.pizzaConstituents=pizzaConstituents;
    }


    @Override
    public int getCost() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getCost()+20;
        }
        return 20;
    }

    @Override
    public String getDescription() {

        if(pizzaConstituents!=null){
            return pizzaConstituents.getDescription()+"Olive";
        }

        return "Olive";
    }
}
