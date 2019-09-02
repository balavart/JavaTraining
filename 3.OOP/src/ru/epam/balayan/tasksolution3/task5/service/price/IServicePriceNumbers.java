package ru.epam.balayan.tasksolution3.task5.service.price;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface for getting price numbers
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see ServicePriceNumbers implements
 */
public interface IServicePriceNumbers {

  /** @return the maximum car price */
  int getMaxPrice(PassengerCar[] arr);

  /** @return the minimum car price */
  int getMinPrice(PassengerCar[] arr);
}
