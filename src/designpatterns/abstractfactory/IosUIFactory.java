package designpatterns.abstractfactory;

import designpatterns.abstractfactory.components.buttons.IosButton;
import designpatterns.abstractfactory.components.dropdowns.IosDropdown;
import designpatterns.abstractfactory.components.menus.IosMenu;
import designpatterns.abstractfactory.components.menus.Menu;

public class IosUIFactory implements UIFactory{

    @Override
    public IosButton createButton(){
        return  new IosButton();
    }

    @Override
    public IosDropdown createDropdown(){
        return new IosDropdown();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
