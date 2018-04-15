
package cointest;

import static csci232_lab07.Coins.getChange;
import org.junit.Assert;

import org.junit.Test;



/**
 * Author: Selene Smith
 * Date: 4/13/18
 * 
 * Overview: Dynamic program to solve coin change problem
 * 
 * This class is to hold unit test methods for the getChange()
 * method in the Coins class
 */

public class CoinTest {
    
    // unit test #1 - test empty array
    @Test
    public void unitTest01(){
        int ar[] = {};
        int amt = 1;
        
        //Assert.assertEquals();
        
        //Exception e = assertThrows(IllegalArgumentException.class, () -> {Coins.getChange(ar, c);} );
        //assertEquals("Coin array of size 0 is not allowed", e.getMessage());
    }
    
    
    // unit test#2 - from lab instructions
    @Test
    public void unitTest02(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 42;  // amount to make change for
        
        int[] answer = new int[amt]; // array holding correct answer - size of amount
        answer[0] = 25; // fill answer array with correct change
        answer[1] = 10;
        answer[2] = 5;
        answer[3] = 1;
        answer[4] = 1;
        
        Assert.assertArrayEquals(answer, getChange(ar,amt));  // check that arrays match
    }
    
    
    // unit test#3
    @Test
    public void unitTest03(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 97;// amount to make change for
        
        int[] answer = new int[amt]; // array holding correct answer - size of amount
        answer[0] = 25; // fill answer array with correct change
        answer[1] = 25;
        answer[2] = 25;
        answer[3] = 10;
        answer[4] = 10;
        answer[5] = 1;
        answer[6] = 1;
        
        Assert.assertArrayEquals(answer, getChange(ar,amt)); // check that arrays match
    }
    
    
    // unit test#4
    @Test
    public void unitTest04(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 13;// amount to make change for
        
        int[] answer = new int[amt]; // array holding correct answer - size of amount
        answer[0] = 10; // fill answer array with correct change
        answer[1] = 1;
        answer[2] = 1;
        answer[3] = 1;
        
        Assert.assertArrayEquals(answer, getChange(ar,amt)); // check that arrays match  
    }
 
    
    // unit test#5
    @Test
    public void unitTest05(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 34;// amount to make change for
        
        int[] answer = new int[amt]; // array holding correct answer - size of amount
        answer[0] = 25; // fill answer array with correct change
        answer[1] = 5;
        answer[2] = 1;
        answer[3] = 1;
        answer[4] = 1;
        answer[5] = 1;
        
        Assert.assertArrayEquals(answer, getChange(ar,amt)); // check that arrays match   
    }
    
        // unit test#6
    @Test
    public void unitTest06(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 100;// amount to make change for
        
        int[] answer = new int[amt]; // array holding correct answer - size of amount
        answer[0] = 25; // fill answer array with correct change
        answer[1] = 25;
        answer[2] = 25;
        answer[3] = 25;
        
        Assert.assertArrayEquals(answer, getChange(ar,amt)); // check that arrays match   
    }
}
