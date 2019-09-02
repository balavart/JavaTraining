package ru.epam.balayan.tasksolution4.students;

/**
 * is class for user info
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/31/2019
 */
public class Student {
  private String name;
  private String curricullum;
  private String taskDate;
  private short[] courseHours;

  public Student(String name, String curricullum, String taskDate, short[] courseHours) {
    this.name = name;
    this.curricullum = curricullum;
    this.taskDate = taskDate;
    this.courseHours = courseHours;
  }

  public short[] getCourseHours() {
    return courseHours;
  }

  public String getCurricullum() {
    return curricullum;
  }

  public String getName() {
    return name;
  }

  public String getTaskDate() {
    return taskDate;
  }
}
