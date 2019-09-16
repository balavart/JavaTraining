package ru.epam.balayan.tasksolution6.service.worddifference;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Implementation for getting text from file and word difference demonstration.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 14.09.2019
 * @see IServiceWordDifference implement
 */
public class ServiceWordDifference implements IServiceWordDifference {
  private String path;

  /** User pointing from file link. */
  public ServiceWordDifference(String path) {
    this.path = path;
  }

  @Override
  public String getText() {
    String strLine = null;

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      strLine = br.readLine();
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (IOException e) {
      System.err.println(e.getMessage() + " Something is wrong with the file!");
    }

    return strLine;
  }

  @Override
  public void demoWordsDif(String strLine) {
    System.out.println("Text from file : " + "\n" + strLine);
    strLine = Objects.requireNonNull(strLine).replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
    strLine = strLine.toLowerCase();

    Set<String> set = new LinkedHashSet<>(Arrays.asList(strLine.split(" ")));

    set.remove("");
    System.out.println("Different words in the text: " + "\n" + set);
  }
}
