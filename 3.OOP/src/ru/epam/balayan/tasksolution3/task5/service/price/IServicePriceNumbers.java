package ru.epam.balayan.tasksolution3.task5.service.price;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * interface for getting price numbers
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see ServicePriceNumbers implements
 * is created on 8/26/2019
 */
public interface IServicePriceNumbers {

    /**
     * @return the minimum car price
     */
    int getMinPrice(PassengerCar[] arr);

    /**
     * @return the maximum car price
     */
    int getMaxPrice(PassengerCar[] arr);

}
