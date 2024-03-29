package ru.epam.balayan.tasksolution2.a.service;

import java.util.Random;
import java.util.TreeSet;

import ru.epam.balayan.tasksolution2.a.Dwarf;

/**
 * this is a model class is used as an additional class for creating POJO class objects.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/22/2019
 * @see Dwarf
 */
public class ServiceDwarf {

  /**
   * method creates an array of objects and assigns values​from Enum.
   *
   * @return dwarf object array
   */
  public Dwarf[] addDwarfArr() {
    Dwarf[] dwarfArr = new Dwarf[5];

    dwarfArr[0] = new Dwarf(DwarfClasses.PALADIN.personName, DwarfClasses.PALADIN.strengthLevel);
    dwarfArr[1] = new Dwarf(DwarfClasses.WARRIOR.personName, DwarfClasses.WARRIOR.strengthLevel);
    dwarfArr[2] = new Dwarf(DwarfClasses.HUNTER.personName, DwarfClasses.HUNTER.strengthLevel);
    dwarfArr[3] = new Dwarf(DwarfClasses.ROGUE.personName, DwarfClasses.ROGUE.strengthLevel);
    dwarfArr[4] = new Dwarf(DwarfClasses.MONK.personName, DwarfClasses.MONK.strengthLevel);

    return dwarfArr;
  }

  /**
   * method takes as an parameter an array and display a string representation of objects.
   *
   * @param dwarves object array
   */
  public void objDisplay(Dwarf[] dwarves) {
    System.out.println("The array of objects: ");

    for (Dwarf temp : dwarves) {
      System.out.println(temp);
    }
  }

  /**
   * method takes as an parameter an array.
   *
   * @param dwarves object array
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

    System.out.println("The array of repeating objects: ");

    if (newDwarfArr.length != 0) {
      for (Dwarf dwarf : newDwarfArr) {
        System.out.println("\"" + dwarf + "\"");
      }
    } else {
      System.out.println("No objects exist");
    }

    System.out.println("The number of equivalent objects: " + newDwarfArr.length);

    return newDwarfArr.length;
  }

  /**
   * this inner Enum contains 5 objects with random field values generates a random field numbers
   * and selects random string values.
   */
  enum DwarfClasses {
    PALADIN((int) (Math.random() * 5)),
    WARRIOR((int) (Math.random() * 5)),
    HUNTER((int) (Math.random() * 5)),
    ROGUE((int) (Math.random() * 5)),
    MONK((int) (Math.random() * 5));

    String personName = null;
    int strengthLevel = 0;
    String[] names = {
      "Vardvin",
      "Muradin Bronzebeard",
      "Falstad Wildhammer",
      "Brymidaine Zecker",
      "Thargas Anvilmar"
    };

    DwarfClasses(int strengthLevel) {
      this.personName = names[(new Random().nextInt(names.length))];
      this.strengthLevel = strengthLevel;
    }
  }
}
