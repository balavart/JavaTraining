package ru.epam.balayan.tasksolution3.task5.service.stationcars;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface for getting car's array.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see ServiceStationCars implements
 */
public interface StationCars {

  /** get tempCarsArr array of cars. */
  PassengerCar[] getCollectedCars();
}
