package ru.epam.balayan.tasksolution6.service.directoryfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Implementation with conditions for creating a list of catalog elements and its subdirectories.
 *
 * @author Vardan Balayan
 * @version 1.8
 * @created 14.09.2019
 * @see IServiceDirectoryFiles implement
 */
public class ServiceDirectoryFiles implements IServiceDirectoryFiles {
  private File directory;

  /** User pointing to file link. */
  public ServiceDirectoryFiles(String path) {
    this.directory = new File(path);
  }

  @Override
  public void dirElementsList() {
    ArrayList<String> catalogItems = new ArrayList<>();
    if (directory.isDirectory()) {
      for (File file : Objects.requireNonNull(directory.listFiles())) {
        catalogItems.add(file.getName());
      }
    } else {
      System.err.println("There are no elements in the catalog!");
    }

    catalogItems.trimToSize();

    System.out.println("List of files and subdirectories in a directory: " + catalogItems);
  }
}
