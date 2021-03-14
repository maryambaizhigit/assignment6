package assignment6.builders.items;

public class Doors {
    private final double width;
    private double height;
    private boolean started;

    public Doors(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void has() {
        started = true;
    }

    public void has_not() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void start(double height) {
        if (started) {
            this.height += height;
        } else {
            System.err.println("Cannot start(), you must do doors first!");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

