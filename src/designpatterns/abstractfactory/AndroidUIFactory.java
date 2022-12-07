package designpatterns.abstractfactory;

import designpatterns.abstractfactory.components.buttons.AndroidButton;
import designpatterns.abstractfactory.components.dropdowns.AndroidDropdown;
import designpatterns.abstractfactory.components.menus.AndroidMenu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public AndroidButton createButton(){
        return new AndroidButton();
    }
    @Override
    public AndroidDropdown createDropdown(){
        return new AndroidDropdown();
    }
    @Override
    public AndroidMenu createMenu(){
        return new AndroidMenu();
    }
}
