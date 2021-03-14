package assignment6;

import assignment6.builders.builderApplication;
import assignment6.factoryMethod.factoryApplication;
import assignment6.Singleton.singletonApplication;

public class Main {

    public static void main(String[] args) {
        singletonApplication.main();
        System.out.println("-----------------------------------------------------");
        builderApplication.main();
        System.out.println("-----------------------------------------------------");
        factoryApplication.main();
    }
}
