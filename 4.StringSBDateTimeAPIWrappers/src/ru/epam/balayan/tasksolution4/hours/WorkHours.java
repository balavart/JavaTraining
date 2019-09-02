package ru.epam.balayan.tasksolution4.hours;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * implementation with conditions working hours
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see IWorkHours implement
 */
public class WorkHours implements IWorkHours {
  public static final short START_WORKDAY_HOURS = 10; // 10:00
  public static final short END_WORKDAY_HOURS = 18; // 18:00
  public static final short WORK_HOURS = (short) (END_WORKDAY_HOURS - START_WORKDAY_HOURS);

  @Override
  public long getBalanceHours(
      short[] courseHours, long fullWorkDaysHours, short firstWorkDayHours, short endWorkDayHours) {
    long balanceHours;
    short courseHoursSum = 0;

    for (short temp : courseHours) {
      courseHoursSum = (short) (courseHoursSum + temp);
    }

    balanceHours = (courseHoursSum - (fullWorkDaysHours + firstWorkDayHours + endWorkDayHours));

    return balanceHours;
  }

  @Override
  public short getEndWorkDayHours(LocalDateTime endDate) {
    short endWorkDayHours;
    short hoursResult = 0;

    endWorkDayHours = (short) endDate.getHour();

    if (endWorkDayHours > START_WORKDAY_HOURS) {
      hoursResult =
          (short) (hoursResult + Math.min(WORK_HOURS, endWorkDayHours - START_WORKDAY_HOURS));
    }

    return hoursResult;
  }

  @Override
  public short getFirstWorkDayHours(LocalDateTime startDate) {
    short firstWorkDayHours;
    short hoursResult = 0;

    firstWorkDayHours = (short) startDate.getHour();

    if (firstWorkDayHours < END_WORKDAY_HOURS) {
      hoursResult =
          (short) (hoursResult + Math.min(WORK_HOURS, END_WORKDAY_HOURS - firstWorkDayHours));
    }

    return hoursResult;
  }

  @Override
  public long getFullWorkDaysHours(LocalDateTime startDate, LocalDateTime endDate) {
    long fullWorkDays;
    long hoursResult;

    fullWorkDays = ChronoUnit.DAYS.between(startDate.toLocalDate(), endDate.toLocalDate()) - 2;
    hoursResult = fullWorkDays * WORK_HOURS;

    return hoursResult;
  }
}
