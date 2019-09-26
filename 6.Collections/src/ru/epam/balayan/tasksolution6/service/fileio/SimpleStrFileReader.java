package ru.epam.balayan.tasksolution6.service.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Implementation with conditions for getting strings from file.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 14.09.2019
 * @see StrFileReader implement
 */
public class SimpleStrFileReader implements StrFileReader {
  @Override
  public ArrayList<String> getFileStrList(String path) {
    String strLine;
    ArrayList<String> strList = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new java.io.FileReader(path))) {
      while ((strLine = br.readLine()) != null) {
        strList.add(strLine);
      }
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (IOException e) {
      System.err.println(e.getMessage() + " Something is wrong with the file!");
    }

    strList.trimToSize();
    System.out.println("Sequence of lines in a list: " + strList);

    return strList;
  }
}

