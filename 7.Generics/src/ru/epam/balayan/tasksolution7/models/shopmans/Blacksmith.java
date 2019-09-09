package ru.epam.balayan.tasksolution7.models.shopmans;

import ru.epam.balayan.tasksolution7.models.items.Weapon;

/**
 * The Receiver class. Implementation with conditions to sell weapon.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 08.09.2019
 * @see IShopman implement
 */
public class Blacksmith implements IShopman<Weapon> {

  /** use purple for text. */
  @Override
  public Weapon sell() {
    return new Weapon("\u001B[34m" + "Sword" + "\u001B[0m", 2350);
  }
}
