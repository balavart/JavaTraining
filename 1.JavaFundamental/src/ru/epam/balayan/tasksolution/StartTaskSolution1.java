package ru.epam.balayan.tasksolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * this is main starting app class this app is a solution for EPAM Java Training homework № 1.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/18/2019
 */
public class StartTaskSolution1 {
  private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  private static int countStr = 0;
  private static int[] primaryArray;

  /** starting app. */
  public static void main(String[] args) {
    StartTaskSolution1 solution = new StartTaskSolution1();

    solution.startApp();
  }

  /**
   * method creates an array with random elements from -10 to 10 is a solution for task option № 1.
   */
  void addArray() {
    primaryArray = new int[20];

    for (int i = 0; i < primaryArray.length; i++) {
      primaryArray[i] = (int) (Math.random() * (20 + 1)) - 10;
    }

    System.out.println(
        "An array with random elements -10 to 10: " + "\n" + Arrays.toString(primaryArray) + "\n");
  }

  /**
   * method displays strings whose length is longer the average and their length is a solution for
   * task option № 2.2.
   *
   * @see StartTaskSolution1#inputStrCount()
   */
  void averageLonger() {
    int average = 0;

    inputStrCount();

    String[] text = new String[countStr];

    for (int i = 0; i < countStr; i++) {
      System.out.println("Type a string: " + (i + 1));

      try {
        text[i] = reader.readLine();
        average += text[i].length();
      } catch (IOException e) {
        e.getMessage();
      }
    }

    average /= countStr;
    System.out.print("Strings longer than an average: " + "\n");

    for (int i = 0; i < countStr; i++) {
      if (text[i].length() > average) {
        System.out.println("\"" + text[i] + "\"" + " - This string's length: " + text[i].length());
      } else {
        System.out.println("The strings' lengts are equal");

        break;
      }
    }

    System.out.print("\n");
  }

  /**
   * method displays strings whose length is shorter the average and their length is a solution for
   * task option № 2.3.
   *
   * @see StartTaskSolution1#inputStrCount()
   */
  private void averageShorter() {
    int average = 0;

    inputStrCount();

    String[] text = new String[countStr];

    for (int i = 0; i < countStr; i++) {
      System.out.println("Type a string: " + (i + 1));

      try {
        text[i] = reader.readLine();
        average += text[i].length();
      } catch (IOException e) {
        e.getMessage();
      }
    }

    average /= countStr;
    System.out.print("Strings shorter than an average: " + "\n");

    for (int i = 0; i < countStr; i++) {
      if (text[i].length() < average) {
        System.out.println("\"" + text[i] + "\"" + " - This string's length: " + text[i].length());
      } else {
        System.out.println("The strings' lengts are equal");

        break;
      }
    }

    System.out.print("\n");
  }

  /** method closes keyboard input stream. */
  private void closeBufReadStream() {
    try {
      reader.close();
    } catch (IOException e) {
      e.getMessage();
    }
  }

  /**
   * method in integers array find The difference between the minimum element value and the
   * arithmetic mean value. is a solution for task option № 1.5
   */
  void differenceFind(int[] array) {
    double average = 0;
    double sum = 0;
    int minValue = 0;

    for (int temp : array) {
      sum += temp;
    }

    average = sum / array.length;

    for (int temp : array) {
      if (temp < array[0]) {
        minValue = temp;
      }
    }

    System.out.println(
        "The difference between the minimum element value and the arithmetic mean value: "
            + "\n"
            + (minValue - average)
            + "\n");
  }

  /**
   * method find the first specified word consisting various characters. is a solution for task
   * option № 2.5
   *
   * @see StartTaskSolution1#inputStrCount()
   */
  private void differentChars() {
    inputStrCount();

    String[] text = new String[countStr];

    for (int i = 0; i < countStr; i++) {
      System.out.println("Type some word: " + (i + 1));

      try {
        text[i] = reader.readLine();
      } catch (IOException e) {
        e.getMessage();
      }
    }

    for (int i = 0; i < text.length; i++) {
      if (text[i].toLowerCase().chars().distinct().count() == text[i].length()) {
        System.out.println(
            "The first specified word consisting various characters: " + "\"" + text[i] + "\"");

        break;
      } else if (!(text[i].toLowerCase().chars().distinct().count() == text[i].length())) {
        System.out.println("Words consisting various characters only are missing");

        break;
      }
    }

    System.out.print("\n");
  }

  /**
   * method for assigning string counts some methods use this method.
   *
   * @see StartTaskSolution1#isDigit(java.lang.String)
   */
  private void inputStrCount() {
    boolean digit = false;
    String str = null;

    System.out.println("Type string quantity: ");

    while (!digit) {
      try {
        str = reader.readLine();

        if (isDigit(str)) {
          countStr = Integer.parseInt(str);
          digit = true;
        }
      } catch (IOException e) {
        e.getMessage();
      }
    }
  }

  /**
   * method find the first specified word the number of different characters is minimal. is a
   * solution for task option № 2.4
   *
   * @see StartTaskSolution1#inputStrCount()
   */
  void minCharCountFind() {
    inputStrCount();

    String[] text = new String[countStr];
    int[] intArr = new int[countStr];
    int min = 0;

    for (int i = 0; i < countStr; i++) {
      System.out.println("Type some word: " + (i + 1));

      try {
        text[i] = reader.readLine();
      } catch (IOException e) {
        e.getMessage();
      }
    }

    for (int i = 0; i < text.length; i++) {
      intArr[i] = (int) text[i].toLowerCase().chars().distinct().count();
    }

    min = intArr[0];

    for (int i = 0; i < intArr.length; i++) {
      if (min > intArr[i]) {
        min = intArr[i];
      }
    }

    for (int i = 0; i < text.length; i++) {
      if (text[i].toLowerCase().chars().distinct().count() == min) {
        System.out.println(
            "The first specified word with the minimal number of different characters: "
                + "\""
                + text[i]
                + "\"");

        break;
      } else {
        System.out.println("The strings' lengts are equal");

        break;
      }
    }

    System.out.print("\n");
  }

