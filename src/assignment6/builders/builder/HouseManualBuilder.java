package assignment6.builders.builder;

import assignment6.builders.houses.Manual;
import assignment6.builders.houses.HouseModel;
import assignment6.builders.items.Garage;
import assignment6.builders.items.Doors;
import assignment6.builders.items.Windows;
import assignment6.builders.items.Roof;

public class HouseManualBuilder implements Builder {
    private HouseModel model;
    private int walls;
    private Doors doors;
    private Windows windows;
    private Roof roof;
    private Garage garage;

    @Override
    public void buildHouseModel(HouseModel model) {
        this.model = model;
    }

    @Override
    public void buildWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void buildDoors(Doors doors) {
        this.doors = doors;
    }

    @Override
    public void buildWindows(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void buildRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void buildGarage(Garage garage) {
    this.garage = garage;
    }

    public Manual getProduct() {
        return new Manual(model, walls, doors, windows, roof, garage);
    }
}

