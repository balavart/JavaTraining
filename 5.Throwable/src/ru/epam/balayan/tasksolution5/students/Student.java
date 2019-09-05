package ru.epam.balayan.tasksolution5.students;

/**
 * is class for user info.
 *
 * @author Balayan Vardan
 * @version 1.8 is created on 8/31/2019
 */
public class Student {

  private String name;
  private String curricullum;
  private String taskDate;
  private short[] courseHours;

  /**
   * for init student fields.
   *
   * @param name user name
   * @param curricullum user curriculum
   * @param taskDate user task date in date format
   * @param courseHours hours of all the courses
   */
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
