package ru.epam.balayan.tasksolution3.task5.service.stationcars;

import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.AudiS5;
import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.MINICabrio;
import ru.epam.balayan.tasksolution3.task5.cars.cabriolet.OpelCascada;
import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.Chrysler300;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.HammerH2;
import ru.epam.balayan.tasksolution3.task5.cars.limousine.VolkswagenBeetle;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.LexusES;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.PorschePanameraTurbo;
import ru.epam.balayan.tasksolution3.task5.cars.sedan.ToyotaCorolla;

import java.util.Random;


/**
 * implementation with conditions car's array
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IServiceStationCars implement
 * is created on 8/26/2019
 */
public class ServiceStationCars implements IServiceStationCars {

    /**
     * method add an randomly filled object array
     */
    @Override
    public PassengerCar[] getCollectedСars() {
        PassengerCar[] tempCarsArr = new PassengerCar[20];

        for (int i = 0; i < tempCarsArr.length; i++) {
            int carNum = new Random().nextInt(9);
            switch (carNum) {
                case 0:
                    tempCarsArr[i] = new LexusES();
                    break;
                case 1:
                    tempCarsArr[i] = new PorschePanameraTurbo();
                    break;
                case 2:
                    tempCarsArr[i] = new ToyotaCorolla();
                    break;
                case 3:
                    tempCarsArr[i] = new AudiS5();
                    break;
                case 4:
                    tempCarsArr[i] = new MINICabrio();
                    break;
                case 5:
                    tempCarsArr[i] = new OpelCascada();
                    break;
                case 6:
                    tempCarsArr[i] = new Chrysler300();
                    break;
                case 7:
                    tempCarsArr[i] = new HammerH2();
                    break;
                case 8:
                    tempCarsArr[i] = new VolkswagenBeetle();
                    break;
                default:
                    System.out.println("Error! No cars avaible.");
                    break;
            }
        }

        return tempCarsArr;
    }

}
