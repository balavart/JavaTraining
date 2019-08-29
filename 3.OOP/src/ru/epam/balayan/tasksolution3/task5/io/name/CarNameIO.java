package ru.epam.balayan.tasksolution3.task5.io.name;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;


/**
 * implementation with conditions car name input and cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see ICarNameIO implement
 * is created on 8/26/2019
 */
public class CarNameIO implements ICarNameIO {

    private BufferedReader reader;

    public CarNameIO(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public String getUserCarName() {
        String carClassName;
        String[] carClassNames = {"Cabriolet", "Limousine", "Sedan"};

        System.out.println("Type car classification name: ");
        while (true) {
            try {
                carClassName = reader.readLine();
                if (carClassName.isEmpty()) {
                    System.err.println("Type string car classification name!");
                } else if (!carClassName.equalsIgnoreCase(carClassNames[0])
                        && !carClassName.equalsIgnoreCase(carClassNames[1])
                        && !carClassName.equalsIgnoreCase(carClassNames[2])) {
                    System.err.println("Type car classification name: " + Arrays.toString(carClassNames));
                } else {
                    break;
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        return carClassName;
    }

    @Override
    public void displayCarsName(PassengerCar[] station, String carClassName) {
        int carNumAvaible = 0;

        System.out.println("Car list with classification: " + carClassName);
        try {
            for (int i = 0; i < station.length; i++) {
                if (carClassName.charAt(0) == station[i].getName().charAt(0)
                        || Math.abs((int) carClassName.charAt(0) - (int) station[i].getName().charAt(0)) == 32) {
                    System.out.println(station[i]);
                    carNumAvaible++;
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(carNumAvaible + " cars available" + "\n");
    }

}
