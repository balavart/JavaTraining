package ru.epam.balayan.tasksolution3.task5.cars.contract;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Cabriolet;
import ru.epam.balayan.tasksolution3.task5.cars.classification.Limousine;
import ru.epam.balayan.tasksolution3.task5.cars.classification.Sedan;

/**
 * this abstract class is contract between car classes.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Cabriolet expands
 * @see Limousine expands
 * @see Sedan expands
 */
public abstract class PassengerCar {
  public abstract double getFuelСonsumption();

  public abstract String getName();

  public abstract int getPrice();
}
