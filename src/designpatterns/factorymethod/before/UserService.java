package designpatterns.factorymethod.before;

public class UserService {

    Database database;

    public UserService(Database database){
        this.database=database;
    }

    void registerUser(){

        Query query;

        //violating SRP and OCP

        if(database.getType().equals(DatabaseType.MYSQL)){
            query=new MySqlQuery();
        }
        else if(database.getType().equals(DatabaseType.POSTGRES)){
            query=new PostgresQuery();
        }
    }
}
