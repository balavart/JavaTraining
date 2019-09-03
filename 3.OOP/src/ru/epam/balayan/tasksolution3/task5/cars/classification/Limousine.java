package ru.epam.balayan.tasksolution3.task5.cars.classification;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.Chrysler300;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.HammerH2;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.VolkswagenBeetle;

/**
 * this abstract class is the parent class for cars of this classification.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see Chrysler300 expands
 * @see HammerH2 expands
 * @see VolkswagenBeetle expands
 * @see PassengerCar extends
 */
public abstract class Limousine extends PassengerCar {
  private String name = "Limousine";

  @Override
  public String getName() {
    return name;
  }
}
