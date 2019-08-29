package ru.epam.balayan.tasksolution2.b.contract;


import ru.epam.balayan.tasksolution2.b.gunClasses.AK12;
import ru.epam.balayan.tasksolution2.b.gunClasses.HK416;

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
