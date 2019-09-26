package ru.epam.balayan.tasksolution4;

import java.time.format.DateTimeFormatter;
import ru.epam.balayan.tasksolution4.controller.DateTimeController;
import ru.epam.balayan.tasksolution4.dates.SimpleWorkDates;
import ru.epam.balayan.tasksolution4.dates.WorkDates;
import ru.epam.balayan.tasksolution4.hours.SimpleWorkHours;
import ru.epam.balayan.tasksolution4.hours.WorkHours;
import ru.epam.balayan.tasksolution4.printer.OutPutStudentTime;
import ru.epam.balayan.tasksolution4.printer.PrinterDatetime;
import ru.epam.balayan.tasksolution4.students.Student;

/**
 * This app is a solution for EPAM Java Training homework № 4. This is main starting app class.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 */
public class StartTaskSolution4 {
  public static void main(String[] args) {
    StartTaskSolution4 taskSolution4 = new StartTaskSolution4();
    taskSolution4.startApp();
  }

  /** method for quickly creating and executing objects. */
  private void startApp() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    Student ivanov =
        new Student("Ivan Ivanov", "J2EE Developer", "27.08.2019 20:33", new short[] {16, 24});
    Student petrov =
        new Student("Petr Petrov", "Java Developer", "27.08.2019 20:33", new short[] {8, 16, 16});
    WorkDates workDates = new SimpleWorkDates();
    WorkHours workHours = new SimpleWorkHours();
    PrinterDatetime outPutResult = new OutPutStudentTime();
    DateTimeController ivanovTime = new DateTimeController(workDates, workHours, ivanov, formatter);

    ivanovTime.outPutTimeResult(outPutResult, ivanov, formatter);

    DateTimeController petrovTime = new DateTimeController(workDates, workHours, petrov, formatter);

    petrovTime.outPutTimeResult(outPutResult, petrov, formatter);
  }
}
