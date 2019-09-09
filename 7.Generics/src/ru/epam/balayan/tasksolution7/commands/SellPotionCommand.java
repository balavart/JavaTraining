package ru.epam.balayan.tasksolution7.commands;

import ru.epam.balayan.tasksolution7.models.items.Potion;
import ru.epam.balayan.tasksolution7.models.shopmans.Alchemist;

/**
 * The ConcretteCommand class.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 08.09.2019
 * @see Executable implement
 */
public class SellPotionCommand implements Executable<Potion> {
  private Alchemist shopman;

  public SellPotionCommand() {
    this.shopman = new Alchemist();
  }

  /** execute Alchemist sale. */
  @Override
  public Potion execute() {
    return shopman.sell();
  }
}
