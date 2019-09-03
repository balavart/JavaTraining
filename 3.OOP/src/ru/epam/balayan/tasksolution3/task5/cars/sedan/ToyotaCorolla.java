package ru.epam.balayan.tasksolution3.task5.cars.sedan;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Sedan;

/**
 * this class is a child of its car classification.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Sedan extends
 */
public class ToyotaCorolla extends Sedan {
  private String name = super.getName() + " Toyota Corolla";
  private int price = 25500;
  private double fuelConsumption = 6.9d;

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
