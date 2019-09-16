package ru.epam.balayan.tasksolution6.service.fileio;

import java.util.ArrayList;

/**
 * Interface for getting strings from file.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 15.09.2019
 * @see StrFileReader implements
 */
public interface IStrFileReader {

  /**
   * getting strings from file.
   *
   * @param path user pointing from file link.
   * @return list of strings.
   */
  ArrayList<String> getFileStrList(String path);
}
