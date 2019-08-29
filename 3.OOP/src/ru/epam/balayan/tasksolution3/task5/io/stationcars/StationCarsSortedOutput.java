package ru.epam.balayan.tasksolution3.task5.io.stationcars;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

import java.util.Arrays;
import java.util.Comparator;


/**
 * implementation with conditions station's cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IStationCarsOutput implement
 * is created on 8/26/2019
 */
public class StationCarsSortedOutput implements IStationCarsOutput {

    /**
     * method sorts and output cars by fuel consumption
     */
    @Override
    public void displayStationCars(PassengerCar[] station) {
        int carNumAvaible = 0;

        Arrays.sort(station, Comparator.comparing(PassengerCar::getFuelСonsumption));

        System.out.println("Car sorted list by fuel consumption: ");
        for (PassengerCar cars : station) {
            System.out.println(cars);
            carNumAvaible++;
        }

        System.out.println(carNumAvaible + " cars available" + "\n");
    }

}
