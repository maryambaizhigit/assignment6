package assignment6.builders.items;

import assignment6.builders.houses.House;

public class Roof {

    private House house;

    public void setHouse(House house) {
        this.house = house;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + house.getFuel());
    }

    public void showStatus() {
        if (this.house.getDoors().isStarted()) {
            System.out.println("House building is started");
        } else {
            System.out.println("House building isn't started");
        }
    }
}

