package balayan.taskSolution2.taskB.gunClasses;

import balayan.taskSolution2.taskB.contract.Shootable;

/**
 * this is implement Shootable class
 * it describes the weapon rate of fire
 * some Object methods of the  class are overridden
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/23/2019
 */
public class HK416 implements Shootable {
    double clipСapacity = 20.0d;
    double secondShot = 14.1d;
    double clipEnough = 0;

    /**
     * overriding Shootable method
     * describes the weapon rate of fire
     *
     * @see Shootable#shoot()
     */
    @Override
    public void shoot() {
        clipEnough = (int) ((clipСapacity / secondShot) * 100) / 100d;
        System.out.println(getClass().getSimpleName() + " clip shoots " + (int) clipСapacity + " bullets for " + clipEnough + " seconds");
    }

    /**
     * overriding Object method
     *
     * @return class name
     */
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    /**
     * overriding Object method for more accurate objects comparison
     *
     * @param obj
     * @return logical comparison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
}
