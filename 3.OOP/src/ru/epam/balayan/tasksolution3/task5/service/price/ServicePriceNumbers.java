package ru.epam.balayan.tasksolution3.task5.service.price;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;


/**
 * implementation with conditions price numbers
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IServicePriceNumbers implement
 * is created on 8/26/2019
 */
public class ServicePriceNumbers implements IServicePriceNumbers {

    @Override
    public int getMinPrice(PassengerCar[] station) {
        int min = station[0].getPrice();

        for (int i = 0; i < station.length; i++) {
            if (min > station[i].getPrice()) {
                min = station[i].getPrice();
            }
        }

        return min;
    }

    @Override
    public int getMaxPrice(PassengerCar[] station) {
        int max = station[0].getPrice();

        for (int i = 0; i < station.length; i++) {
            if (max < station[i].getPrice()) {
                max = station[i].getPrice();
            }
        }

        return max;
    }

}
