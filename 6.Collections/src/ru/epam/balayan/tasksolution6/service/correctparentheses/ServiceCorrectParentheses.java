package ru.epam.balayan.tasksolution6.service.correctparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Implementation with conditions for verifying the correct placement of parentheses and
 * demonstrating validation.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 14.09.2019
 * @see IServiceCorrectParentheses implement
 */
public class ServiceCorrectParentheses implements IServiceCorrectParentheses {
  private String strWithBrackets;

  /** Passing a user-specified string with parentheses. */
  public ServiceCorrectParentheses(String strWithBrackets) {
    this.strWithBrackets = strWithBrackets;
  }

  @Override
  public boolean checkParentheses() {
    if (strWithBrackets.isEmpty()) {
      return true;
    }

    Deque<Character> deque = new ArrayDeque<>();

    for (int i = 0; i < strWithBrackets.length(); i++) {
      char current = strWithBrackets.charAt(i);

      if ((current == '{') || (current == '(') || (current == '[')) {
        deque.push(current);
      }

      if ((current == '}') || (current == ')') || (current == ']')) {
        if (deque.isEmpty()) {
          return false;
        }

        char last = deque.peek();

        if (((current == '}') && (last == '{'))
            || ((current == ')') && (last == '('))
            || ((current == ']') && (last == '['))) {
          deque.pop();
        } else {
          return false;
        }
      }
    }

    return deque.isEmpty();
  }

  @Override
  public void demoCheckParentheses(boolean checkParentheses) {
    if (checkParentheses) {
      System.out.println(
          "The brackets are placed correctly in the line: " + "\"" + strWithBrackets + "\"");
    } else {
      System.out.println(
          "Brackets are incorrectly placed in a line: " + "\"" + strWithBrackets + "\"");
    }
  }
}
