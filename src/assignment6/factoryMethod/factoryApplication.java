package assignment6.factoryMethod;
import assignment6.factoryMethod.factory.HTMLDialog;
import assignment6.factoryMethod.factory.WebDialog;
import assignment6.factoryMethod.factory.WindowsDialog;

public class factoryApplication{
    private static WebDialog dialog;

    public static void main() {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.render();
    }
}
