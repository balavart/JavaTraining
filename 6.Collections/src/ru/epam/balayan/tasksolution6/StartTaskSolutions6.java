package ru.epam.balayan.tasksolution6;

import ru.epam.balayan.tasksolution6.service.correctparentheses.IServiceCorrectParentheses;
import ru.epam.balayan.tasksolution6.service.correctparentheses.ServiceCorrectParentheses;
import ru.epam.balayan.tasksolution6.service.directoryfiles.IServiceDirectoryFiles;
import ru.epam.balayan.tasksolution6.service.directoryfiles.ServiceDirectoryFiles;
import ru.epam.balayan.tasksolution6.service.fileio.IServiceStrFileReverse;
import ru.epam.balayan.tasksolution6.service.fileio.ServiceStrFileReverse;
import ru.epam.balayan.tasksolution6.service.poem.IServicePoem;
import ru.epam.balayan.tasksolution6.service.poem.ServicePoem;
import ru.epam.balayan.tasksolution6.service.worddifference.IServiceWordDifference;
import ru.epam.balayan.tasksolution6.service.worddifference.ServiceWordDifference;

/**
 * This app is a solution for EPAM Java Training homework № 6. This is main class with service
 * dependencies.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 12.09.2019
 */
public class StartTaskSolutions6 {
  private IServiceStrFileReverse strFileReverse =
      new ServiceStrFileReverse(
          "6.Collections\\src\\ru\\epam\\balayan\\tasksolution6\\service\\fileio\\file.txt",
          "6.Collections\\src\\ru\\epam\\balayan\\tasksolution6\\service\\fileio\\outFile.txt");
  private IServiceDirectoryFiles directoryFiles =
      new ServiceDirectoryFiles(
          "6.Collections\\src\\ru\\epam\\balayan"
              + "\\tasksolution6\\service\\directoryfiles\\catalog1");
  private IServicePoem servicePoem =
      new ServicePoem(
          "Jack-O-Lanterns\n" + "Smiling bright\n" + "Wishing you\n" + "A haunting night!");
  private IServiceCorrectParentheses correctParentheses = new ServiceCorrectParentheses("()[]{}");
  private IServiceWordDifference wordDifference =
      new ServiceWordDifference(
          "6.Collections\\src\\ru\\epam\\balayan"
              + "\\tasksolution6\\service\\worddifference\\englishText.txt");

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
