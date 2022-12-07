package designpatterns.abstractfactory;


//practical factory
public class UIFactoryFactory {

    public static UIFactory getUiFactoryForPlatform(SupportedPlatforms platform){
        return switch(platform){
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
