package ru.epam.balayan.tasksolution6.service.fileio;

import java.util.ArrayList;

/**
 * Interface for writing strings to file.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 15.09.2019
 * @see SimpleStrFileWriter implements
 */
public interface StrFileWriter {

  /**
   * writing strings to file.
   *
   * @param path user pointing to file link.
   * @param strList list of strings
   */
  void strWriteFile(String path, ArrayList<String> strList);
}
