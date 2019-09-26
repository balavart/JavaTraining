package ru.epam.balayan.tasksolution4.printer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ru.epam.balayan.tasksolution4.hours.SimpleWorkHours;

/**
 * implementation with conditions date times output.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see PrinterDatetime implement
 */
public class OutPutStudentTime implements PrinterDatetime {
  @Override
  public void outPutDates(
      LocalDateTime startDate, LocalDateTime endDate, DateTimeFormatter formatter) {
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

  @Override
  public void outPutDatetimeResult(long balanceHours, String studentName, String curricullum) {
    long daysResult = Math.abs(balanceHours / SimpleWorkHours.WORK_HOURS);
    long hoursResult = Math.abs(balanceHours % SimpleWorkHours.WORK_HOURS);
    boolean finished = balanceHours < 0;
    StringBuilder outPutResult;

    outPutResult =
        new StringBuilder(studentName)
            .append(" (")
            .append(curricullum)
            .append(") ")
            .append("- Trainig ")
            .append(finished ? "completed: " : "is not finished: ").append(daysResult)
            .append(" day(s) ")
            .append((hoursResult != 0) ? hoursResult + " hour(s) " : "")
            .append(finished ? "passed" : "left");
    System.out.println(outPutResult);
  }
}
