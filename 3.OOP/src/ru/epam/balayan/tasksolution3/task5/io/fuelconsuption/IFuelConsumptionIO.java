package ru.epam.balayan.tasksolution3.task5.io.fuelconsuption;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * interface with operation for fuel input and cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see FuelConsumptionIO implements
 * is created on 8/26/2019
 */
public interface IFuelConsumptionIO {

    /**
     * @return user specified fuel consumption
     */
    double getUserFuelConsumption(PassengerCar[] station, double minNum, double maxNum);

    /**
     * method displays cars in the user specified fuel consumption range
     */
    void displayFuelConsumptionRange(PassengerCar[] station, double startNum, double finalNum);

}
