package assignment6.factoryMethod.factory;
import assignment6.factoryMethod.buttons.Button;
import assignment6.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends WebDialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
