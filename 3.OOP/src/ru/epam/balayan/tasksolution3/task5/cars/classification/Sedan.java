package ru.epam.balayan.tasksolution3.task5.cars.classification;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.LexusES;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.PorschePanameraTurbo;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.ToyotaCorolla;

/**
 * this abstract class is the parent class for cars of this classification
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see LexusES expands
 * @see PorschePanameraTurbo expands
 * @see ToyotaCorolla expands
 * @see PassengerCar extends
 */
public abstract class Sedan extends PassengerCar {
  private String name = "Sedan";

  @Override
  public String getName() {
    return name;
  }
}
