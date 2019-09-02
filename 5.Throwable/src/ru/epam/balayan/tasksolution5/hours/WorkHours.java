package ru.epam.balayan.tasksolution5.hours;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


/**
 * implementation with conditions working hours
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see IWorkHours implement
 * is created on 8/31/2019
 */
public class WorkHours implements IWorkHours {

    public static final short START_WORKDAY_HOURS = 10; // 10:00
    public static final short END_WORKDAY_HOURS = 18;   // 18:00
    public static final short WORK_HOURS = (short) (END_WORKDAY_HOURS - START_WORKDAY_HOURS);

    /**
     * declared conditions for throwing exceptions
     */
    @Override
    public short getFirstWorkDayHours(LocalDateTime startDate) {
        if (startDate == null) {
            throw new NullPointerException("No data in start date! Indicate date.");
        }
        short firstWorkDayHours;
        short hoursResult = 0;
        firstWorkDayHours = (short) startDate.getHour();
        if (firstWorkDayHours < END_WORKDAY_HOURS) {
            hoursResult = (short) (hoursResult + Math.min(WORK_HOURS, END_WORKDAY_HOURS - firstWorkDayHours));
        }
        return hoursResult;
    }

    /**
     * declared conditions for throwing exceptions
     */
    @Override
    public short getEndWorkDayHours(LocalDateTime endDate) {
        if (endDate == null) {
            throw new NullPointerException("No data in end date! Indicate date.");
        }
        short endWorkDayHours;
        short hoursResult = 0;
        endWorkDayHours = (short) endDate.getHour();
        if (endWorkDayHours > START_WORKDAY_HOURS) {
            hoursResult = (short) (hoursResult + Math.min(WORK_HOURS, endWorkDayHours - START_WORKDAY_HOURS));
        }
        return hoursResult;
    }

    /**
     * declared conditions for throwing exceptions
     */
    @Override
    public long getFullWorkDaysHours(LocalDateTime startDate, LocalDateTime endDate) {
        if (startDate == null) {
            throw new NullPointerException("No data in start date! Indicate date.");
        } else if (endDate == null) {
            throw new NullPointerException("No data in end date! Indicate date.");
        }
        long fullWorkDays;
        long hoursResult;
        fullWorkDays = ChronoUnit.DAYS.between(startDate.toLocalDate(), endDate.toLocalDate()) - 2;
        hoursResult = fullWorkDays * WORK_HOURS;
        return hoursResult;
    }

    /**
     * declared conditions for throwing exceptions
     */
    @Override
    public long getBalanceHours(short[] courseHours, long fullWorkDaysHours,
                                short firstWorkDayHours, short endWorkDayHours) {
        if (courseHours == null) {
            throw new NullPointerException("No data in course hours! Indicate hours.");
        }
        long balanceHours;
        short courseHoursSum = 0;
        for (short temp : courseHours) {
            courseHoursSum = (short) (courseHoursSum + temp);
        }
        balanceHours = (courseHoursSum - (fullWorkDaysHours + firstWorkDayHours + endWorkDayHours));
        return balanceHours;
    }

}
