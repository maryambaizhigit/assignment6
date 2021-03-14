package assignment6.builders.builder;

import assignment6.builders.houses.House;
import assignment6.builders.houses.HouseModel;
import assignment6.builders.items.Doors;
import assignment6.builders.items.Garage;
import assignment6.builders.items.Windows;
import assignment6.builders.items.Roof;

public class HouseBuilder implements Builder {
    private HouseModel model;
    private int walls;
    private Doors doors;
    private Windows windows;
    private Roof roof;
    private Garage garage;


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

    public House getResult() {
        return new House(model, walls, doors, windows, roof, garage);
    }
}
