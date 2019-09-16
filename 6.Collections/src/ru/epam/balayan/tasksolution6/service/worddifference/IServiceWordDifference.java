package ru.epam.balayan.tasksolution6.service.worddifference;

/**
 * Interface for getting text from file and word difference demonstration.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 15.09.2019
 * @see ServiceWordDifference implements
 */
public interface IServiceWordDifference {

  /**
   * getting text.
   *
   * @return strings from text
   */
  String getText();

  /**
   * word difference demonstration.
   *
   * @param strLine strings from text
   */
  void demoWordsDif(String strLine);
}
