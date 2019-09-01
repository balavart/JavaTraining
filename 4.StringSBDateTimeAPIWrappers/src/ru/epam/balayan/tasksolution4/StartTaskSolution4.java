package ru.epam.balayan.tasksolution4;

import ru.epam.balayan.tasksolution4.controller.DateTimeController;
import ru.epam.balayan.tasksolution4.dates.IWorkDates;
import ru.epam.balayan.tasksolution4.dates.WorkDates;
import ru.epam.balayan.tasksolution4.hours.IWorkHours;
import ru.epam.balayan.tasksolution4.hours.WorkHours;
import ru.epam.balayan.tasksolution4.printer.IPrinterDatetime;
import ru.epam.balayan.tasksolution4.printer.OutPutStudentTime;
import ru.epam.balayan.tasksolution4.students.IStudents;
import ru.epam.balayan.tasksolution4.students.IvanovIvan;
import ru.epam.balayan.tasksolution4.students.PetrovPetr;

import java.time.format.DateTimeFormatter;


/**
 * this app is a solution for EPAM Java Training homework № 4
 * this is main starting app class
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/31/2019
 */
public class StartTaskSolution4 {

    public static void main(String[] args) {
        StartTaskSolution4 taskSolution4 = new StartTaskSolution4();
        taskSolution4.startApp();
    }

    /**
     * method for quickly creating and executing objects
     */
    private void startApp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        IStudents ivanov = new IvanovIvan();
        IStudents petrov = new PetrovPetr();
        IWorkDates workDates = new WorkDates();
        IWorkHours workHours = new WorkHours();
        IPrinterDatetime outPutResult = new OutPutStudentTime();

        DateTimeController ivanovTime = new DateTimeController(workDates, workHours, ivanov, formatter);
        ivanovTime.outPutTimeResult(outPutResult, ivanov, formatter);

        DateTimeController petrovTime = new DateTimeController(workDates, workHours, petrov, formatter);
        petrovTime.outPutTimeResult(outPutResult, petrov, formatter);
    }

}
