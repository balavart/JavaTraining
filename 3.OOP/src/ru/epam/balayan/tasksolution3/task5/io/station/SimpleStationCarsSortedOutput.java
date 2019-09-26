package ru.epam.balayan.tasksolution3.task5.io.station;

import java.util.Arrays;
import java.util.Comparator;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * implementation with conditions station's cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see StationCarsOutput implement
 */
public class SimpleStationCarsSortedOutput implements StationCarsOutput {

  /** method sorts and output cars by fuel consumption. */
  @Override
  public void displayStationCars(PassengerCar[] station) {
    int carNumAvaible = 0;

    Arrays.sort(station, Comparator.comparing(PassengerCar::getFuelConsumption));
    System.out.println("Car sorted list by fuel consumption: ");

    for (PassengerCar cars : station) {
      System.out.println(cars);
      carNumAvaible++;
    }

    System.out.println(carNumAvaible + " cars available" + "\n");
  }
}
