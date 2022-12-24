package designpatterns.decorator.Assignment.assignment1;

public class Farmhouse implements PizzaConstituents{

    PizzaConstituents pizzaConstituents;

    public Farmhouse(){

    }

    public Farmhouse(PizzaConstituents pizzaConstituents){
        this.pizzaConstituents=pizzaConstituents;
    }

    @Override
    public int getCost() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getCost()+150;
        }
        return 150;
    }

    @Override
    public String getDescription() {

        if(pizzaConstituents!=null){
            return pizzaConstituents.getDescription()+"+ Farmhouse";
        }
        return "Farmhouse";
    }
}
