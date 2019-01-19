/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan Russell
 */
public class SortTest {

    Sort sort;
    Thread thread;

    @Before
    public void setUp() {
        sort = new Sort();
        thread = new Thread(sort);
    }

    /**
     * Test of run method, of class Sort.
     */
    @Test
    public void run() {
        for (int i = 0; i < 10; i++) {
            thread = new Thread(sort);
            thread.start();
        }
    }

    @Test
    @After
    public void printList() {
        sort.printList();
    }
}
