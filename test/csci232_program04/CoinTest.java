package csci232_program04;

import org.junit.Test;
import static org.junit.Assert.*;



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
   /* 
    // unit test #1 - test empty array
    //Test if array sent in is empty
    @Test(expected = IllegalArgumentException.class)
    public void testGetChangeEmptyArray() {
        System.out.println("makeChange empty array");
        int[] a = {};
        int b = 42;
        int[] result = Coins.getChange(a, b);
    }
    
    // unit test#2 - Testing that making change for 42 with US coins works
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
        
        assertArrayEquals(answer, Coins.getChange(ar,amt));  // check that arrays match
    }
    
    
    // unit test#3 - testing that making change for 97 with US coins works
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
        
        assertArrayEquals(answer, Coins.getChange(ar,amt)); // check that arrays match
    }
    
    
    // unit test#4 - testing that making change for 13 with US coins works
    @Test
    public void unitTest04(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 13;// amount to make change for
        
        int[] answer = new int[amt]; // array holding correct answer - size of amount
        answer[0] = 10; // fill answer array with correct change
        answer[1] = 1;
        answer[2] = 1;
        answer[3] = 1;
        
        assertArrayEquals(answer, Coins.getChange(ar,amt)); // check that arrays match  
    }
 */
    
    // unit test#5 - testing that making change for 34 with US coins works
    @Test
    public void unitTest05(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 34;// amount to make change for
        Coins.getChange(ar);
        int[] answer = new int[14]; // array holding correct answer - size of amount
        answer[0] = 1; // fill answer array with correct change
        answer[1] = 1;
        answer[2] = 1;
        answer[3] = 1;
        answer[4] = 5;
        answer[5] = 25;
        
        assertArrayEquals(answer, Coins.makeChange(amt)); // check that arrays match   
    }
    
        // unit test#6 - testing that making change for 100 with US coins works
    @Test
    public void unitTest06(){
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 100;// amount to make change for
        Coins.getChange(ar, amt);
        int[] answer = new int[14]; // array holding correct answer - size of amount
        answer[0] = 25; // fill answer array with correct change
        answer[1] = 25;
        answer[2] = 25;
        answer[3] = 25;
        
        assertArrayEquals(answer, Coins.makeChange(amt)); // check that arrays match   
    }
    //change to be found is not a positive number
    @Test(expected = IllegalArgumentException.class)
    public void testGetChangeNegativeChange() {
        System.out.println("makeChange negative change requested");
        int[] a = {1,5,10,25};
        Coins.getChange(a);
        int b = -42;
        int[] result = Coins.makeChange(b);
    }

    @Test
    public void testGetChangenonUS(){
        System.out.println("Get change for non US denominations");
        int[] a = {1,5,10,21,25};
        int b = 63;
        Coins.getChange(a);
        int[] answer = new int[14]; // array holding correct answer - size of amount
        answer[0] = 21; // fill answer array with correct change
        answer[1] = 21;
        answer[2] = 21;
        int [] result = Coins.makeChange(b);
//        for(int i = 0; 0 < ; i++)
//        {
//            System.out.println(result[i]);
//        }
        assertArrayEquals(answer,result);
    }
}
