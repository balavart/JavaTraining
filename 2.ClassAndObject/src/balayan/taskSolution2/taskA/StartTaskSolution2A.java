package balayan.taskSolution2.taskA;

/**
 * this app is a solution for EPAM Java Training homework № 2, task A
 * this is main starting app class
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/22/2019
 */
public class StartTaskSolution2A {
    public static void main(String[] args) {
        StartTaskSolution2A taskSolution2A = new StartTaskSolution2A();
        taskSolution2A.startApp();
    }

    /**
     * method starting factory methods
     * {@link DwarfFactory#quivalentObjNum(balayan.taskSolution2.taskA.Dwarf[]}
     * {@link DwarfFactory#objDisplay(balayan.taskSolution2.taskA.Dwarf[]}
     */
    void startApp() {
        DwarfFactory dwarfFactory = new DwarfFactory();
        dwarfFactory.quivalentObjNum(dwarfFactory.addDwarfArr());
        System.out.println();
        dwarfFactory.objDisplay(dwarfFactory.addDwarfArr());
    }
}