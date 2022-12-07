package designpatterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        UserService userservice=new UserService(new MySqlDatabase());
    }
}
