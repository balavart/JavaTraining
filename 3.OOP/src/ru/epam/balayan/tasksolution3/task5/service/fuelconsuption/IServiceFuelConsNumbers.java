package ru.epam.balayan.tasksolution3.task5.service.fuelconsuption;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * interface for getting fuel consumption numbers
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see ServiceFuelConsNumbers implements
 * is created on 8/26/2019
 */
public interface IServiceFuelConsNumbers {

    /**
     * @return the minimum car fuel consumption
     */
    double getMinFuelConsumption(PassengerCar[] arr);

    /**
     * @return the maximum car fuel consumption
     */
    double getMaxFuelConsumption(PassengerCar[] arr);

}
