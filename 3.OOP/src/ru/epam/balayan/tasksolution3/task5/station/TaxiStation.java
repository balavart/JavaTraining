package ru.epam.balayan.tasksolution3.task5.station;

import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.AudiS5;
import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.MiniCabrio;
import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.OpelCascada;
import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.Chrysler300;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.HammerH2;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.VolkswagenBeetle;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.LexusES;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.PorschePanameraTurbo;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.ToyotaCorolla;

/**
 * this is object array wrapper class this class is used for storage car objects.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see AudiS5 can be stored
 * @see MiniCabrio can be stored
 * @see OpelCascada can be storedt
 * @see Chrysler300 can be stored
 * @see HammerH2 can be stored
 * @see VolkswagenBeetle can be stored
 * @see LexusES can be stored
 * @see PorschePanameraTurbo can be stored
 * @see ToyotaCorolla can be stored
 */
public class TaxiStation {
  private PassengerCar[] station;

  /** when creating an object, an array of cars is assigned. */
  public TaxiStation(PassengerCar[] station) {
    this.station = station;
  }

  public PassengerCar[] getStation() {
    return station;
  }
}
