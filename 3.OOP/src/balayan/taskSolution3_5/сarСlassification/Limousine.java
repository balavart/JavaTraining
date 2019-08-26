package balayan.taskSolution3_5.сarСlassification;

import balayan.taskSolution3_5.contract.PassengerCar;
import balayan.taskSolution3_5.сarСlassification.limousine.Chrysler300;
import balayan.taskSolution3_5.сarСlassification.limousine.HammerH2;
import balayan.taskSolution3_5.сarСlassification.limousine.VolkswagenBeetle;

/**
 * this abstract class is the parent class for cars of this classification
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see Chrysler300 expands
 * @see HammerH2 expands
 * @see VolkswagenBeetle expands
 * @see PassengerCar extends
 * is created on 8/26/2019
 */
public abstract class Limousine extends PassengerCar {
    private String name = "Limousine";

    @Override
    public String getName() {
        return name;
    }
}
