package assignment6.builders.houses;

import assignment6.builders.items.Doors;
import assignment6.builders.items.Garage;
import assignment6.builders.items.Windows;
import assignment6.builders.items.Roof;

public class House {
    private final HouseModel houseModel;
    private final int walls;
    private final Doors doors;
    private final Windows windows;
    private final Roof roof;
    private final Garage garage;
    private double fuel = 0;

    public House(HouseModel houseModel, int walls, Doors doors, Windows windows,
                 Roof roof, Garage garage) {
        this.houseModel = houseModel;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        if (this.roof != null) {
            this.roof.setHouse(this);
        }
        this.garage = garage;
    }

    public HouseModel getHouseModel() {
        return houseModel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getWalls() {
        return walls;
    }

    public Doors getDoors() {
        return doors;
    }

    public Windows getWindows() {
        return windows;
    }

    public Roof getRoof() {
        return roof;
    }

    public Garage getGarage() {
        return garage;
    }
}

