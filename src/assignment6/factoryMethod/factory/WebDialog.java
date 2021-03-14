package assignment6.factoryMethod.factory;

import assignment6.factoryMethod.buttons.Button;

public abstract class WebDialog {
    public void render() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
