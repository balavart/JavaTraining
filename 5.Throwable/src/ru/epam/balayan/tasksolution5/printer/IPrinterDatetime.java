package ru.epam.balayan.tasksolution5.printer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * interface with operation for date times output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see OutPutStudentTime implements
 * is created on 8/31/2019
 */
public interface IPrinterDatetime {

    /**
     * method display remaining or past date time
     */
    void outPutDatetimeResult(long balanceHours, String name, String secondName);

    /**
     * method display student's task date time and current date time
     */
    void outPutDates(LocalDateTime startDate, LocalDateTime endDate, DateTimeFormatter formatter);

}
