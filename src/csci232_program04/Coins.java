package csci232_program04;

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

public class Coins {
    

    
    // method that makes change given an amount and set of coin denominations  
    public static int[] getChange(int[] coins, int total){
        // throw exception if coin array is empty
        if(coins.length == 0){
            throw new IllegalArgumentException("Coin array is empty, cannot make change");
        }
        if(total < 0) //if the change amount requested is less than zero throw an exception
        {
            throw new IllegalArgumentException("Change requested must be greater than 0");
        }
        
        int minCoins[] = new int[total + 1]; //keeps track of the minimum amount of coins needed
        int allChange[] = new int[total + 1]; //keeps track of the coins that are used to make the change
        minCoins[0] = 0; //takes zero coins to make change of 0
        for(int i=1; i <= total; i++){
            minCoins[i] = 100; //starts with a large amount of coins being needed to make the change. While U.S. coins would have a max of 9 this is higher to account for other denominations
        }
        for(int j=0; j < coins.length; j++){
            for(int i=1; i <= total; i++){
                if(i >= coins[j]){ //if i is greater than or equal to the coin value that's at spot j
                    //if the minimum number of coins at spot (i - the coin value at spot j) + 1 is less than the minimum number of coins at spot i
                    //if the minimum amount of coins needed for the current value is less than the coins needed for the previous value then 
                    //change the number of coins to the smaller value and store the value of the coin in the coins used array
                    if (minCoins[i - coins[j]] + 1 < minCoins[i]) {
                        minCoins[i] = minCoins[i - coins[j]] + 1;
                        allChange[i] = coins[j];
                    }//end of inner if
                }//end of outer if
            }// end of inner for loop
        } //end of outer for loop
        
        int coinsUsed[] = new int[total];//array to hold the coins being used
        int counter = 0; //variable to keep track of the array spot in coinsUsed
        for(int n = total; n > 0; counter++) //goes through the all change array decrementing by the value of the last coin used to make change
        {
            coinsUsed[counter] = allChange[n]; //stores the coin used to make change in the new aray
            n = n - allChange[n]; //decrements the change needed by the value of the last coin
        }
        /* //prints the array spot of the coins used and the value in that spot. good for testing
        for(int j = 0; j < coinsUsed.length; j++){
        System.out.println("This is coinsUsed array in spot " + j + " " + coinsUsed[j]);
        }*/
        
        return coinsUsed;
    }
}
