package ru.epam.balayan.tasksolution2.a;

import ru.epam.balayan.tasksolution2.a.service.ServiceDwarf;

/**
 * this app is a solution for EPAM Java Training homework № 2, task A this is main starting app
 * class.
 *
 * @author Balayan Vardan
 * @version 1.8 creation date 8/22/2019
 */
class StartTaskSolution2A {
  public static void main(String[] args) {
    StartTaskSolution2A taskSolution2A = new StartTaskSolution2A();
    taskSolution2A.startApp();
  }

  /** method for quickly creating and executing objects. */
  private void startApp() {
    ServiceDwarf modelDwarf = new ServiceDwarf();
    modelDwarf.quivalentObjNum(modelDwarf.addDwarfArr());
    System.out.println();
    modelDwarf.objDisplay(modelDwarf.addDwarfArr());
  }
}
