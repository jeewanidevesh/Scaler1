package designpatterns.decorator.Assignment.assignment1;

public class Client {

    public static void main(String[] args) {

        PizzaConstituents p=new Paneer(
                new Cheese(
                        new Tomato(
                                new BBQChicken()
                        )
                )
        );

        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}
