package ru.epam.balayan.tasksolution5.printer;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ru.epam.balayan.tasksolution5.hours.WorkHours;

/**
 * implementation with conditions date times output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see IPrinterDatetime implement
 */
public class OutPutStudentTime implements IPrinterDatetime {

  /** declared conditions for throwing exceptions. */
  @Override
  public void outPutDates(
      LocalDateTime startDate, LocalDateTime endDate, DateTimeFormatter formatter) {
    if (startDate == null) {
      throw new NullPointerException("No data in start date! Indicate date.");
    } else if (endDate == null) {
      throw new NullPointerException("No data in end date! Indicate date.");
    }

    if (formatter == null) {
      throw new NullPointerException("No data in formatter! Indicate formatter.");
    } else if (!(formatter
        .toString()
        .equals(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm").toString()))) {
      throw new DateTimeException(
          "Formatter contains an invalid format! Use format: \"dd.MM.yyyy HH:mm\"");
    }

    StringBuilder dates;

    dates =
        new StringBuilder("Getting task date time: ")
            .append(startDate.format(formatter))
            .append("\n")
            .append("Current date time: ")
            .append(endDate.format(formatter))
            .append("\n");
    System.out.println(dates);
  }

  /** declared conditions for throwing exceptions. */
  @Override
  public void outPutDatetimeResult(long balanceHours, String studentName, String curricullum) {
    if ((studentName == null) || (studentName.charAt(0) == ' ') || studentName.contains("  ")) {
      throw new NullPointerException("No data in student name! Indicate name.");
    } else if (studentName.chars().allMatch(Character::isDigit)) {
      throw new IllegalArgumentException(
          "Student name contains an invalid format! Use another string format.");
    }

    if ((curricullum == null) || (curricullum.charAt(0) == ' ') || curricullum.contains("  ")) {
      throw new NullPointerException("No data in curricullum! Indicate curricullum.");
    } else if (curricullum.chars().allMatch(Character::isDigit)) {
      throw new IllegalArgumentException(
          "Curricullum contains an invalid format! Use another string format.");
    }

    long daysResult = Math.abs(balanceHours / WorkHours.WORK_HOURS);
    long hoursResult = Math.abs(balanceHours % WorkHours.WORK_HOURS);
    boolean finished = balanceHours < 0;
    StringBuilder outPutResult;

    outPutResult =
        new StringBuilder(studentName)
            .append(" (")
            .append(curricullum)
            .append(") ")
            .append("- Trainig ")
            .append(finished ? "completed: " : "is not finished: ")
            .append(daysResult + " day(s) ")
            .append((hoursResult != 0) ? hoursResult + " hour(s) " : "")
            .append(finished ? "passed" : "left");
    System.out.println(outPutResult);
  }
}
