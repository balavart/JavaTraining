package ru.epam.balayan.tasksolution3.task5;

import ru.epam.balayan.tasksolution3.task5.io.fuelconsumption.FuelConsumptionIO;
import ru.epam.balayan.tasksolution3.task5.io.fuelconsumption.IFuelConsumptionIO;
import ru.epam.balayan.tasksolution3.task5.io.name.CarNameIO;
import ru.epam.balayan.tasksolution3.task5.io.name.ICarNameIO;
import ru.epam.balayan.tasksolution3.task5.io.price.IPriceIO;
import ru.epam.balayan.tasksolution3.task5.io.price.PriceIO;
import ru.epam.balayan.tasksolution3.task5.io.stationcars.IStationCarsOutput;
import ru.epam.balayan.tasksolution3.task5.io.stationcars.StationCarsOutput;
import ru.epam.balayan.tasksolution3.task5.io.stationcars.StationCarsSortedOutput;
import ru.epam.balayan.tasksolution3.task5.io.stationcars.StationCarsTotalCostOutput;
import ru.epam.balayan.tasksolution3.task5.controller.StationController;
import ru.epam.balayan.tasksolution3.task5.service.fuelconsuption.IServiceFuelConsNumbers;
import ru.epam.balayan.tasksolution3.task5.service.fuelconsuption.ServiceFuelConsNumbers;
import ru.epam.balayan.tasksolution3.task5.service.price.IServicePriceNumbers;
import ru.epam.balayan.tasksolution3.task5.service.price.ServicePriceNumbers;
import ru.epam.balayan.tasksolution3.task5.service.stationcars.IServiceStationCars;
import ru.epam.balayan.tasksolution3.task5.service.stationcars.ServiceStationCars;
import ru.epam.balayan.tasksolution3.task5.station.TaxiStation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * this app is a solution for EPAM Java Training homework № 3, task 5.Taxi station
 * this is main starting app class
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/26/2019
 */
class StartTaskSolution3_5 implements AutoCloseable {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StartTaskSolution3_5 taskSolution3_5 = new StartTaskSolution3_5();
            taskSolution3_5.startApp(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * method for quickly creating and executing objects
     */
    private void startApp(BufferedReader reader) {
        IServiceStationCars stationCars = new ServiceStationCars();
        StationController stationController = new StationController();
        TaxiStation station = new TaxiStation(stationController.getCollectedCars(stationCars));
        IStationCarsOutput carsTotalCost = new StationCarsTotalCostOutput();
        IStationCarsOutput carsOutput = new StationCarsOutput();
        IStationCarsOutput sortedCarsOutput = new StationCarsSortedOutput();
        ICarNameIO carNameIO = new CarNameIO(reader);
        IPriceIO priceIO = new PriceIO(reader);
        IServicePriceNumbers priceNumbers = new ServicePriceNumbers();
        IFuelConsumptionIO fuelConsumptionIO = new FuelConsumptionIO(reader);
        IServiceFuelConsNumbers fuelConsNumbers = new ServiceFuelConsNumbers();
        stationController.resultCars(station.getStation(), carsTotalCost, carsOutput, sortedCarsOutput);
        StationController execute = new StationController(station.getStation(), carNameIO, priceIO, priceNumbers,
                fuelConsumptionIO, fuelConsNumbers);
        execute.resultFilter(station.getStation(), carNameIO, priceIO, fuelConsumptionIO);
    }

    @Override
    public void close() {
        System.out.println("End of program.");
    }

}



