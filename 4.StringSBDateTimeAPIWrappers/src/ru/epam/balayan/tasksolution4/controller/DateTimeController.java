package ru.epam.balayan.tasksolution4.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ru.epam.balayan.tasksolution4.dates.WorkDates;
import ru.epam.balayan.tasksolution4.hours.WorkHours;
import ru.epam.balayan.tasksolution4.printer.PrinterDatetime;
import ru.epam.balayan.tasksolution4.students.Student;

/**
 * this class is a controller between interfaces.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 */
public class DateTimeController {
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private long fullWorkDaysHours;
  private long balanceHours;
  private short firstWorkDayHours;
  private short endWorkDayHours;

  /** initializes all fields, calling all interfaces constructor is used to quickly call objects. */
  public DateTimeController(
      WorkDates workDates, WorkHours workHours, Student student, DateTimeFormatter formatter) {
    this.startDate = workDates.getStartDate(student.getTaskDate(), formatter);
    this.endDate = workDates.getEndDate();
    this.fullWorkDaysHours = workHours.getFullWorkDaysHours(startDate, endDate);
    this.firstWorkDayHours = workHours.getFirstWorkDayHours(startDate);
    this.endWorkDayHours = workHours.getEndWorkDayHours(endDate);
    this.balanceHours =
        workHours.getBalanceHours(
            student.getCourseHours(), fullWorkDaysHours, firstWorkDayHours, endWorkDayHours);
  }

  /** student's task date time and current date time output remaining or past date time output. */
  public void outPutTimeResult(
      PrinterDatetime outPut, Student student, DateTimeFormatter formatter) {
    outPut.outPutDatetimeResult(balanceHours, student.getName(), student.getCurricullum());
    outPut.outPutDates(startDate, endDate, formatter);
  }
}
