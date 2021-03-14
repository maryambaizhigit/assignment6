package assignment6.builders;

import assignment6.builders.builder.HouseBuilder;
import assignment6.builders.builder.HouseManualBuilder;
import assignment6.builders.houses.House;
import assignment6.builders.houses.Manual;
import assignment6.builders.architector.Architect;

public class builderApplication{

    public static void main() {
        Architect architect = new Architect();

        HouseBuilder builder = new HouseBuilder();
        architect.constructFlat(builder);
        House house = builder.getResult();
        System.out.println("House model:\n" + house.getHouseModel());

        HouseManualBuilder builder1 = new HouseManualBuilder();
        architect.constructCityHouse(builder1);

        Manual manual = builder1.getProduct();
        System.out.println("HOUSE GUIDE:\n" + manual.print());
    }

}
