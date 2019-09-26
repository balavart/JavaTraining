package ru.epam.balayan.tasksolution4.hours;

import java.time.LocalDateTime;

/**
 * interface for getting working hours.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 * @see SimpleWorkHours implements
 */
public interface WorkHours {

  /** get remaining or past working hours of all day since the first day. */
  long getBalanceHours(
      short[] hours, long fullWorkDaysHours, short firstWorkDayHours, short endWorkDayHours);

  /** get working hours of the end day. */
  short getEndWorkDayHours(LocalDateTime endDate);

  /** get working hours of the first day. */
  short getFirstWorkDayHours(LocalDateTime startDate);

  /** get the working hours of days between the first and last day. */
  long getFullWorkDaysHours(LocalDateTime startDate, LocalDateTime endDate);
}
