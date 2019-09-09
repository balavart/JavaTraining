package ru.epam.balayan.tasksolution7.executor;

import ru.epam.balayan.tasksolution7.commands.Executable;

/**
 * Implementation with conditions to command execution.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 07.09.2019
 */
public class Executor implements IExecutor {
  @Override
  public <T> T execute(Executable<T> command) {
    return command.execute();
  }
}
