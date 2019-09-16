package ru.epam.balayan.tasksolution6.service.fileio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Implementation with conditions for reverse list of strings.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 14.09.2019
 * @see IStrListReverse implement
 */
public class StrListReverse implements IStrListReverse {
  @Override
  public ArrayList<String> getListStrReverse(ArrayList<String> strList) {
    String s = strList.toString();

    strList = new ArrayList<>(Arrays.asList(s.split(" ")));
    Collections.reverse(strList);

    return strList;
  }
}

