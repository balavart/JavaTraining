package balayan.taskSolution2.taskB.factory;

import balayan.taskSolution2.taskB.contract.Shootable;
import balayan.taskSolution2.taskB.gunClasses.AK12;
import balayan.taskSolution2.taskB.gunClasses.HK416;

import java.util.Arrays;
import java.util.Random;

/**
 * this is a Factory class
 * this class is used as an additional class for creating gun class objects
 * main logic is in here
 *
 * @author Balayan Vardan
 * @version 1.8
 * @see AK12
 * @see HK416
 * is created on 8/23/2019
 */
public class GunFactory {
    /**
     * method add an randomly filled object array
     *
     * @return
     */
    public Shootable[] addShootableArr() {
        Shootable[] guns = new Shootable[(5 + (int) (Math.random() * ((10 - 5) + 1)))];
        Object obj = null;
        int randomNum = 0;

        for (int i = 0; i < guns.length; i++) {
            randomNum = new Random().nextInt(2);
            switch (randomNum) {
                case 0:
                    obj = new AK12();
                    break;
                case 1:
                    obj = new HK416();
                    break;
            }
            guns[i] = (Shootable) obj;
        }

        return guns;
    }

    /**
     * method add wo-dimensional objects array
     * each subarray is filled by objects certain class
     *
     * @param paramArr object array
     * @return two-dimensional objects array
     */
    public Shootable[][] addShootableArrArr(Shootable[] paramArr) {
        Shootable[][] gunsArrArr = null;
        int akCount = 0;
        int hkCount = 0;

        for (int i = 0; i < paramArr.length; i++) {
            if (paramArr[i].equals(new AK12())) {
                akCount++;
            }
        }

        Shootable[] ak12Arr = new Shootable[akCount];
        for (int i = 0; i < ak12Arr.length; i++) {
            ak12Arr[i] = new AK12();
        }

        for (int i = 0; i < paramArr.length; i++) {
            if (paramArr[i].equals(new HK416())) {
                hkCount++;
            }
        }
        Shootable[] hk416Arr = new Shootable[hkCount];
        for (int i = 0; i < hk416Arr.length; i++) {
            hk416Arr[i] = new HK416();
        }

        gunsArrArr = new Shootable[][]{ak12Arr, hk416Arr};

        return gunsArrArr;
    }

    /**
     * method display each separate array contains objects certain class
     */
    public void displayShootableArrArr() {
        Shootable[] displayArr = addShootableArr();
        Shootable[][] displayArrArr = addShootableArrArr(displayArr);
        System.out.println("One-dimensional object array: " + Arrays.toString(displayArr));
        System.out.println("Two-dimensional object array: " + Arrays.deepToString(displayArrArr));
    }
}