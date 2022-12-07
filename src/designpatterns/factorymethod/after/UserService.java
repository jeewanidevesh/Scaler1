package designpatterns.factorymethod.after;

import designpatterns.factorymethod.before.DatabaseType;
import designpatterns.factorymethod.before.MySqlQuery;
import designpatterns.factorymethod.before.PostgresQuery;

public class UserService {

    Database database;

    public UserService(Database database){
        this.database=database;
    }

    void registerUser(){

        Query query= database.createQuery();
//        if(database.getType().equals(designpatterns.factorymethod.before.DatabaseType.MYSQL)){
//            query=new MySqlQuery();
//        }
//        else if(database.getType().equals(DatabaseType.POSTGRES)){
//            query=new PostgresQuery();
//        }
    }
}
