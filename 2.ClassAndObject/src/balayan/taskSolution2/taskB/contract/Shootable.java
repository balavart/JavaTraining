package balayan.taskSolution2.taskB.contract;

import balayan.taskSolution2.taskB.gunClasses.AK12;
import balayan.taskSolution2.taskB.gunClasses.HK416;

/**
 * this interface is contract between gun classes
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see AK12 implement
 * @see HK416 implement
 * is created on 8/23/2019
 */
public interface Shootable {
    public void shoot();
}
