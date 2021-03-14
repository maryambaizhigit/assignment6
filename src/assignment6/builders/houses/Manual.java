package assignment6.builders.houses;

import assignment6.builders.items.Doors;
import assignment6.builders.items.Garage;
import assignment6.builders.items.Windows;
import assignment6.builders.items.Roof;

public class Manual {
    private final HouseModel houseModel;
    private final int walls;
    private final Doors doors;
    private final Windows windows;
    private final Roof roof;
    private final Garage garage;

    public Manual(HouseModel houseModel, int walls, Doors doors, Windows windows,
                  Roof roof, Garage garage) {
        this.houseModel = houseModel;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }

    public String print() {
        String book = "";
        book = book + "House Model: " + houseModel + "\n";
        book = book + "Number Of Walls: " + walls + "\n";
        book = book + "Doors: width - " + doors.getWidth() + "; height - " + doors.getHeight() + "\n";
        book = book + "Windows: " + windows + "\n";
        if (this.roof != null) {
            book = book + "House Plan: Working" + "\n";
        } else {
            book = book + "House Plan: Not active" + "\n";
        }
        if (this.garage != null) {
            book = book + "Garage: Functional" + "\n";
        } else {
            book = book + "Garage: Not active" + "\n";
        }
        return book;
    }
}

