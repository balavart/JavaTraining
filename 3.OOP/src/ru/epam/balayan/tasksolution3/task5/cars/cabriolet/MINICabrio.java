package ru.epam.balayan.tasksolution3.task5.cars.cabriolet;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Cabriolet;

/**
 * this class is a child of its car classification
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Cabriolet extends
 */
public class MINICabrio extends Cabriolet {
  private String name = super.getName() + " MINI Cabrio";
  private int price = 34900;
  private double fuelСonsumption = 5.6d;

  @Override
  public String toString() {
    return getName()
        + ", price: "
        + getPrice()
        + "$"
        + ", fuel consumption: "
        + getFuelСonsumption()
        + " L/100 km";
  }

  @Override
  public double getFuelСonsumption() {
    return fuelСonsumption;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getPrice() {
    return price;
  }
}
