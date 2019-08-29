package ru.epam.balayan.tasksolution3.task5.io.name;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * interface with operation for car name input and cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see CarNameIO implements
 * is created on 8/26/2019
 */
public interface ICarNameIO {

    /**
     * @return user specified car classification name
     */
    String getUserCarName();

    /**
     * method displays cars by user-specified name
     */
    void displayCarsName(PassengerCar[] arr, String str);

}
