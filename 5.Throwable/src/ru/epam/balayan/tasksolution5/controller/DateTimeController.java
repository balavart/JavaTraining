package ru.epam.balayan.tasksolution5.controller;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ru.epam.balayan.tasksolution5.dates.WorkDates;
import ru.epam.balayan.tasksolution5.hours.WorkHours;
import ru.epam.balayan.tasksolution5.printer.PrinterDatetime;
import ru.epam.balayan.tasksolution5.students.Student;

/**
 * This class is a controller between interfaces.
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

  /**
   * Initializes all fields, calling all interfaces. Constructor is used to quickly call objects.
   * Exception handling declared.
   */
  public DateTimeController(
      WorkDates workDates, WorkHours workHours, Student student, DateTimeFormatter formatter) {
    try {
      this.startDate = workDates.getStartDate(student.getTaskDate(), formatter);
      this.firstWorkDayHours = workHours.getFirstWorkDayHours(startDate);
    } catch (NullPointerException | IllegalArgumentException | DateTimeException e) {
      startDate = null;
      firstWorkDayHours = 0;
    }

    try {
      this.endDate = workDates.getEndDate();
      this.endWorkDayHours = workHours.getEndWorkDayHours(endDate);
      this.fullWorkDaysHours = workHours.getFullWorkDaysHours(startDate, endDate);
      this.balanceHours =
          workHours.getBalanceHours(
              student.getCourseHours(), fullWorkDaysHours, firstWorkDayHours, endWorkDayHours);
    } catch (NullPointerException e) {
      endDate = null;
      endWorkDayHours = 0;
      fullWorkDaysHours = 0;
      balanceHours = 0;
    }
  }

  /**
   * Student's task date time and current date time output remaining or past date time output.
   * Exception handling declared.
   */
  public void outPutTimeResult(
      PrinterDatetime outPut, Student student, DateTimeFormatter formatter) {
    try {
      outPut.outPutDatetimeResult(balanceHours, student.getName(), student.getCurricullum());
      outPut.outPutDates(startDate, endDate, formatter);
    } catch (NullPointerException | IllegalArgumentException | DateTimeException e) {
      System.err.println(e.getMessage());
    }
  }
}
