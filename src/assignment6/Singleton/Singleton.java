package assignment6.Singleton;

public final class Singleton{
    private static Singleton instance;
    public String value;

    private Singleton(String value) {

        try {
            // some long running task
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
