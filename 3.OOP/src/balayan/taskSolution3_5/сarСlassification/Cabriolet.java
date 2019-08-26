package balayan.taskSolution3_5.сarСlassification;

import balayan.taskSolution3_5.contract.PassengerCar;
import balayan.taskSolution3_5.сarСlassification.cabriolet.AudiS5;
import balayan.taskSolution3_5.сarСlassification.cabriolet.MINICabrio;
import balayan.taskSolution3_5.сarСlassification.cabriolet.OpelCascada;

/**
 * this abstract class is the parent class for cars of this classification
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see AudiS5 expands
 * @see MINICabrio expands
 * @see OpelCascada expands
 * @see PassengerCar extends
 * is created on 8/26/2019
 */
public abstract class Cabriolet extends PassengerCar {
    private String name = "Cabriolet";

    @Override
    public String getName() {
        return name;
    }
}
