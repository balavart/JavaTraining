package ru.epam.balayan.tasksolution2.b;

import ru.epam.balayan.tasksolution2.b.service.ServiceGun;


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
     * method for quickly creating and executing objects
     */
    void startApp() {
        ServiceGun modelGun = new ServiceGun();
        modelGun.displayShootableArrArr();
    }

}
