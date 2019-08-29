package ru.epam.balayan.tasksolution3.task5.io.price;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * interface with operation for price input and cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see PriceIO implements
 * is created on 8/26/2019
 */
public interface IPriceIO {

    /**
     * @return user specified price consumption
     */
    int getUserPrice(int minNum, int maxNum);

    /**
     * method displays cars in the user specified price consumption range
     */
    void displayCarsPriceRange(PassengerCar[] paramStation, int startNum, int finalNum);

}