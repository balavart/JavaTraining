package ru.epam.balayan.tasksolution3.task5.io.stationcars;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface with operation for station's cars output
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see StationCarsOutput implements
 * @see StationCarsSortedOutput implements
 * @see StationCarsTotalCostOutput implements
 */
public interface IStationCarsOutput {

  /** method displays station's cars */
  void displayStationCars(PassengerCar[] arr);
}
