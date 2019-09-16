package ru.epam.balayan.tasksolution6.service.correctparentheses;

/**
 * Interface for verifying the correct placement of parentheses and demonstrating validation.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 15.09.2019
 * @see ServiceCorrectParentheses implements
 */
public interface IServiceCorrectParentheses {

  /** parenthesis validation. */
  boolean checkParentheses();

  /**
   * demonstrating validation.
   *
   * @param checkParentheses parenthesis validation method.
   */
  void demoCheckParentheses(boolean checkParentheses);
}
