package ru.epam.balayan.tasksolution3.task5.io.price;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * interface with operation for price input and cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see SimplePriceIO implements
 */
public interface PriceIO {

  /** method displays cars in the user specified price consumption range. */
  void displayCarsPriceRange(PassengerCar[] paramStation, int startNum, int finalNum);

  /** get user specified price consumption. */
  int getUserPrice(int minNum, int maxNum);
}
