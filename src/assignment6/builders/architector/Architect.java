package assignment6.builders.architector;

import assignment6.builders.builder.Builder;
import assignment6.builders.houses.HouseModel;
import assignment6.builders.items.Doors;
import assignment6.builders.items.Garage;
import assignment6.builders.items.Windows;
import assignment6.builders.items.Roof;

public class Architect {

    public void constructCityHouse(Builder builder) {
        builder.buildHouseModel(HouseModel.CITY_HOUSE);
        builder.buildWalls(4);
        builder.buildDoors(new Doors(1.5, 2));
        builder.buildWindows(Windows.WOODEN);
        builder.buildRoof(new Roof());
        builder.buildGarage(new Garage());
    }

    public void constructVillageHouse(Builder builder) {
        builder.buildHouseModel(HouseModel.VILLAGE_HOUSE);
        builder.buildWalls(8);
        builder.buildDoors(new Doors(0.5, 2));
        builder.buildWindows(Windows.PLASTIC);
        builder.buildRoof(new Roof());
        builder.buildGarage(new Garage());
    }

    public void constructFlat(Builder builder) {
        builder.buildHouseModel(HouseModel.FLAT);
        builder.buildWalls(4);
        builder.buildDoors(new Doors(0.5, 2));
        builder.buildWindows(Windows.SEMI_PLASTIC);
        builder.buildRoof(new Roof());
        builder.buildGarage(new Garage());
    }
}
