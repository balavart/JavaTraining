package balayan.taskSolution3_5.сarСlassification;

import balayan.taskSolution3_5.contract.PassengerCar;
import balayan.taskSolution3_5.сarСlassification.sedan.LexusES;
import balayan.taskSolution3_5.сarСlassification.sedan.PorschePanameraTurbo;
import balayan.taskSolution3_5.сarСlassification.sedan.ToyotaCorolla;

/**
 * this abstract class is the parent class for cars of this classification
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see LexusES expands
 * @see PorschePanameraTurbo expands
 * @see ToyotaCorolla expands
 * @see PassengerCar extends
 * is created on 8/26/2019
 */
public abstract class Sedan extends PassengerCar {
    private String name = "Sedan";

    @Override
    public String getName() {
        return name;
    }
}
