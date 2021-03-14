package assignment6.factoryMethod.buttons;

public class HTMLButton implements Button {

    public void render() {
        System.out.println("<button>HTML Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click button! Get answer: 'Have a good day!'");
    }
}