package balayan.taskSolution2.taskB;

import balayan.taskSolution2.taskB.factory.GunFactory;

/**
 * this app is a solution for EPAM Java Training homework № 2, task B
 * this is main starting app class
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/23/2019
 */
class StartTaskSolution2B {
    public static void main(String[] args) {
        StartTaskSolution2B taskSolution2B = new StartTaskSolution2B();
        taskSolution2B.startApp();
    }

    /**
     * method starting factory methods
     * {@link balayan.taskSolution2.taskB.factory.GunFactory#displayShootableArrArr()}
     */
    void startApp() {
        GunFactory gunFactory = new GunFactory();
        gunFactory.displayShootableArrArr();
    }
}
