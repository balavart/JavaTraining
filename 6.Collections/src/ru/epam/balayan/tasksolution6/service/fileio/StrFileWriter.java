package ru.epam.balayan.tasksolution6.service.fileio;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Implementation with conditions for writing strings to file.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 14.09.2019
 * @see IStrFileWriter implement
 */
public class StrFileWriter implements IStrFileWriter {
  @Override
  public void strWriteFile(String path, ArrayList<String> strList) {
    try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(path))) {
      System.out.print("Sequence of lines in a file: ");

      for (String s1 : strList) {
        s1 = s1.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        writer.write(s1);
        writer.write(" ");
        System.out.print(s1 + " ");
      }

      writer.flush();
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (IOException e) {
      System.err.println(e.getMessage() + " Something is wrong with the file!");
    }

    System.out.println();
  }
}
