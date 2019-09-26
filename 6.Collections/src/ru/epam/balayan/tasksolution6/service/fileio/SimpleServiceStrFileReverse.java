package ru.epam.balayan.tasksolution6.service.fileio;

import java.util.ArrayList;

/**
 * Class controller between interfaces.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 15.09.2019
 * @see ServiceStrFileReverse implement
 */
public class SimpleServiceStrFileReverse implements ServiceStrFileReverse {
  private String pathFromFile;
  private String pathToFile;
  private StrFileReader fileReader;
  private StrListReverse listReverse;
  private StrFileWriter fileWriter;

  /**
   * Constructor is used to quickly call objects.
   *
   * @param pathFromFile user pointing from file link.
   * @param pathToFile user pointing to file link.
   */
  public SimpleServiceStrFileReverse(String pathFromFile, String pathToFile) {
    this.pathFromFile = pathFromFile;
    this.pathToFile = pathToFile;
    this.fileReader = new SimpleStrFileReader();
    this.listReverse = new SimpleStrListReverse();
    this.fileWriter = new SimpleStrFileWriter();
  }

  @Override
  public void startServiceStrFileReverse() {
    ArrayList<String> strList = fileReader.getFileStrList(pathFromFile);

    fileWriter.strWriteFile(pathToFile, listReverse.getListStrReverse(strList));
  }
}

