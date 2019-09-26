package ru.epam.balayan.tasksolution3.task5.service.fuel;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * implementation with conditions fuel consumption numbers.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see FuelConsNumbers implement
 */
public class ServiceFuelConsNumbers implements FuelConsNumbers {
  @Override
  public double getMaxFuelConsumption(PassengerCar[] station) {
    double max = station[0].getFuelConsumption();

    for (PassengerCar passengerCar : station) {
      if (max < passengerCar.getFuelConsumption()) {
        max = passengerCar.getFuelConsumption();
      }
    }

    return max;
  }

  @Override
  public double getMinFuelConsumption(PassengerCar[] station) {
    double min = station[0].getFuelConsumption();

    for (PassengerCar passengerCar : station) {
      if (min > passengerCar.getFuelConsumption()) {
        min = passengerCar.getFuelConsumption();
      }
    }

    return min;
  }
}
