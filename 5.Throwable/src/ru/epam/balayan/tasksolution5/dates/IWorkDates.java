package ru.epam.balayan.tasksolution5.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * interface for getting starting and final dates
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see WorkDates implements
 */
public interface IWorkDates {

  /** @return current date */
  LocalDateTime getEndDate();

  /** @return the start formatted date of the student task */
  LocalDateTime getStartDate(String taskDate, DateTimeFormatter formatter);
}
