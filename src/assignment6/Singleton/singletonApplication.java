package assignment6.Singleton;

public class singletonApplication{
    public static void main() {
        System.out.println("INSTRUCTION:" + "\n" + "if program output the same value it works." + "\n" +
                "if program output different values it doesn't work." + "\n" +
                "result:" );
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton fSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(fSingleton.value);
    }
}

