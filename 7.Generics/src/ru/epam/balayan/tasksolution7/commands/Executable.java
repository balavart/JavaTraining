package ru.epam.balayan.tasksolution7.commands;

/**
 * The Command interface.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 07.09.2019
 * @see SellPotionCommand implements
 * @see SellWeaponCommand implements
 */
public interface Executable<T> {
  T execute();
}
