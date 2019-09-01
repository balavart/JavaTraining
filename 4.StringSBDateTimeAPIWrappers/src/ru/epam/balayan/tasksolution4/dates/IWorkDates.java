package ru.epam.balayan.tasksolution4.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * interface for getting starting and final dates
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see WorkDates implements
 * is created on 8/31/2019
 */
public interface IWorkDates {

    /**
     * @return the start formatted date of the student task
     */
    LocalDateTime getStartDate(String taskDate, DateTimeFormatter formatter);

    /**
     * @return current date
     */
    LocalDateTime getEndDate();

}
