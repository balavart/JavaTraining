package balayan.taskSolution2.taskA;

/**
 * this is a POJO class.
 * for encapsulation are used private fields, getters and setters
 * the important methods of the Object class are also overridden
 * this class also implements Comparable and overrides "compareTo"
 */

public class Dwarf implements Comparable {
    private String personName = null;
    private int strenghtLevel = 0;

    public Dwarf(String personName, int strenghtLevel) {
        this.personName = personName;
        this.strenghtLevel = strenghtLevel;
    }

    public int getStrenghtLevel() {
        return strenghtLevel;
    }

    public void setStrenghtLevel(int strenghtLevel) {
        this.strenghtLevel = strenghtLevel;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Dwarf name: " + getPersonName() + ", Strenght level: " + getStrenghtLevel();
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
        if (getStrenghtLevel() != other.getStrenghtLevel()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getStrenghtLevel();
        result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if (this.equals(o)) {
            return 0;
        } else {
            return -1;
        }
    }

}
