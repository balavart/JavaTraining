package ru.epam.balayan.tasksolution3.task5.cars.classification;

import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.AudiS5;
import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.MiniCabrio;
import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.OpelCascada;
import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * this abstract class is the parent class for cars of this classification.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see AudiS5 expands
 * @see MiniCabrio expands
 * @see OpelCascada expands
 * @see PassengerCar extends
 */
public abstract class Cabriolet extends PassengerCar {
  private String name = "Cabriolet";

  @Override
  public String getName() {
    return name;
  }
}