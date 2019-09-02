package ru.epam.balayan.tasksolution4.printer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * interface with operation for date times output
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see OutPutStudentTime implements
 */
public interface IPrinterDatetime {

  /** method display student's task date time and current date time */
  void outPutDates(LocalDateTime startDate, LocalDateTime endDate, DateTimeFormatter formatter);

  /** method display remaining or past date time */
  void outPutDatetimeResult(long balanceHours, String name, String secondName);
}
