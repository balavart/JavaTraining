package ru.epam.balayan.tasksolution4.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * interface for getting starting and final dates.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see WorkDates implements
 */
public interface IWorkDates {

  /** get current date. */
  LocalDateTime getEndDate();

  /** get the start formatted date of the student task. */
  LocalDateTime getStartDate(String taskDate, DateTimeFormatter formatter);
}