package ru.epam.balayan.tasksolution4.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * implementation with conditions the starting and final dates
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IWorkDates implement
 * is created on 8/31/2019
 */
public class WorkDates implements IWorkDates {

    @Override
    public LocalDateTime getStartDate(String taskDate, DateTimeFormatter formatter) {
        DateTimeFormatter formatRus = formatter;
        LocalDateTime startDate;
        startDate = LocalDateTime.parse(taskDate, formatRus);
        return startDate;
    }

    @Override
    public LocalDateTime getEndDate() {
        LocalDateTime endDate = LocalDateTime.now();
        return endDate;
    }

}
