package ru.epam.balayan.tasksolution6.service.fileio;

import java.util.ArrayList;

/**
 * Interface for reverse list of strings.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 15.09.2019
 * @see StrListReverse implements
 */
public interface IStrListReverse {

  /**
   * reverse strings.
   *
   * @param strList list of strings.
   * @return list of reversing strings.
   */
  ArrayList<String> getListStrReverse(ArrayList<String> strList);
}
