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

/**
 * this is object array wrapper class
 * this class is used for storage car objects
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see AudiS5
 * @see MINICabrio
 * @see OpelCascada
 * @see Chrysler300
 * @see HammerH2
 * @see VolkswagenBeetle
 * @see LexusES
 * @see PorschePanameraTurbo
 * @see ToyotaCorolla
 * is created on 8/26/2019
 */
public class TaxiStation {
    private PassengerCar[] station = WorkClass.getCollectedСars();

    public PassengerCar[] getStation() {
        return station;
    }
}
