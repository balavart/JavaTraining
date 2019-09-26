package ru.epam.balayan.tasksolution3.task5.service.fuel;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface for getting fuel consumption numbers.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see ServiceFuelConsNumbers implements
 */
public interface FuelConsNumbers {

  /** get the maximum car fuel consumption. */
  double getMaxFuelConsumption(PassengerCar[] arr);

  /** get the minimum car fuel consumption. */
  double getMinFuelConsumption(PassengerCar[] arr);
}
