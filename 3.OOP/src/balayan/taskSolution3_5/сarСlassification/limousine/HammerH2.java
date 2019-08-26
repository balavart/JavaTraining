package balayan.taskSolution3_5.сarСlassification.limousine;

import balayan.taskSolution3_5.сarСlassification.Limousine;

/**
 * this class is a child of its car classification
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see Limousine extends
 * is created on 8/26/2019
 */
public class HammerH2 extends Limousine {
    private String name = super.getName() + " Hammer H2";
    private int price = 75000;
    private double fuelСonsumption = 25.1d;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getFuelСonsumption() {
        return fuelСonsumption;
    }

    @Override
    public String toString() {
        return getName() + ", price: " + getPrice() + "$" + ", fuel consumption: " + getFuelСonsumption() + " L/100 km";
    }
}
