package ru.epam.balayan.tasksolution3.task5.model;

import ru.epam.balayan.tasksolution3.task5.io.fuelconsuption.IFuelConsumptionIO;
import ru.epam.balayan.tasksolution3.task5.io.name.ICarNameIO;
import ru.epam.balayan.tasksolution3.task5.io.price.IPriceIO;
import ru.epam.balayan.tasksolution3.task5.io.stationcars.IStationCarsOutput;
import ru.epam.balayan.tasksolution3.task5.service.fuelconsuption.IServiceFuelConsNumbers;
import ru.epam.balayan.tasksolution3.task5.service.price.IServicePriceNumbers;
import ru.epam.balayan.tasksolution3.task5.service.stationcars.IServiceStationCars;
import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

import java.io.BufferedReader;
import java.io.IOException;


/**
 * this class is a controller between interfaces
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/26/2019
 */
public class Model {

    String userCarName;
    int minPrice, maxPrice, startUserPriceNumber, finalUserPriceNumber;
    double minFuelCons, maxFuelCons, startUserFuelConsNum, finalUserFuelConsNum;

    public Model() {
    }

    /**
     * initializes the field by calling the interface with operation for car name input and cars output
     *
     * @see ICarNameIO
     */
    public Model(ICarNameIO io) {
        this.userCarName = io.getUserCarName();
    }

    /**
     * initializes the fields by calling the interface with operation for price input and cars output
     * initializes the fields by calling the interface for getting price numbers
     *
     * @see IPriceIO
     * @see IServicePriceNumbers
     */
    public Model(PassengerCar[] station, IPriceIO io, IServicePriceNumbers numbers) {
        this.minPrice = numbers.getMinPrice(station);
        this.maxPrice = numbers.getMaxPrice(station);
        this.startUserPriceNumber = io.getUserPrice(minPrice, maxPrice);
        this.finalUserPriceNumber = io.getUserPrice(minPrice, maxPrice);
    }

    /**
     * initializes the fields by calling the interface with operation for fuel input and cars output
     * initializes the fields by calling the interface for getting fuel consumption numbers
     *
     * @see IFuelConsumptionIO
     * @see IServiceFuelConsNumbers
     */
    public Model(PassengerCar[] station, IFuelConsumptionIO io, IServiceFuelConsNumbers numbers) {
        this.minFuelCons = numbers.getMinFuelConsumption(station);
        this.maxFuelCons = numbers.getMaxFuelConsumption(station);
        this.startUserFuelConsNum = io.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
        this.finalUserFuelConsNum = io.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
    }

    /**
     * initializes all fields, calling all interfaces
     * HACK: constructor is used to quickly call objects
     */
    public Model(PassengerCar[] station, ICarNameIO carNameIO,
                 IPriceIO priceIO, IServicePriceNumbers priceNumbers,
                 IFuelConsumptionIO fuelConsumptionIO, IServiceFuelConsNumbers fuelConsNumbers) {
        this.userCarName = carNameIO.getUserCarName();
        this.minPrice = priceNumbers.getMinPrice(station);
        this.maxPrice = priceNumbers.getMaxPrice(station);
        this.startUserPriceNumber = priceIO.getUserPrice(minPrice, maxPrice);
        this.finalUserPriceNumber = priceIO.getUserPrice(minPrice, maxPrice);
        this.minFuelCons = fuelConsNumbers.getMinFuelConsumption(station);
        this.maxFuelCons = fuelConsNumbers.getMaxFuelConsumption(station);
        this.startUserFuelConsNum = fuelConsumptionIO.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
        this.finalUserFuelConsNum = fuelConsumptionIO.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
    }

    public PassengerCar[] getCollectedCars(IServiceStationCars stationCars) {
        return stationCars.getCollectedСars();
    }

    public void resultStationCars(PassengerCar[] station, IStationCarsOutput output) {
        output.displayStationCars(station);
    }

    public void resultCarsName(PassengerCar[] station, ICarNameIO io) {
        io.displayCarsName(station, userCarName);
    }

    public void resultCarsPriceRange(PassengerCar[] station, IPriceIO io) {
        io.displayCarsPriceRange(station, startUserPriceNumber, finalUserPriceNumber);
    }

    public void resultFuelConsumptionRange(PassengerCar[] station, IFuelConsumptionIO io) {
        io.displayFuelConsumptionRange(station, startUserFuelConsNum, finalUserFuelConsNum);
    }

    public void resultCars(PassengerCar[] station, IStationCarsOutput totalCost, IStationCarsOutput cars,
                           IStationCarsOutput sortedCars) {
        totalCost.displayStationCars(station);
        cars.displayStationCars(station);
        sortedCars.displayStationCars(station);
    }

    public void resultFilter(PassengerCar[] station, ICarNameIO carsNameIO, IPriceIO priceIO,
                             IFuelConsumptionIO fuelConsIO) {
        carsNameIO.displayCarsName(station, userCarName);
        priceIO.displayCarsPriceRange(station, startUserPriceNumber, finalUserPriceNumber);
        fuelConsIO.displayFuelConsumptionRange(station, startUserFuelConsNum, finalUserFuelConsNum);

    }

    /**
     * method closes keyboard input stream
     */
    public void closeBufReadStream(BufferedReader reader) {
        try {
            reader.close();
            System.out.println("End of program.");
        } catch (IOException e) {
            System.out.println(e.getMessage() + "End of program.");
        }
    }

}