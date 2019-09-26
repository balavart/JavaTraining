package ru.epam.balayan.tasksolution2.b.contract;

import ru.epam.balayan.tasksolution2.b.guns.AK12;
import ru.epam.balayan.tasksolution2.b.guns.HK416;

/**
 * this interface is contract between gun classes.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/23/2019
 * @see AK12 implement
 * @see HK416 implement
 */
public interface Shootable {
  void shoot();
}
