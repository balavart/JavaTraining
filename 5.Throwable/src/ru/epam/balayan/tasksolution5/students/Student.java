package ru.epam.balayan.tasksolution5.students;


/**
 * is class for user info
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/31/2019
 */
public class Student {

    private String name;
    private String curricullum ;
    private String taskDate;
    private short[] courseHours;

    public Student(String name, String curricullum, String taskDate, short[] courseHours) {
        this.name = name;
        this.curricullum = curricullum;
        this.taskDate = taskDate;
        this.courseHours = courseHours;
    }

    public String getName(){
        return name;
    }

    public String getCurricullum(){
        return curricullum;
    }

    public String getTaskDate(){
        return taskDate;
    }

    public short[] getCourseHours(){
        return courseHours;
    }

}
