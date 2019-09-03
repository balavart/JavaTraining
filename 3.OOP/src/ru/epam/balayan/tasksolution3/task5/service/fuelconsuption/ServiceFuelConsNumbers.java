package ru.epam.balayan.tasksolution3.task5.service.fuelconsuption;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * implementation with conditions fuel consumption numbers.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see IServiceFuelConsNumbers implement
 */
public class ServiceFuelConsNumbers implements IServiceFuelConsNumbers {
  @Override
  public double getMaxFuelConsumption(PassengerCar[] station) {
    double max = station[0].getFuelСonsumption();

    for (int i = 0; i < station.length; i++) {
      if (max < station[i].getFuelСonsumption()) {
        max = station[i].getFuelСonsumption();
      }
    }

    return max;
  }

  @Override
  public double getMinFuelConsumption(PassengerCar[] station) {
    double min = station[0].getFuelСonsumption();

    for (int i = 0; i < station.length; i++) {
      if (min > station[i].getFuelСonsumption()) {
        min = station[i].getFuelСonsumption();
      }
    }

    return min;
  }
}
