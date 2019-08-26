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
public class AudiS5 extends Cabriolet {
    private String name = super.getName() + " Audi S5";
    private int price = 52400;
    private double fuelСonsumption = 7.5d;

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
