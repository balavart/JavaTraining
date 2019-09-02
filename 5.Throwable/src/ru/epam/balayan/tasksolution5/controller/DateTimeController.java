package ru.epam.balayan.tasksolution5.controller;

import ru.epam.balayan.tasksolution5.dates.IWorkDates;
import ru.epam.balayan.tasksolution5.hours.IWorkHours;
import ru.epam.balayan.tasksolution5.printer.IPrinterDatetime;
import ru.epam.balayan.tasksolution5.students.Student;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * this class is a controller between interfaces /is created on 8/31/2019
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 */
public class DateTimeController {
  private LocalDateTime startDate, endDate;
  private long fullWorkDaysHours, balanceHours;
  private short firstWorkDayHours, endWorkDayHours;

  /**
   * initializes all fields, calling all interfaces constructor is used to quickly call objects
   * exception handling declared
   */
  public DateTimeController(
      IWorkDates workDates, IWorkHours workHours, Student student, DateTimeFormatter formatter) {
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
   * student's task date time and current date time output remaining or past date time output
   * exception handling declared
   */
  public void outPutTimeResult(
      IPrinterDatetime outPut, Student student, DateTimeFormatter formatter) {
    try {
      outPut.outPutDatetimeResult(balanceHours, student.getName(), student.getCurricullum());
      outPut.outPutDates(startDate, endDate, formatter);
    } catch (NullPointerException | IllegalArgumentException | DateTimeException e) {
      System.err.println(e.getMessage());
    }
  }
}
