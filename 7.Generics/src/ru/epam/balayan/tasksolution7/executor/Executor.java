package ru.epam.balayan.tasksolution7.executor;

import ru.epam.balayan.tasksolution7.commands.Executable;

/**
 * The Executor interface.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 07.09.2019
 * @see SimpleExecutor implements
 */
public interface Executor {
  <T> T execute(Executable<T> command);
}
