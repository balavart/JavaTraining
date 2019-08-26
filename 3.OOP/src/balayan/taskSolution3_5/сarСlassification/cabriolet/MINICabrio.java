package balayan.taskSolution3_5.сarСlassification.cabriolet;

import balayan.taskSolution3_5.сarСlassification.Cabriolet;

/**
 * this class is a child of its car classification
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see Cabriolet extends
 * is created on 8/26/2019
 */
public class MINICabrio extends Cabriolet {
    private String name = super.getName() + " MINI Cabrio";
    private int price = 34900;
    private double fuelСonsumption = 5.6d;

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
