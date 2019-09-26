package ru.epam.balayan.tasksolution3.task5.io.name;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

/**
 * implementation with conditions car name input and cars output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/26/2019
 * @see CarNameIO implement
 */
public class SimpleCarNameIO implements CarNameIO {
  private BufferedReader reader;

  public SimpleCarNameIO(BufferedReader reader) {
    this.reader = reader;
  }

  @Override
  public void displayCarsName(PassengerCar[] station, String carClassName) {
    int carNumAvaible = 0;

    System.out.println("Car list with classification: " + carClassName);

    try {
      for (PassengerCar passengerCar : station) {
        if ((carClassName.charAt(0) == passengerCar.getName().charAt(0))
            || (Math.abs((int) carClassName.charAt(0) - (int) passengerCar.getName().charAt(0))
            == 32)) {
          System.out.println(passengerCar);
          carNumAvaible++;
        }
      }
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(carNumAvaible + " cars available" + "\n");
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
}
