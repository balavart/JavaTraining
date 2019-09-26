package ru.epam.balayan.tasksolution3.task5.io.station;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * implementation with conditions station's cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see StationCarsOutput implement
 */
public class SimpleStationCarsTotalCostOutput implements StationCarsOutput {

  /** method counts and output car's total cost by fuel consumption. */
  @Override
  public void displayStationCars(PassengerCar[] station) {
    int totalCost = 0;
    int carNumAvaible = 0;

    for (PassengerCar cars : station) {
      totalCost += cars.getPrice();
      carNumAvaible++;
    }

    System.out.println("Total cost the taxi fleet is: " + totalCost + "$");
    System.out.println(carNumAvaible + " cars available" + "\n");
  }
}
