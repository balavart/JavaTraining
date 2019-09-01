package ru.epam.balayan.tasksolution3.task5.io.fuelconsumption;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

import java.io.BufferedReader;
import java.io.IOException;


/**
 * implementation with conditions fuel input and cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IFuelConsumptionIO implement
 * is created on 8/26/2019
 */
public class FuelConsumptionIO implements IFuelConsumptionIO {

    private BufferedReader reader;

    public FuelConsumptionIO(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public double getUserFuelConsumption(PassengerCar[] station, double minFuelCons, double maxFuelCons) {
        boolean digit = false;
        String fuelConsumption = null;

        System.out.println("Type starting fuel and final consumptions: ");
        while (!digit) {
            try {
                fuelConsumption = reader.readLine();
                for (int i = 0; i < fuelConsumption.length(); i++) {
                    if (!Character.isDigit(fuelConsumption.charAt(i)) || fuelConsumption.isEmpty()) {
                        digit = false;
                        System.err.println("Type a number!");
                        break;
                    } else if (Double.parseDouble(fuelConsumption) < minFuelCons
                            || Double.parseDouble(fuelConsumption) > maxFuelCons) {
                        digit = false;
                        System.err.println("Type fuel consumption range from : " + minFuelCons + " to " + maxFuelCons);
                        break;
                    } else {
                        digit = true;
                        break;
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Type fuel consumption range from : " + minFuelCons + " to " + maxFuelCons);
            }
        }
        return Double.parseDouble(fuelConsumption);
    }

    @Override
    public void displayFuelConsumptionRange(PassengerCar[] station, double startFuelCons, double finalFuelCons) {
        int carNumAvaible = 0;

        System.out.println("Car list in the fuel consumption range from "
                + startFuelCons + " L/100 km to " + finalFuelCons + " L/100 km: ");
        for (int i = 0; i < station.length; i++) {
            if (startFuelCons <= station[i].getFuelСonsumption() && finalFuelCons >= station[i].getFuelСonsumption()) {
                System.out.println(station[i]);
                carNumAvaible++;
            }
        }
        System.out.println(carNumAvaible + " cars available" + "\n");
    }

}
