package ru.epam.balayan.tasksolution3.task5.cars.limousine;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Limousine;

/**
 * this class is a child of its car classification
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Limousine extends
 */
public class HammerH2 extends Limousine {
  private String name = super.getName() + " Hammer H2";
  private int price = 75000;
  private double fuelСonsumption = 25.1d;

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
