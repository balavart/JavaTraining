package ru.epam.balayan.tasksolution7.commands;

import ru.epam.balayan.tasksolution7.models.items.Weapon;
import ru.epam.balayan.tasksolution7.models.shopmans.Blacksmith;

/**
 * The ConcretteCommand class.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 08.09.2019
 * @see Executable implement
 */
public class SellWeaponCommand implements Executable<Weapon> {
  private Blacksmith shopman;

  public SellWeaponCommand() {
    this.shopman = new Blacksmith();
  }

  /** execute Blacksmith sale. */
  @Override
  public Weapon execute() {
    return shopman.sell();
  }
}
