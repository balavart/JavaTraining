package ru.epam.balayan.tasksolution3.task5.io.stationcars;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * implementation with conditions station's cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IStationCarsOutput implement
 * is created on 8/26/2019
 */
public class StationCarsOutput implements IStationCarsOutput {

    @Override
    public void displayStationCars(PassengerCar[] station) {
        int carNumAvaible = 0;

        System.out.println("Car list: ");
        for (PassengerCar cars : station) {
            System.out.println(cars);
            carNumAvaible++;
        }

        System.out.println(carNumAvaible + " cars available" + "\n");
    }

}
