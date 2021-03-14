package assignment6.builders.builder;

import assignment6.builders.houses.HouseModel;
import assignment6.builders.items.Garage;
import assignment6.builders.items.Doors;
import assignment6.builders.items.Windows;
import assignment6.builders.items.Roof;

public interface Builder {
    void buildHouseModel(HouseModel model);
    void buildWalls(int walls);
    void buildDoors(Doors doors);
    void buildWindows(Windows windows);
    void buildRoof(Roof roof);

    void buildGarage(Garage garage);
}