  /**
   * method find the specified word, consisting of numbers only or the second word after the first
   * counter. is a solution for task option № 2.6
   *
   * @see StartTaskSolution1#inputStrCount()
   */
  private void onlyDigitsFind() {
    inputStrCount();

    String[] text = new String[countStr];
    String[] strArr = new String[countStr];

    for (int i = 0; i < countStr; i++) {
      System.out.println("Type some word: " + (i + 1));

      try {
        text[i] = reader.readLine();
      } catch (IOException e) {
        e.getMessage();
      }
    }

    for (int i = 0; i < text.length; i++) {
      strArr[i] = text[i].replaceAll("\\D+", "");
    }

    for (int i = 0; i < text.length; i++) {
      if (text[i].equals(strArr[i])) {
        text[i] = " ";

        break;
      }
    }

    for (int i = 0; i < text.length; i++) {
      if (text[i].equals(strArr[i])) {
        System.out.println(
            "The specified word consisting of numbers only"
                + " or the second word after the first counter: "
                + "\""
                + text[i]
                + "\"");

        break;
      } else {
        System.out.println("Words consisting numbers only are missing");

        break;
      }
    }
  }

  /**
   * method in integers array repeat array numbers of odd indices. is a solution for task option №
   * 1.6
   */
  private void repeatElements(int[] array) {
    System.out.print("Repeat array numbers of odd indices: " + "\n");

    for (int i = 0; i < array.length; i++) {
      if (i % 2 != 0) {
        for (int j = i + 1; j < array.length; j++) {
          if (array[i] == array[j]) {
            System.out.print(array[i] + " ");
          }
        }
      }
    }

    System.out.println("\n");
  }

  /**
   * method finds the shortest and longest strings and displays this strings and their length. is a
   * solution for task option № 2.1
   *
   * @see StartTaskSolution1#inputStrCount()
   */
  private void shortLongLengthFind() {
    String shortStr = null;
    String longStr = null;
    String text = null;

    inputStrCount();

    for (int i = 0; i < countStr; i++) {
      System.out.println("Type a string: " + (i + 1));

      try {
        text = reader.readLine();
      } catch (IOException e) {
        e.getMessage();
      }

      if ((shortStr == null) || (text.length() < shortStr.length())) {
        shortStr = text;
      }

      if ((longStr == null) || (text.length() > longStr.length())) {
        longStr = text;
      }
    }

    System.out.println(
        "The shortest string: " + "\"" + shortStr + "\"" + ". Its length: " + shortStr.length());
    System.out.println(
        "The longest string: " + "\"" + longStr + "\"" + ". Its length: " + longStr.length());
    System.out.print("\n");
  }

  /** method starting other app methods. */
  void startApp() {
    addArray();
    switchElements(primaryArray.clone());
    sumElements(primaryArray.clone());
    zeroReplace(primaryArray.clone());
    tripleElements(primaryArray.clone());
    differenceFind(primaryArray.clone());
    repeatElements(primaryArray.clone());
    shortLongLengthFind();
    averageLonger();
    averageShorter();
    minCharCountFind();
    differentChars();
    onlyDigitsFind();
    closeBufReadStream();
  }

  /**
   * method in integers array determines sum of elements of even positions. is a solution for task
   * option № 1.2
   */
  private void sumElements(int[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      if (i % 2 == 0) {
        sum += array[i];
      }
    }

    System.out.println("Elements sum of even positions: " + "\n" + sum + "\n");
  }

  /**
   * method in integers array swaps the maximum negative element and the minimum positive. is a
   * solution for task option № 1.1
   */
  private void switchElements(int[] array) {
    int minPosElement = 0;
    int maxNegElement = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        minPosElement = i;

        break;
      }
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        maxNegElement = i;

        break;
      }
    }

    for (int i = 0; i < array.length; i++) {
      if ((array[i] > 0) && (array[i] < array[minPosElement])) {
        minPosElement = i;
      }
    }

    for (int i = 0; i < array.length; i++) {
      if ((array[i] < 0) && (array[i] < array[maxNegElement])) {
        maxNegElement = i;
      }
    }

    int swag = array[minPosElement];

    array[minPosElement] = array[maxNegElement];
    array[maxNegElement] = swag;
    System.out.println(
        "Replacing the maximum negative and the minimum positive elements: "
            + "\n"
            + Arrays.toString(array)
            + "\n");
  }

  /**
   * method in integers array tripling positive element in front of a negative element. is a
   * solution for task option № 1.4
   */
  private void tripleElements(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        if ((i != 0) && (array[i - 1] > 0)) {
          array[i - 1] *= 3;
        }
      }
    }

    System.out.println(
        "Tripling positive element in front of a negative element: "
            + "\n"
            + Arrays.toString(array)
            + "\n");
  }

  /** method in integers array zeroing negative elements. is a solution for task option № 1.3. */
  private void zeroReplace(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        array[i] = 0;
      }
    }

    System.out.println("Zeroing negative elements: " + "\n" + Arrays.toString(array) + "\n");
  }

  /**
   * method is used to check the conditions for entering numbers in the input stream. some methods
   * use this method
   */
  private boolean isDigit(String string) {
    if (string.isEmpty()) {
      return false;
    }

    for (int i = 0; i < string.length(); i++) {
      if (!Character.isDigit(string.charAt(i)) || string.equals("0")) {
        System.err.println("Type a number!");

        return false;
      }
    }

    return true;
  }
}
