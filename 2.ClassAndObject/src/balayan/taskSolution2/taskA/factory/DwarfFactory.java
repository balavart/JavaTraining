package balayan.taskSolution2.taskA.factory;


import balayan.taskSolution2.taskA.Dwarf;

import java.util.*;

/**
 * this is a Factory class
 * is used as an additional class for creating POJO class objects
 * main logic is in here
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see Dwarf
 * is created on 8/22/2019
 */
public class DwarfFactory {

    /**
     * method creates an array of objects and assigns values​from Enum
     *
     * @return dwarf object array
     */
    public Dwarf[] addDwarfArr() {
        Dwarf[] dwarfArr = new Dwarf[5];
        dwarfArr[0] = new Dwarf(DwarfClasses.PALADIN.personName, DwarfClasses.PALADIN.strenghtLevel);
        dwarfArr[1] = new Dwarf(DwarfClasses.WARRIOR.personName, DwarfClasses.WARRIOR.strenghtLevel);
        dwarfArr[2] = new Dwarf(DwarfClasses.HUNTER.personName, DwarfClasses.HUNTER.strenghtLevel);
        dwarfArr[3] = new Dwarf(DwarfClasses.ROGUE.personName, DwarfClasses.ROGUE.strenghtLevel);
        dwarfArr[4] = new Dwarf(DwarfClasses.MONK.personName, DwarfClasses.MONK.strenghtLevel);

        return dwarfArr;
    }

    /**
     * this inner Enum contains 5 objects with random field values
     * generates a random field numbers and selects random string values
     */
    enum DwarfClasses {
        PALADIN((int) (Math.random() * 5)),
        WARRIOR((int) (Math.random() * 5)),
        HUNTER((int) (Math.random() * 5)),
        ROGUE((int) (Math.random() * 5)),
        MONK((int) (Math.random() * 5));

        String personName = null;
        int strenghtLevel = 0;

        String[] names = {"Vardvin", "Muradin Bronzebeard", "Falstad Wildhammer", "Brymidaine Zecker", "Thargas Anvilmar"};

        DwarfClasses(int strenghtLevel) {
            this.personName = names[(new Random().nextInt(names.length))];
            this.strenghtLevel = strenghtLevel;
        }

    }

    /**
     * method takes as an parameter an array
     *
     * @param dwarves - object array
     * @return newDwarfArr.length - the number of equivalent array objects
     */
    public int quivalentObjNum(Dwarf[] dwarves) {
        TreeSet<Dwarf> dwarfTreeSet = new TreeSet<>();
        Dwarf[] newDwarfArr = null;

        for (int i = 0; i < dwarves.length; i++) {
            for (int j = dwarves.length - 1; j > 0; j--) {
                if (i == j) {
                    continue;
                }
                if (dwarves[i].equals(dwarves[j])) {
                    dwarfTreeSet.add(dwarves[i]);
                }
            }

            Object[] objDwarfArr = dwarfTreeSet.toArray();
            newDwarfArr = new Dwarf[objDwarfArr.length];

            for (int j = 0; j < newDwarfArr.length; j++) {
                newDwarfArr[j] = (Dwarf) objDwarfArr[j];
            }
        }

        System.out.println("Array repeating objects: ");
        if (newDwarfArr.length != 0) {
            for (int i = 0; i < newDwarfArr.length; i++) {
                System.out.println("\"" + newDwarfArr[i] + "\"");
            }
        } else {
            System.out.println("No objects exist");
        }

        System.out.println("Array equivalent objects number: " + newDwarfArr.length);

        return newDwarfArr.length;
    }

    /**
     * method takes as an parameter an array and display a string representation of objects
     *
     * @param dwarves - object array
     */
    public void objDisplay(Dwarf[] dwarves) {
        System.out.println("Array objects: ");
        for (Dwarf temp : dwarves) {
            System.out.println(temp);
        }
    }

}
