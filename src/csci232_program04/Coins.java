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
    
    static int[] coinArray = new int[101];
    
    // method that makes change given an amount and set of coin denominations  
    public static void getChange(int[] coins){
        // throw exception if coin array is empty
        if(coins.length == 0){
            throw new IllegalArgumentException("Coin array is empty, cannot make change");
        }
        int amount = 100;
        
//        int[] combos = new int[amount + 1]; // make array big enough to hold combos for amount increments
//        int[] lastUsed = new int[amount + 1]; // array to hold what the last coin used was
        
        // set first combo to 1
//        combos[0] = 1;
        coinArray[0] = 1;
        //try this
        for(int i = 0; i < coins.length; i++)// loop through each coin
            for(int j = 0; j < coinArray.length; j++){
            //if the number to be found is divisible by the coin value then put that coin value in for that spot in the array
            //this should put 5 in 5, 10 in 10 , 21 in 21, etc. if there is a coin with a value of 21
            if(amount >= coins[i])    
            {
                coinArray[amount] += coinArray[amount - coins[i]];
            }
            
            
            
//            
//            if(j % coins[i] == 0) {
//                    if(coins[i] > coinArray[j]) //put the highest value coin it can take into the array spot
//                    {
//                        coinArray[j] = coins[i];
//                        if(coinArray[j] - coins[i])
//                    }
//                }
            }
        coinArray[0] = 0;
       /*
        // loop thru each 'coin' in denomination array
        for(int j = 0; j < coins.length; j++){
            for(int i = 1; i < combos.length; i++){
                System.out.println(coins[j]);
                if(i < coins[j]){
                    combos[i] = coins[j];//+= combos[i - coins[j]];
                    lastUsed[i] = coins[j];
                   System.out.println("coin # "+ i + " " + combos[i] + " is in combos");
//                    System.out.println("coin # "+ i + " " + coin);
                }
                else{
                    combos[i] = 1;
                }
            }
        
        }*/
        //System.out.println("combos.length is " + combos.length);
        for(int k = 0; k < coinArray.length; k++)
        {
            System.out.println("coin # "+ k + " " + coinArray[k] + " is in coinArray");
            //System.out.println("coin # "+ k + " " + coins[k]);
        }
        
//        int[] coinsUsed = new int[amount]; // array to hold list of coins
//        int counter = 0; // the loop counter for lastUsed array
//        
//        for(int n = amount; n > 0;){
//            //System.out.print(lastUsed[n] + ", ");
//            coinsUsed[counter] = lastUsed[n];
//            counter++;
//            
//            n = n - lastUsed[n];
//        }
        //System.out.println();
        
        //return combos[amount];
        //return coinArray;
    }
     public static int[] makeChange(int amount){
         if(amount < 0)
        {
            throw new IllegalArgumentException("Change requested must be greater than 0");
        }
         int[] combos = new int[14];
         int temp = 0;
         for(int k = 0; k < combos.length-1; k++)
         {
             
             combos[k] = coinArray[amount];
             amount = amount - coinArray[amount];
         }
         return combos;
     }
}



/* TEST STUFF FOR ME */

//    public static void main(String[] args){
//        int[] tmp = getChange(new int[]{1,5,10,25}, 77);
//        
//        System.out.print("Coins: ");
//        for(int i =0; i < tmp.length; i++){
//            if(tmp[i] != 0){
//                System.out.print(tmp[i] + ", ");
//            }
//        }
//    }
