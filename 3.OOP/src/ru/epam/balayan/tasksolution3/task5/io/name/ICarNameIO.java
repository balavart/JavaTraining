package ru.epam.balayan.tasksolution3.task5.io.name;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface with operation for car name input and cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see CarNameIO implements
 */
public interface ICarNameIO {

  /** method displays cars by user-specified name. */
  void displayCarsName(PassengerCar[] arr, String str);

  /** get user specified car classification name. */
  String getUserCarName();
}

