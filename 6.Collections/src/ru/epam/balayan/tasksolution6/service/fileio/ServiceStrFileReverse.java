package ru.epam.balayan.tasksolution6.service.fileio;

import java.util.ArrayList;

/**
 * Class controller between interfaces.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 15.09.2019
 * @see IServiceStrFileReverse implement
 */
public class ServiceStrFileReverse implements IServiceStrFileReverse {
  private String pathFromFile;
  private String pathToFile;
  private IStrFileReader fileReader;
  private IStrListReverse listReverse;
  private IStrFileWriter fileWriter;

  /**
   * Constructor is used to quickly call objects.
   *
   * @param pathFromFile user pointing from file link.
   * @param pathToFile user pointing to file link.
   */
  public ServiceStrFileReverse(String pathFromFile, String pathToFile) {
    this.pathFromFile = pathFromFile;
    this.pathToFile = pathToFile;
    this.fileReader = new StrFileReader();
    this.listReverse = new StrListReverse();
    this.fileWriter = new StrFileWriter();
  }

  @Override
  public void startServiceStrFileReverse() {
    ArrayList<String> strList = fileReader.getFileStrList(pathFromFile);

    fileWriter.strWriteFile(pathToFile, listReverse.getListStrReverse(strList));
  }
}

