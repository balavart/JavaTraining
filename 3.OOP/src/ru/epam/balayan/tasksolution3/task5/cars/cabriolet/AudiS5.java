package ru.epam.balayan.tasksolution3.task5.cars.cabriolet;

import ru.epam.balayan.tasksolution3.task5.cars.classification.Cabriolet;

/**
 * this class is a child of its car classification.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Cabriolet extends
 */
public class AudiS5 extends Cabriolet {
  private String name = super.getName() + " Audi S5";
  private int price = 52400;
  private double fuelConsumption = 7.5d;

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
