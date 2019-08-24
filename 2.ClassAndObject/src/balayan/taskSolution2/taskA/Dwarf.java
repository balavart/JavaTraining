package balayan.taskSolution2.taskA;

/**
 * this is a POJO class
 * for encapsulation are used private fields, getters and setters
 * some Object methods are also overridden
 * this class also implements Comparable and overrides "compareTo"
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/22/2019
 */
public class Dwarf implements Comparable {
    private String personName = null;
    private int strengthLevel = 0;

    /**
     * Dwarf constructor
     *
     * @param personName
     * @param strengthLevel
     */
    public Dwarf(String personName, int strengthLevel) {
        this.personName = personName;
        this.strengthLevel = strengthLevel;
    }

    /**
     * getter for strengthLevel
     *
     * @return strengthLevel
     */
    int getStrengthLevel() {
        return strengthLevel;
    }

    /**
     * setter for strengthLevel
     *
     * @param strengthLevel
     */
    void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    /**
     * getter for personName
     *
     * @return personName
     */
    String getPersonName() {
        return personName;
    }

    /**
     * setter for personName
     *
     * @param personName
     */
    void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * overriding Object method
     *
     * @return class fields
     */
    @Override
    public String toString() {
        return "Dwarf name: " + getPersonName() + ", Strength level: " + getStrengthLevel();
    }

    /**
     * overriding Object method for more accurate objects comparison
     *
     * @param obj
     * @return logical comparison
     */
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

    /**
     * overriding Object method for more accurate objects comparison
     *
     * @return logical comparison
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getStrengthLevel();
        result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());
        return result;
    }

    /**
     * overriding Comparable method for more accurate objects comparison
     *
     * @return logical comparison
     */
    @Override
    public int compareTo(Object o) {
        if (this.equals(o)) {
            return 0;
        } else {
            return -1;
        }
    }

}
