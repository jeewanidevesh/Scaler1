package designpatterns.abstractfactory;

import designpatterns.abstractfactory.components.buttons.Button;
import designpatterns.abstractfactory.components.dropdowns.Dropdown;
import designpatterns.abstractfactory.components.menus.Menu;

public interface UIFactory {

    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();
}
