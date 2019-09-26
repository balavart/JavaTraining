package ru.epam.balayan.tasksolution3.task5.service.price;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * implementation with conditions price numbers.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see PriceNumbers implement
 */
public class ServicePriceNumbers implements PriceNumbers {
  @Override
  public int getMaxPrice(PassengerCar[] station) {
    int max = station[0].getPrice();

    for (PassengerCar passengerCar : station) {
      if (max < passengerCar.getPrice()) {
        max = passengerCar.getPrice();
      }
    }

    return max;
  }

  @Override
  public int getMinPrice(PassengerCar[] station) {
    int min = station[0].getPrice();

    for (PassengerCar passengerCar : station) {
      if (min > passengerCar.getPrice()) {
        min = passengerCar.getPrice();
      }
    }

    return min;
  }
}
