package ru.epam.balayan.tasksolution3.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ru.epam.balayan.tasksolution3.task5.controller.StationController;
import ru.epam.balayan.tasksolution3.task5.io.fuel.FuelConsumptionIO;
import ru.epam.balayan.tasksolution3.task5.io.fuel.SimpleFuelConsumptionIO;
import ru.epam.balayan.tasksolution3.task5.io.name.CarNameIO;
import ru.epam.balayan.tasksolution3.task5.io.name.SimpleCarNameIO;
import ru.epam.balayan.tasksolution3.task5.io.price.PriceIO;
import ru.epam.balayan.tasksolution3.task5.io.price.SimplePriceIO;
import ru.epam.balayan.tasksolution3.task5.io.station.SimpleStationCarsOutput;
import ru.epam.balayan.tasksolution3.task5.io.station.SimpleStationCarsSortedOutput;
import ru.epam.balayan.tasksolution3.task5.io.station.SimpleStationCarsTotalCostOutput;
import ru.epam.balayan.tasksolution3.task5.io.station.StationCarsOutput;
import ru.epam.balayan.tasksolution3.task5.service.fuel.FuelConsNumbers;
import ru.epam.balayan.tasksolution3.task5.service.fuel.ServiceFuelConsNumbers;
import ru.epam.balayan.tasksolution3.task5.service.price.PriceNumbers;
import ru.epam.balayan.tasksolution3.task5.service.price.ServicePriceNumbers;
import ru.epam.balayan.tasksolution3.task5.service.stationcars.ServiceStationCars;
import ru.epam.balayan.tasksolution3.task5.service.stationcars.StationCars;
import ru.epam.balayan.tasksolution3.task5.station.TaxiStation;

/**
 * this app is a solution for EPAM Java Training homework № 3, task 5.Taxi station. This is main
 * starting app class.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 */
class StartTaskSolution3 implements AutoCloseable {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      StartTaskSolution3 taskSolution3 = new StartTaskSolution3();
      taskSolution3.startApp(reader);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void close() {
    System.out.println("End of program.");
  }

  /** method for quickly creating and executing objects. */
  private void startApp(BufferedReader reader) {
    StationCars stationCars = new ServiceStationCars();
    StationController stationController = new StationController();
    TaxiStation station = new TaxiStation(stationController.getCollectedCars(stationCars));
    StationCarsOutput carsTotalCost = new SimpleStationCarsTotalCostOutput();
    StationCarsOutput carsOutput = new SimpleStationCarsOutput();
    StationCarsOutput sortedCarsOutput = new SimpleStationCarsSortedOutput();
    CarNameIO carNameIO = new SimpleCarNameIO(reader);
    PriceIO priceIO = new SimplePriceIO(reader);
    PriceNumbers priceNumbers = new ServicePriceNumbers();
    FuelConsumptionIO fuelConsumptionIO = new SimpleFuelConsumptionIO(reader);
    FuelConsNumbers fuelConsNumbers = new ServiceFuelConsNumbers();

    stationController.resultCars(station.getStation(), carsTotalCost, carsOutput, sortedCarsOutput);

    StationController execute =
        new StationController(
            station.getStation(),
            carNameIO,
            priceIO,
            priceNumbers,
            fuelConsumptionIO,
            fuelConsNumbers);

    execute.resultFilter(station.getStation(), carNameIO, priceIO, fuelConsumptionIO);
  }
}
