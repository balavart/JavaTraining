package ru.epam.balayan.tasksolution2.a;

/**
 * this is a POJO class for encapsulation are used private fields, getters and setters some Object
 * methods are also overridden this class also implements Comparable and overrides "compareTo"
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/22/2019
 */
public class Dwarf implements Comparable {
  private String personName = null;
  private int strengthLevel = 0;

  public Dwarf(String personName, int strengthLevel) {
    this.personName = personName;
    this.strengthLevel = strengthLevel;
  }

  @Override
  public int compareTo(Object o) {
    if (this.equals(o)) {
      return 0;
    } else {
      return -1;
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }

    Dwarf other = (Dwarf) obj;

    if (getPersonName() != other.getPersonName()) {
      return false;
    }

    if (getStrengthLevel() != other.getStrengthLevel()) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;

    result = prime * result + getStrengthLevel();
    result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());

    return result;
  }

  @Override
  public String toString() {
    return "Dwarf name: " + getPersonName() + ", Strength level: " + getStrengthLevel();
  }

  public String getPersonName() {
    return personName;
  }

  public int getStrengthLevel() {
    return strengthLevel;
  }
}
