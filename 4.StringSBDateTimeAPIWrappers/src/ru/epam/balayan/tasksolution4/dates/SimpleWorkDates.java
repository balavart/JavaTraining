package ru.epam.balayan.tasksolution4.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * implementation with conditions the starting and final dates.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see WorkDates implement
 */
public class SimpleWorkDates implements WorkDates {
  @Override
  public LocalDateTime getEndDate() {

    return LocalDateTime.now();
  }

  @Override
  public LocalDateTime getStartDate(String taskDate, DateTimeFormatter formatter) {
    LocalDateTime startDate;

    startDate = LocalDateTime.parse(taskDate, formatter);

    return startDate;
  }
}
