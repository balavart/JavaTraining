package ru.epam.balayan.tasksolution3.task5.controller;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;
import ru.epam.balayan.tasksolution3.task5.io.fuel.FuelConsumptionIO;
import ru.epam.balayan.tasksolution3.task5.io.name.CarNameIO;
import ru.epam.balayan.tasksolution3.task5.io.price.PriceIO;
import ru.epam.balayan.tasksolution3.task5.io.station.StationCarsOutput;
import ru.epam.balayan.tasksolution3.task5.service.fuel.FuelConsNumbers;
import ru.epam.balayan.tasksolution3.task5.service.price.PriceNumbers;
import ru.epam.balayan.tasksolution3.task5.service.stationcars.StationCars;

/**
 * this class is a controller between interfaces.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 */
public class StationController {
  private String userCarName;
  private int minPrice;
  private int maxPrice;
  private int startUserPriceNumber;
  private int finalUserPriceNumber;
  private double minFuelCons;
  private double maxFuelCons;
  private double startUserFuelConsNum;
  private double finalUserFuelConsNum;

  public StationController() {
  }

  /**
   * initializes the field by calling the interface with operation for car name input and cars
   * output.
   *
   * @see CarNameIO
   */
  public StationController(CarNameIO io) {
    this.userCarName = io.getUserCarName();
  }

  /**
   * initializes the fields by calling the interface with operation for fuel input and cars output.
   * initializes the fields by calling the interface for getting fuel consumption numbers.
   *
   * @see FuelConsumptionIO
   * @see FuelConsNumbers
   */
  public StationController(
      PassengerCar[] station, FuelConsumptionIO io, FuelConsNumbers numbers) {
    this.minFuelCons = numbers.getMinFuelConsumption(station);
    this.maxFuelCons = numbers.getMaxFuelConsumption(station);
    this.startUserFuelConsNum = io.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
    this.finalUserFuelConsNum = io.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
  }

  /**
   * initializes the fields by calling the interface with operation for price input and cars output.
   * initializes the fields by calling the interface for getting price numbers.
   *
   * @see PriceIO
   * @see PriceNumbers
   */
  public StationController(PassengerCar[] station, PriceIO io, PriceNumbers numbers) {
    this.minPrice = numbers.getMinPrice(station);
    this.maxPrice = numbers.getMaxPrice(station);
    this.startUserPriceNumber = io.getUserPrice(minPrice, maxPrice);
    this.finalUserPriceNumber = io.getUserPrice(minPrice, maxPrice);
  }

  /** initializes all fields, calling all interfaces constructor is used to quickly call objects. */
  public StationController(
      PassengerCar[] station,
      CarNameIO carNameIO,
      PriceIO priceIO,
      PriceNumbers priceNumbers,
      FuelConsumptionIO fuelConsumptionIO,
      FuelConsNumbers fuelConsNumbers) {
    this.userCarName = carNameIO.getUserCarName();
    this.minPrice = priceNumbers.getMinPrice(station);
    this.maxPrice = priceNumbers.getMaxPrice(station);
    this.startUserPriceNumber = priceIO.getUserPrice(minPrice, maxPrice);
    this.finalUserPriceNumber = priceIO.getUserPrice(minPrice, maxPrice);
    this.minFuelCons = fuelConsNumbers.getMinFuelConsumption(station);
    this.maxFuelCons = fuelConsNumbers.getMaxFuelConsumption(station);
    this.startUserFuelConsNum =
        fuelConsumptionIO.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
    this.finalUserFuelConsNum =
        fuelConsumptionIO.getUserFuelConsumption(station, minFuelCons, maxFuelCons);
  }

  /** display cars. */
  public void resultCars(
      PassengerCar[] station,
      StationCarsOutput totalCost,
      StationCarsOutput cars,
      StationCarsOutput sortedCars) {
    totalCost.displayStationCars(station);
    cars.displayStationCars(station);
    sortedCars.displayStationCars(station);
  }

  public void resultCarsName(PassengerCar[] station, CarNameIO io) {
    io.displayCarsName(station, userCarName);
  }

  /** display cars in price range. */
  public void resultCarsPriceRange(PassengerCar[] station, PriceIO io) {
    io.displayCarsPriceRange(station, startUserPriceNumber, finalUserPriceNumber);
  }

  /** display car names, cars in price range, cars in fuel cons range. */
  public void resultFilter(
      PassengerCar[] station,
      CarNameIO carsNameIO,
      PriceIO priceIO,
      FuelConsumptionIO fuelConsIO) {
    carsNameIO.displayCarsName(station, userCarName);
    priceIO.displayCarsPriceRange(station, startUserPriceNumber, finalUserPriceNumber);
    fuelConsIO.displayFuelConsumptionRange(station, startUserFuelConsNum, finalUserFuelConsNum);
  }

  public void resultFuelConsumptionRange(PassengerCar[] station, FuelConsumptionIO io) {
    io.displayFuelConsumptionRange(station, startUserFuelConsNum, finalUserFuelConsNum);
  }

  public void resultStationCars(PassengerCar[] station, StationCarsOutput output) {
    output.displayStationCars(station);
  }

  public PassengerCar[] getCollectedCars(StationCars stationCars) {
    return stationCars.getCollectedCars();
  }
}
