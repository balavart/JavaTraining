package balayan.taskSolution3_5;

import balayan.taskSolution3_5.contract.PassengerCar;
import balayan.taskSolution3_5.сarСlassification.cabriolet.AudiS5;
import balayan.taskSolution3_5.сarСlassification.cabriolet.MINICabrio;
import balayan.taskSolution3_5.сarСlassification.cabriolet.OpelCascada;
import balayan.taskSolution3_5.сarСlassification.limousine.Chrysler300;
import balayan.taskSolution3_5.сarСlassification.limousine.HammerH2;
import balayan.taskSolution3_5.сarСlassification.limousine.VolkswagenBeetle;
import balayan.taskSolution3_5.сarСlassification.sedan.LexusES;
import balayan.taskSolution3_5.сarСlassification.sedan.PorschePanameraTurbo;
import balayan.taskSolution3_5.сarСlassification.sedan.ToyotaCorolla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * this is a work class
 * this class displays objects according to a given range of parameters
 * main logic is in here
 * used by classes
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/26/2019
 * @see TaxiStation
 * @see StartTaskSolution3_5
 */
public class WorkClass {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @return the generated object for wrapper class
     * @see TaxiStation
     */
    static PassengerCar getCar() {
        PassengerCar car = null;

        int carNum = new Random().nextInt(9);
        switch (carNum) {
            case 0:
                car = new LexusES();
                break;
            case 1:
                car = new PorschePanameraTurbo();
                break;
            case 2:
                car = new ToyotaCorolla();
                break;
            case 3:
                car = new AudiS5();
                break;
            case 4:
                car = new MINICabrio();
                break;
            case 5:
                car = new OpelCascada();
                break;
            case 6:
                car = new Chrysler300();
                break;
            case 7:
                car = new HammerH2();
                break;
            case 8:
                car = new VolkswagenBeetle();
                break;
        }

        return car;
    }

