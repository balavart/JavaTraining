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
public class VolkswagenBeetle extends Limousine {
    private String name = super.getName() + " Volkswagen Beetle";
    private int price = 24900;
    private double fuelСonsumption = 7.6d;

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
