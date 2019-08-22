package balayan.taskSolution2.taskA;

/**
 * @author Balayan Vardan
 * this app is a solution for EPAM Java Training homework № 2, task A
 * is created on 8/22/2019
 */

public class StartTaskSolution2A {
    public static void main(String[] args) {
        StartTaskSolution2A taskSolution2A = new StartTaskSolution2A();
        taskSolution2A.startApp();
    }

    /**
     * method starting all other app methods
     */
    void startApp() {
        DwarfFactory dwarfFactory = new DwarfFactory();
        dwarfFactory.quivalentObjNum(dwarfFactory.addDwarfArr());
        System.out.println();
        dwarfFactory.objDisplay(dwarfFactory.addDwarfArr());
    }
}