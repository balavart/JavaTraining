package ru.epam.balayan.tasksolution3.task5.io.station;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface with operation for station's cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see SimpleStationCarsOutput implements
 * @see SimpleStationCarsSortedOutput implements
 * @see SimpleStationCarsTotalCostOutput implements
 */
public interface StationCarsOutput {

  /** method displays station's cars. */
  void displayStationCars(PassengerCar[] arr);
}
