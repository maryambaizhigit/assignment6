package assignment6.factoryMethod.factory;
import assignment6.factoryMethod.buttons.Button;
import assignment6.factoryMethod.buttons.HTMLButton;

public class HTMLDialog extends WebDialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
