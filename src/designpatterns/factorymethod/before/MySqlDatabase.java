package designpatterns.factorymethod.before;

public class MySqlDatabase implements Database{
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
