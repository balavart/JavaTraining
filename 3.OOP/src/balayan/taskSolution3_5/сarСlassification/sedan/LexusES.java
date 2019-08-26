package balayan.taskSolution3_5.сarСlassification.sedan;

import balayan.taskSolution3_5.сarСlassification.Sedan;

/**
 * this class is a child of its car classification
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see Sedan extends
 * is created on 8/26/2019
 */
public class LexusES extends Sedan {
    private String name = super.getName() + " LexusES";
    private int price = 39750;
    private double fuelСonsumption = 7.9d;

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
