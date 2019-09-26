package ru.epam.balayan.tasksolution3.task5.io.fuel;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface with operation for fuel input and cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see SimpleFuelConsumptionIO implements
 */
public interface FuelConsumptionIO {

  /** method displays cars in the user specified fuel consumption range. */
  void displayFuelConsumptionRange(PassengerCar[] station, double startNum, double finalNum);

  /** get user specified fuel consumption. */
  double getUserFuelConsumption(PassengerCar[] station, double minNum, double maxNum);
}
