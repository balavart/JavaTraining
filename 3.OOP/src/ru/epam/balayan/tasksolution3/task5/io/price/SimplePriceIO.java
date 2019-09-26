package ru.epam.balayan.tasksolution3.task5.io.price;

import java.io.BufferedReader;
import java.io.IOException;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * implementation with conditions price input and cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see PriceIO implement
 */
public class SimplePriceIO implements PriceIO {
  private BufferedReader reader;

  public SimplePriceIO(BufferedReader reader) {
    this.reader = reader;
  }

  @Override
  public void displayCarsPriceRange(PassengerCar[] paramStation, int startPrice, int finalPrice) {
    int carNumAvaible = 0;

    System.out.println(
        "Car list in the price range from " + startPrice + "$ to " + finalPrice + "$: ");

    for (PassengerCar passengerCar : paramStation) {
      if ((startPrice <= passengerCar.getPrice())
          && (finalPrice >= passengerCar.getPrice())) {
        System.out.println(passengerCar);
        carNumAvaible++;
      }
    }

    System.out.println(carNumAvaible + " cars available" + "\n");
  }

  @Override
  public int getUserPrice(int minPrice, int maxPrice) {
    boolean digit = false;
    String price = null;

    System.out.println("Type starting and final prices: ");

    while (!digit) {
      try {
        price = reader.readLine();

        for (int i = 0; i < price.length(); i++) {
          if (!Character.isDigit(price.charAt(i)) || price.isEmpty()) {
            digit = false;
            System.err.println("Type a number!");

            break;
          } else if ((Integer.parseInt(price) < minPrice) || (Integer.parseInt(price) > maxPrice)) {
            digit = false;
            System.err.println("Type price range from : " + minPrice + " to " + maxPrice);

            break;
          } else {
            digit = true;

            break;
          }
        }
      } catch (NumberFormatException | IOException e) {
        System.err.println("Type price range from: " + minPrice + " to " + maxPrice);
      }
    }

    return Integer.parseInt(price);
  }
}
