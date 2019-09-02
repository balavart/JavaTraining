package ru.epam.balayan.tasksolution2.b.gunClasses;

import ru.epam.balayan.tasksolution2.b.contract.Shootable;

/**
 * this is implement Shootable class it describes the weapon rate of fire some Object methods of the
 * class are overridden
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/23/2019
 */
public class AK12 implements Shootable {
  private double clipСapacity = 30.0d;
  private double secondShot = 11.6d;
  private double clipEnough = 0;

  /**
   * overriding Object method for more accurate objects comparison
   *
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

  /**
   * overriding Shootable method describes the weapon rate of fire
   *
   * @see Shootable#shoot()
   */
  @Override
  public void shoot() {
    clipEnough = (int) ((clipСapacity / secondShot) * 100) / 100d;
    System.out.println(
        getClass().getSimpleName()
            + " clip shoots "
            + (int) clipСapacity
            + " bullets for "
            + clipEnough
            + " seconds");
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
}
