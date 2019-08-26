package balayan.taskSolution3_5.contract;

import balayan.taskSolution3_5.сarСlassification.Cabriolet;
import balayan.taskSolution3_5.сarСlassification.Limousine;
import balayan.taskSolution3_5.сarСlassification.Sedan;

/**
 * this abstract class is contract between car classification classes
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see Cabriolet expands
 * @see Limousine expands
 * @see Sedan expands
 * is created on 8/26/2019
 */
public abstract class PassengerCar {
    abstract public String getName();

    abstract public int getPrice();

    abstract public double getFuelСonsumption();
}
