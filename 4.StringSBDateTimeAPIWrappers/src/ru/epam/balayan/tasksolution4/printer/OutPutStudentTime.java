package ru.epam.balayan.tasksolution4.printer;

import ru.epam.balayan.tasksolution4.hours.WorkHours;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * implementation with conditions date times output
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IPrinterDatetime implement
 * is created on 8/31/2019
 */
public class OutPutStudentTime implements IPrinterDatetime {

    @Override
    public void outPutDates(LocalDateTime startDate, LocalDateTime endDate, DateTimeFormatter formatter) {
        StringBuilder dates;
        dates = new StringBuilder("Getting task date time: ")
                .append(startDate.format(formatter)).append("\n")
                .append("Current date time: ")
                .append(endDate.format(formatter)).append("\n");
        System.out.println(dates);
    }

    @Override
    public void outPutDatetimeResult(long balanceHours, String studentName, String curricullum) {
        long daysResult = Math.abs(balanceHours / WorkHours.WORK_HOURS);
        long hoursResult = Math.abs(balanceHours % WorkHours.WORK_HOURS);
        boolean finished = balanceHours < 0;
        StringBuilder outPutResult;
        outPutResult = new StringBuilder(studentName)
                .append(" (").append(curricullum).append(") ").append("- Trainig ")
                .append(finished ? "completed: " : "is not finished: ")
                .append(daysResult != 0 ? daysResult + " day(s) " : "")
                .append(hoursResult != 0 ? hoursResult + " hour(s) " : "")
                .append(finished ? "passed" : "left");
        System.out.println(outPutResult);
    }

}