    /**
     * method add an randomly filled object array
     * use static method to fill an array
     *
     * @return array of cars
     * @see WorkClass#getCar()
     */
    static PassengerCar[] getCollectedСars() {
        PassengerCar[] tempArr = new PassengerCar[20];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = getCar();
        }
        return tempArr;
    }

    /**
     * method sorts cars by fuel consumption
     *
     * @param station
     */
    void sortCars(PassengerCar[] station) {
        Arrays.sort(station, Comparator.comparing(PassengerCar::getFuelСonsumption));
    }


    /**
     * @param paramStation
     * @return the minimum car price
     */
    int getMinPrice(PassengerCar[] paramStation) {
        int min = paramStation[0].getPrice();

        for (int i = 0; i < paramStation.length; i++) {
            if (min > paramStation[i].getPrice()) {
                min = paramStation[i].getPrice();
            }
        }
        return min;
    }

    /**
     * @param paramStation
     * @return the maximum car price
     */
    int getMaxPrice(PassengerCar[] paramStation) {
        int max = paramStation[0].getPrice();

        for (int i = 0; i < paramStation.length; i++) {
            if (max < paramStation[i].getPrice()) {
                max = paramStation[i].getPrice();
            }
        }
        return max;
    }

    /**
     * @param paramStation
     * @return user specified price
     */
    int getUserPrice(PassengerCar[] paramStation) {
        boolean digit = false;
        String price = null;
        int minPrice = getMinPrice(paramStation);
        int maxPrice = getMaxPrice(paramStation);

        while (!digit) {
            try {
                price = reader.readLine();
                for (int i = 0; i < price.length(); i++) {
                    if (!Character.isDigit(price.charAt(i)) || price.isEmpty()) {
                        digit = false;
                        System.err.println("Type a number!");
                        break;
                    } else if (Integer.parseInt(price) < minPrice || Integer.parseInt(price) > maxPrice) {
                        digit = false;
                        System.err.println("Type price range from : " + minPrice + " to " + maxPrice);
                        break;
                    } else {
                        digit = true;
                        break;
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Type price range from: " + minPrice + " to " + maxPrice);
            }
        }
        return Integer.parseInt(price);
    }

    /**
     * method displays cars in the user specified price range
     *
     * @param paramStation
     * @return number of cars in the range
     */
    int displayCarsPriceRange(PassengerCar[] paramStation) {
        int startPrice = 0;
        int finalPrice = 0;
        int carNumAvaible = 0;

        System.out.println("Type starting price: ");
        startPrice = getUserPrice(paramStation);
        System.out.println("Type the final price: ");
        finalPrice = getUserPrice(paramStation);

        System.out.println("Car list in the price range from " + startPrice + "$ to " + finalPrice + "$: ");
        for (int i = 0; i < paramStation.length; i++) {
            if (startPrice <= paramStation[i].getPrice() && finalPrice >= paramStation[i].getPrice()) {
                System.out.println(paramStation[i]);
                carNumAvaible++;
            }
        }
        return carNumAvaible;
    }


    /**
     * @param paramStation
     * @return the minimum car fuel consumption
     */
    double getMinFuelConsumption(PassengerCar[] paramStation) {
        double min = paramStation[0].getFuelСonsumption();

        for (int i = 0; i < paramStation.length; i++) {
            if (min > paramStation[i].getFuelСonsumption()) {
                min = paramStation[i].getFuelСonsumption();
            }
        }
        return min;
    }

    /**
     * @param paramStation
     * @return the maximum car fuel consumption
     */
    double getMaxFuelConsumption(PassengerCar[] paramStation) {
        double max = paramStation[0].getFuelСonsumption();

        for (int i = 0; i < paramStation.length; i++) {
            if (max < paramStation[i].getFuelСonsumption()) {
                max = paramStation[i].getFuelСonsumption();
            }
        }
        return max;
    }

    /**
     * @param paramStation
     * @return user specified fuel consumption
     */
    double getUserFuelConsumption(PassengerCar[] paramStation) {
        boolean digit = false;
        String fuelConsumption = null;
        double minFuelConsumption = getMinFuelConsumption(paramStation);
        double maxFuelConsumption = getMaxFuelConsumption(paramStation);

        while (!digit) {
            try {
                fuelConsumption = reader.readLine();
                for (int i = 0; i < fuelConsumption.length(); i++) {
                    if (!Character.isDigit(fuelConsumption.charAt(i)) || fuelConsumption.isEmpty()) {
                        digit = false;
                        System.err.println("Type a number!");
                        break;
                    } else if (Double.parseDouble(fuelConsumption) < minFuelConsumption
                            || Double.parseDouble(fuelConsumption) > maxFuelConsumption) {
                        digit = false;
                        System.err.println("Type fuel consumption range from : " + minFuelConsumption
                                + " to " + maxFuelConsumption);
                        break;
                    } else {
                        digit = true;
                        break;
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Type fuel consumption range from : " + minFuelConsumption
                        + " to " + maxFuelConsumption);
            }
        }
        return Double.parseDouble(fuelConsumption);
    }

    /**
     * method displays cars in the user specified fuel consumption range
     *
     * @param paramStation
     * @return number of cars in the range
     */
    int displayCarsFuelConsumptionRange(PassengerCar[] paramStation) {
        double startFuelConsumption = 0.0d;
        double finalFuelConsumption = 0.0d;
        int carNumAvaible = 0;

        System.out.println("Type starting fuel consumption: ");
        startFuelConsumption = getUserFuelConsumption(paramStation);
        System.out.println("Type the final fuel consumption: ");
        finalFuelConsumption = getUserFuelConsumption(paramStation);

        System.out.println("Car list in the fuel consumption range from " + startFuelConsumption
                + " L/100 km to " + finalFuelConsumption + " L/100 km: ");
        for (int i = 0; i < paramStation.length; i++) {
            if (startFuelConsumption <= paramStation[i].getFuelСonsumption()
                    && finalFuelConsumption >= paramStation[i].getFuelСonsumption()) {
                System.out.println(paramStation[i]);
                carNumAvaible++;
            }
        }
        return carNumAvaible;
    }


    /**
     * @param paramStation
     * @return user specified car classification name
     */
    String getUserCarName(PassengerCar[] paramStation) {
        String carClassName = null;
        String[] carClassNames = {"Cabriolet", "Limousine", "Sedan"};

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

    /**
     * method displays cars by user-specified name
     *
     * @param paramStation
     * @return number of cars in the range
     */
    int displayCarsName(PassengerCar[] paramStation) {
        String carClassName = null;
        int carNumAvaible = 0;

        System.out.println("Type car classification name: ");
        carClassName = getUserCarName(paramStation);

        System.out.println("Car list with classification: " + carClassName);
        for (int i = 0; i < paramStation.length; i++) {
            if (carClassName.charAt(0) == paramStation[i].getName().charAt(0)
                    || Math.abs((int) carClassName.charAt(0) - (int) paramStation[i].getName().charAt(0)) == 32) {
                System.out.println(paramStation[i]);
                carNumAvaible++;
            }
        }
        return carNumAvaible;
    }


    /**
     * method allows the user to search by filters
     *
     * @param station
     */
    void displayUserFilterChoice(PassengerCar[] station) {
        String choice = null;
        String filterSelect = "Current filters: name, price and fuel consumption." + "\n"
                + "Type 'n' to search by name." + "\n"
                + "Type 'p' to search by price." + "\n"
                + "Type 'f' to search by fuel consumption." + "\n"
                + "Type 'e' to exit the program.";

        System.out.println(filterSelect);
        while (true) {
            try {
                choice = reader.readLine();
                if (choice.isEmpty()) {
                    System.err.println("Type string filter!");
                    System.out.println(filterSelect);
                    continue;
                }
                if (choice.charAt(0) != 'n'
                        && choice.charAt(0) != 'p'
                        && choice.charAt(0) != 'f'
                        && choice.charAt(0) != 'e') {
                    System.err.println("Type filter!");
                    System.out.println(filterSelect);
                    continue;
                }
                if (choice.charAt(0) == 'n') {
                    System.out.println(displayCarsName(station) + " cars available" + "\n");
                    System.out.println(filterSelect);
                    continue;
                }
                if (choice.charAt(0) == 'p') {
                    System.out.println(displayCarsPriceRange(station) + " cars available" + "\n");
                    System.out.println(filterSelect);
                    continue;
                }
                if (choice.charAt(0) == 'f') {
                    System.out.println(displayCarsFuelConsumptionRange(station) + " cars available" + "\n");
                    System.out.println(filterSelect);
                    continue;
                }
                if (choice.charAt(0) == 'e') {
                    System.out.println("Program closing.");
                    break;
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    /**
     * method closes keyboard input stream
     */
    void closeBufReadStream() {
        try {
            reader.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /**
     * method for displaying the necessary information of a taxi fleet and for working with user requests
     *
     * @param station
     */
    void display(PassengerCar[] station) {
        int totalCost = 0;
        int carNumAvaible = 0;

        for (PassengerCar cars : station) {
            totalCost += cars.getPrice();
        }
        System.out.println("Total cost the taxi fleet is: " + totalCost + "$" + "\n");

        System.out.println("Car list: ");
        for (PassengerCar cars : station) {
            System.out.println(cars);

            carNumAvaible++;
        }
        System.out.println(carNumAvaible + " cars available" + "\n");
        carNumAvaible = 0;

        System.out.println("Car sorted list by fuel consumption: ");
        sortCars(station);
        for (PassengerCar cars : station) {
            System.out.println(cars);
            carNumAvaible++;
        }
        System.out.println(carNumAvaible + " cars available" + "\n");

        displayUserFilterChoice(station);

        closeBufReadStream();
    }
}

