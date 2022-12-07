package designpatterns.factorymethod.after;

public interface Database {

    void setUrl();

    void getHostname();

    DatabaseType getType();

    Query createQuery();
}
