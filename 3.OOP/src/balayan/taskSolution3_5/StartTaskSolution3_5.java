package balayan.taskSolution3_5;

/**
 * this app is a solution for EPAM Java Training homework № 3, task 5.Taxi station
 * this is main starting app class
 *
 * @author Balayan Vardan
 * @version 1.8
 * is created on 8/26/2019
 */
class StartTaskSolution3_5 {
    public static void main(String[] args) {
        StartTaskSolution3_5 taskSolution3_5 = new StartTaskSolution3_5();
        taskSolution3_5.startApp();
    }

    /**
     * method starting factory methods
     * {@link WorkClass#display(balayan.taskSolution3_5.contract.PassengerCar[])}
     */
    void startApp() {
        TaxiStation station = new TaxiStation();
        WorkClass workClass = new WorkClass();
        workClass.display(station.addStation());
    }
}
