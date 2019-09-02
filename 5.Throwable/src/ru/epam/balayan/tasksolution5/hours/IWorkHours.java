package ru.epam.balayan.tasksolution5.hours;

import java.time.LocalDateTime;


/**
 * interface for getting working hours
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see WorkHours implements
 * is created on 8/31/2019
 */
public interface IWorkHours {

    /**
     * @return working hours of the first day
     */
    short getFirstWorkDayHours(LocalDateTime startDate);

    /**
     * @return working hours of the end day
     */
    short getEndWorkDayHours(LocalDateTime endDate);

    /**
     * @return the working hours of days between the first and last day
     */
    long getFullWorkDaysHours(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * @return remaining or past working hours of all day sinse the first day
     */
    long getBalanceHours(short[] hours, long fullWorkDaysHours,
                         short firstWorkDayHours, short endWorkDayHours);

}
