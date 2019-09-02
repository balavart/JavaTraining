package ru.epam.balayan.tasksolution3.task5.cars.limousine;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Limousine;

/**
 * this class is a child of its car classification
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Limousine extends
 */
public class VolkswagenBeetle extends Limousine {
  private String name = super.getName() + " Volkswagen Beetle";
  private int price = 24900;
  private double fuelСonsumption = 7.6d;

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
