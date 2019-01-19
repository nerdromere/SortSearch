package Sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Sorts an array
 *
 * @author larik AND RYAN
 */
/**
 * Linear sort
 *
 * @author ryanr
 */
public class Sort implements Runnable {

    //List is just a test list of fake data to sort
    private List list;
    //The number of threads the user wishes to create
    int threadCount = 1;
    //Used to generate random numbers to input into the test list
    private Random random;

    /**
     * Overload constructor that allows of setting custom number of threads
     *
     * @param threadCount The number of threads to create (Default: 1)
     */
    public Sort(int threadCount) {
        this.threadCount = threadCount;
        list = Collections.synchronizedList(new ArrayList());
        random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
    }

    /**
     * Default constructor
     */
    public Sort() {
        list = Collections.synchronizedList(new ArrayList());
        random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
    }

    /**
     * Runs the sort list method
     */
    @Override
    public void run() {
        sortList();
    }

    /**
     * Sorts a list passed to it from the run method. For testing purposes it
     * uses the private List built into the class
     */
    private void sortList() {
        int num = 1;
        for (int i = 0; i < 10; i++) {

        }
    }

    public void printList() {
        System.out.println(list.toString());
    }

}
