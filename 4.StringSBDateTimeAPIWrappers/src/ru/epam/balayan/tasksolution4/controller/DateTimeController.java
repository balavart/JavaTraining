package ru.epam.balayan.tasksolution4.controller;

import ru.epam.balayan.tasksolution4.dates.IWorkDates;
import ru.epam.balayan.tasksolution4.hours.IWorkHours;
import ru.epam.balayan.tasksolution4.printer.IPrinterDatetime;
import ru.epam.balayan.tasksolution4.students.IStudents;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * this class is a controller between interfaces
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/31/2019
 */
public class DateTimeController {

    private LocalDateTime startDate, endDate;
    private long fullWorkDaysHours, balanceHours;
    private short firstWorkDayHours, endWorkDayHours;

    /**
     * initializes all fields, calling all interfaces
     * constructor is used to quickly call objects
     */
    public DateTimeController(IWorkDates workDates, IWorkHours workHours,
                              IStudents student, DateTimeFormatter formatter) {
        this.startDate = workDates.getStartDate(student.getTaskDate(), formatter);
        this.endDate = workDates.getEndDate();
        this.fullWorkDaysHours = workHours.getFullWorkDaysHours(startDate, endDate);
        this.firstWorkDayHours = workHours.getFirstWorkDayHours(startDate);
        this.endWorkDayHours = workHours.getEndWorkDayHours(endDate);
        this.balanceHours = workHours.getBalanceHours(student.getCourseHours(),
                fullWorkDaysHours, firstWorkDayHours, endWorkDayHours);
    }

    /**
     * student's task date time and current date time output
     * remaining or past date time output
     */
    public void outPutTimeResult(IPrinterDatetime outPut, IStudents student, DateTimeFormatter formatter) {
        outPut.outPutDatetimeResult(balanceHours, student.getName(), student.getCurricullum());
        outPut.outPutDates(startDate, endDate, formatter);
    }

}
