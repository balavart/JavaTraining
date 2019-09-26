package ru.epam.balayan.tasksolution5.dates;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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

  /** declared conditions for throwing exceptions. */
  @Override
  public LocalDateTime getStartDate(String taskDate, DateTimeFormatter formatter) {
    if (taskDate == null) {
      throw new NullPointerException("No data in task date. Indicate date!");
    } else if (!((taskDate.chars().anyMatch(Character::isDigit))
        && taskDate.contains(".")
        && taskDate.contains(":")
        && taskDate.contains(" "))) {
      throw new IllegalArgumentException(
          "Task date contains an invalid format! Use format: \"dd.MM.yyyy HH:mm\"");
    }

    if (formatter == null) {
      throw new NullPointerException("No data in formatter. Indicate formatter!");
    } else if (!(formatter
        .toString()
        .equals(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm").toString()))) {
      throw new DateTimeException(
          "Formatter contains an invalid format! Use format: \"dd.MM.yyyy HH:mm\"");
    }

    LocalDateTime startDate;

    try {
      startDate = LocalDateTime.parse(taskDate, formatter);
    } catch (DateTimeParseException e) {
      StringBuilder errTaskDateFormatMessage =
          new StringBuilder("\"")
              .append(e.getParsedString())
              .append("\"")
              .append(" is invalid task date format! Use format: \"dd.MM.yyyy HH:mm\"");

      throw new DateTimeException(errTaskDateFormatMessage.toString());
    }

    if (startDate.isAfter(LocalDateTime.now())) {
      throw new DateTimeException("Task date exceeds current date. Type an early date!");
    }

    return startDate;
  }
}
