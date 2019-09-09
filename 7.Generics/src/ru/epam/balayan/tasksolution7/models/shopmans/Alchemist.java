package ru.epam.balayan.tasksolution7.models.shopmans;

import ru.epam.balayan.tasksolution7.models.items.Potion;

/**
 * The Receiver class. Implementation with conditions to sell potion.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 08.09.2019
 * @see IShopman implement
 */
public class Alchemist implements IShopman<Potion> {

  /** use purple for text. */
  @Override
  public Potion sell() {
    return new Potion("\u001B[35m" + "Regeneration" + "\u001B[0m", 150);
  }
}
