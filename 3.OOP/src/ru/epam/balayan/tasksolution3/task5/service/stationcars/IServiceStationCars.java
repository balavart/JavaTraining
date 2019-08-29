package ru.epam.balayan.tasksolution3.task5.service.stationcars;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * interface for getting car's array
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see ServiceStationCars implements
 * is created on 8/26/2019
 */
public interface IServiceStationCars {

    /**
     * @return tempCarsArr - array of cars
     */
    PassengerCar[] getCollectedСars();

}
