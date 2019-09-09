package ru.epam.balayan.tasksolution7.client;

import ru.epam.balayan.tasksolution7.commands.Executable;
import ru.epam.balayan.tasksolution7.commands.SellPotionCommand;
import ru.epam.balayan.tasksolution7.commands.SellWeaponCommand;
import ru.epam.balayan.tasksolution7.executor.Executor;
import ru.epam.balayan.tasksolution7.executor.IExecutor;

/**
 * The Client class.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 09.09.2019
 */
public class CommandsExecutorDemo {
  private Executable sellPotionCommand = new SellPotionCommand();
  private Executable sellWeaponCommand = new SellWeaponCommand();

  private IExecutor executor = new Executor();

  public void outPutExecutorWork() {
    System.out.println(executor.execute(sellPotionCommand));
    System.out.println(executor.execute(sellWeaponCommand));
  }
}
