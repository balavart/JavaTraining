package ru.epam.balayan.tasksolution6.service.poem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Implementation with conditions for sorting poem strings by string length.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 14.09.2019
 * @see IServicePoem implement
 */
public class ServicePoem implements IServicePoem {
  private String poem;

  /** User pointing to file link. */
  public ServicePoem(String poem) {
    this.poem = poem;
  }

  @Override
  public void sortAscRowLength() {
    List<String> list = Arrays.asList(poem.split("\n"));

    list.sort(
        new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
            return o1.length() - o2.length();
          }
        });
    System.out.println("Sorted strings by string length: " + list);
  }
}
