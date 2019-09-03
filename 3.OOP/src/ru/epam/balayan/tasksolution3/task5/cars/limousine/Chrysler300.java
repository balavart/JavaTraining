package ru.epam.balayan.tasksolution3.task5.cars.limousine;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Limousine;

/**
 * this class is a child of its car classification.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Limousine extends
 */
public class Chrysler300 extends Limousine {
  private String name = super.getName() + " Chrysler 300";
  private int price = 78900;
  private double fuelConsumption = 10.7d;

  @Override
  public String toString() {
    return getName()
        + ", price: "
        + getPrice()
        + "$"
        + ", fuel consumption: "
        + getFuelConsumption()
        + " L/100 km";
  }

  @Override
  public double getFuelConsumption() {
    return fuelConsumption;
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
