package assignment6.builders.items;

public class Garage {
    private String garage;

    public Garage() {
        this.garage = "For parking cars";
    }

    public Garage(String manualGarage) {
        this.garage = manualGarage;
    }

    public String getGarage() {
        return garage;
    }
}

