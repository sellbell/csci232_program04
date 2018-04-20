package csci232_program04;

import org.junit.Test;
import static org.junit.Assert.*;



/**
 * Authors: Selene Smith, Dallas LeGrande
 * Date: 4/11/18
 *
 * Overview: 
 * - Program intended to better understand dynamic 
 *   programming and unit testing with JUnit
 *
 * - Includes a class to hold JUnit tests w/
 *   at least 4 test cases.
 *   > 1 test case to expect an exception when sent 
 *     an empty array of coins as parameter
 *
 * - Includes a class for a method with 2 parameters:
 *   1. Array of coins (US currency = 1, 5, 10, 25)
 *   2. Amount for which to make change
 *   which returns a list of coins for that amount
 *   > Throws an exception if the array of coins sent
 *     in parameter is empty
 *   > Uses dynamic programming
 * 
 * - Has no main method: execution triggered only
 *   by JUnit test cases
 */

public class CoinTest {
   
    // unit test #1 - test empty array
    //Test if array sent in is empty
    @Test(expected = IllegalArgumentException.class)
    public void testGetChangeEmptyArray() {
        System.out.println("trying to get change with an empty coin array returns an error works");
        int[] a = {};
        int b = 42;
        int[] result = Coins.getChange(a, b);
    }
    
    // unit test#2 - Testing that making change for 42 with US coins works
    @Test
    public void unitTest02(){
        System.out.println("getting change for 42 with US coins works");
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 42;  // amount to make change for
        int [] result = Coins.getChange(ar,amt);
        assertEquals(1, result[1]); // check that array spots match the coin value expected
        assertEquals(1, result[2]); // check that array spots match the coin value expected
        assertEquals(5, result[7]); // check that array spots match the coin value expected
        assertEquals(10, result[17]); // check that array spots match the coin value expected
        assertEquals(25, result[42]); // check that array spots match the coin value expected
    }
    
    
    // unit test#3 - testing that getting change for 97 with US coins works
    @Test
    public void unitTest03(){
        System.out.println("getting change for 97 with US coins works");
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 97;// amount to make change for
        int [] result = Coins.getChange(ar,amt);
        assertEquals(1, result[1]); // check that array spots match the coin value expected
        assertEquals(1, result[1]); // check that array spots match the coin value expected
        assertEquals(10, result[12]); // check that array spots match the coin value expected
        assertEquals(10, result[22]); // check that array spots match the coin value expected
        assertEquals(25, result[47]); // check that array spots match the coin value expected
        assertEquals(25, result[72]); // check that array spots match the coin value expected
        assertEquals(25, result[97]); // check that array spots match the coin value expected
    }
    
    
    // unit test#4 - testing that getting change for 13 with US coins works
    @Test
    public void unitTest04(){
        System.out.println("getting change for 13 with US coins works");
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 13;// amount to make change for
        int [] result = Coins.getChange(ar,amt);
        assertEquals(1, result[1]); // check that array spots match the coin value expected
        assertEquals(1, result[2]); // check that array spots match the coin value expected
        assertEquals(1, result[3]); // check that array spots match the coin value expected
        assertEquals(10, result[10]); // check that array spots match the coin value expected
    }
 
    
    // unit test#5 - testing that getting change for 34 with US coins works
    @Test
    public void unitTest05(){
        System.out.println("getting change for 34 with US coins works");
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 34;// amount to make change for
        int [] result = Coins.getChange(ar,amt);
        assertEquals(1, result[1]); // check that array spots match the coin value expected
        assertEquals(1, result[2]); // check that array spots match the coin value expected
        assertEquals(1, result[3]); // check that array spots match the coin value expected 
        assertEquals(1, result[4]); // check that array spots match the coin value expected
        assertEquals(5, result[5]); // check that array spots match the coin value expected
        assertEquals(25, result[25]); // check that array spots match the coin value expected
    }
    
        // unit test#6 - testing that getting change for 100 with US coins works
    @Test
    public void unitTest06(){
        System.out.println("getting change for 100 with US coins works");
        int[] ar = {1,5,10,25};  // array of US denomination coins
        int amt = 100;// amount to make change for
        int [] result = Coins.getChange(ar,amt);
        assertEquals(25, result[25]); // check that array spots match the coin value expected  
        assertEquals(25, result[50]); // check that array spots match the coin value expected
        assertEquals(25, result[75]); // check that array spots match the coin value expected
        assertEquals(25, result[100]); // check that array spots match the coin value expected
    }
        
        //change to be found is not a positive number
    @Test(expected = IllegalArgumentException.class)
    public void testGetChangeNegativeChange() {
        System.out.println("getting Change negative change requested finds error works");
        int[] a = {1,5,10,25};
        int b = -42;
        Coins.getChange(a, b);
    }

        //check to see if different coin systems work
    @Test
    public void testGetChangenonUS(){
        System.out.println("getting change for non US denominations works");
        int[] a = {1,5,10,21,25};
        int b = 63;
        int [] result = Coins.getChange(a,b);
        assertEquals(21,result[21]); // check that array spots match the coin value expected
        assertEquals(21,result[42]); // check that array spots match the coin value expected
        assertEquals(21,result[63]); // check that array spots match the coin value expected
    }
}
