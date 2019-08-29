package ru.epam.balayan.tasksolution3.task5.cars.limousine;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Limousine;


/**
 * this class is a child of its car classification
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see Limousine extends
 * is created on 8/26/2019
 */
public class Chrysler300 extends Limousine {

    private String name = super.getName() + " Chrysler 300";
    private int price = 78900;
    private double fuelСonsumption = 10.7d;

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
