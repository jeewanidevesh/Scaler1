package designpatterns.factorymethod.before;

public class PostgresDatabase implements Database{
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostname() {

    }

    @Override
    public DatabaseType getType() {
        return null;
    }
}
