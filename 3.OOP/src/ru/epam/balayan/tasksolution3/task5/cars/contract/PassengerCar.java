package ru.epam.balayan.tasksolution3.task5.cars.contract;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Sedan;
import ru.epam.balayan.tasksolution3.task5.cars.classification.Cabriolet;
import ru.epam.balayan.tasksolution3.task5.cars.classification.Limousine;


/**
 * this abstract class is contract between car classes
 * HACK: possibly a better way is to divide methods into interfaces
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
