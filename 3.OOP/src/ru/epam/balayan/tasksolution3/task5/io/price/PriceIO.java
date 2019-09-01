package ru.epam.balayan.tasksolution3.task5.io.price;

import ru.epam.balayan.tasksolution3.task5.cars.contract.PassengerCar;

import java.io.BufferedReader;
import java.io.IOException;


/**
 * implementation with conditions price input and cars output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IPriceIO implement
 * is created on 8/26/2019
 */
public class PriceIO implements IPriceIO {

    private BufferedReader reader;

    public PriceIO(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public int getUserPrice(int minPrice, int maxPrice) {
        boolean digit = false;
        String price = null;
        System.out.println("Type starting and final prices: ");
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
            } catch (NumberFormatException | IOException e) {
                System.err.println("Type price range from: " + minPrice + " to " + maxPrice);
            }
        }
        return Integer.parseInt(price);
    }

    @Override
    public void displayCarsPriceRange(PassengerCar[] paramStation, int startPrice, int finalPrice) {
        int carNumAvaible = 0;
        System.out.println("Car list in the price range from " + startPrice + "$ to " + finalPrice + "$: ");
        for (int i = 0; i < paramStation.length; i++) {
            if (startPrice <= paramStation[i].getPrice() && finalPrice >= paramStation[i].getPrice()) {
                System.out.println(paramStation[i]);
                carNumAvaible++;
            }
        }
        System.out.println(carNumAvaible + " cars available" + "\n");
    }

}
