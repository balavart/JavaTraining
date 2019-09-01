package ru.epam.balayan.tasksolution4.students;


/**
 * @author Balayan Vardan
 * @version 1.8
 * @see IStudents implement
 * is created on 8/31/2019
 */
public class IvanovIvan implements IStudents {

    private String name = "Ivan Ivanov";
    private String curricullum = "J2EE Developer";
    private String taskDate = "27.08.2019 20:33";
    private short[] courseHours = {16, 24};

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCurricullum() {
        return curricullum;
    }

    @Override
    public String getTaskDate() {
        return taskDate;
    }

    @Override
    public short[] getCourseHours() {
        return courseHours;
    }

}
