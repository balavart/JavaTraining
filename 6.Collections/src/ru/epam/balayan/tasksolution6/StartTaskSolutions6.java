package ru.epam.balayan.tasksolution6;

import ru.epam.balayan.tasksolution6.service.directories.DirectoryFiles;

import ru.epam.balayan.tasksolution6.service.directories.ServiceDirectoryFiles;

import ru.epam.balayan.tasksolution6.service.fileio.ServiceStrFileReverse;
import ru.epam.balayan.tasksolution6.service.fileio.SimpleServiceStrFileReverse;
import ru.epam.balayan.tasksolution6.service.parentheses.CorrectParentheses;
import ru.epam.balayan.tasksolution6.service.parentheses.ServiceCorrectParentheses;
import ru.epam.balayan.tasksolution6.service.poem.Poem;
import ru.epam.balayan.tasksolution6.service.poem.ServicePoem;
import ru.epam.balayan.tasksolution6.service.words.ServiceWordDifference;
import ru.epam.balayan.tasksolution6.service.words.WordDifference;

/**
 * This app is a solution for EPAM Java Training homework № 6. This is main class with service
 * dependencies.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 12.09.2019
 */
public class StartTaskSolutions6 {
  private ServiceStrFileReverse strFileReverse =
      new SimpleServiceStrFileReverse(
          "6.Collections\\src\\ru\\epam\\balayan\\tasksolution6\\service\\fileio\\file.txt",
          "6.Collections\\src\\ru\\epam\\balayan\\tasksolution6\\service\\fileio\\outFile.txt");
  private DirectoryFiles directoryFiles =
      new ServiceDirectoryFiles(
          "6.Collections\\src\\ru\\epam\\balayan\\"
              + "tasksolution6\\service\\directories\\catalog1");
  private Poem servicePoem =
      new ServicePoem(
          "Jack-O-Lanterns\n" + "Smiling bright\n" + "Wishing you\n" + "A haunting night!");
  private CorrectParentheses correctParentheses = new ServiceCorrectParentheses("()[]{}");
  private WordDifference wordDifference =
      new ServiceWordDifference(
          "6.Collections\\src\\ru\\epam\\balayan\\"
              + "tasksolution6\\service\\words\\englishText.txt");

  /** calling service methods. */
  public static void main(String[] args) {
    StartTaskSolutions6 taskSolutions6 = new StartTaskSolutions6();

    // Task solution 6.1
    taskSolutions6.strFileReverse.startServiceStrFileReverse();
    System.out.println();

    // Task solution 6.2
    taskSolutions6.directoryFiles.dirElementsList();
    System.out.println();

    // Task solution 6.3
    taskSolutions6.servicePoem.sortAscRowLength();
    System.out.println();

    // Task solution 6.4
    taskSolutions6.correctParentheses.demoCheckParentheses(
        taskSolutions6.correctParentheses.checkParentheses());
    System.out.println();

    // Task solution 6.5
    taskSolutions6.wordDifference.demoWordsDif(taskSolutions6.wordDifference.getText());
  }
}
