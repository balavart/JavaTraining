package ru.epam.balayan.tasksolution7.models.shopmans;

/**
 * The Receiver interface. Shopman's contract.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 07.09.2019
 * @see Alchemist implements
 * @see Blacksmith implements
 */
public interface IShopman<T> {

  /** item sale. */
  T sell();
}
