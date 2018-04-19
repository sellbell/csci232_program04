package csci232_program04;

/**
 * Author: Selene Smith
 * Date: 4/13/18
 */

public class Coins {
    

    
    // method that makes change given an amount and set of coin denominations  
    public static int[] getChange(int[] coins, int amount){
        // throw exception if coin array is empty
        if(coins.length == 0){
            throw new IllegalArgumentException("Coin array is empty, cannot make change");
        }
        if(amount < 0)
        {
            throw new IllegalArgumentException("Change requested must be greater than 0");
        }
        int coinArray = new int[100];
        int[] combos = new int[amount + 1]; // make array big enough to hold combos for amount increments
        int[] lastUsed = new int[amount + 1]; // array to hold what the last coin used was
        
        // set first combo to 1
        combos[0] = 1;
        
        
       /********************
        try this
        for each loop //loop through each coin
        //if the number to be found is divisible by the coin value then put that coin value in for that spot in the array
        //this should put 5 in 5, 10 in 10 , 21 in 21, etc. if there is a coin with a value of 21
        if(i % coin == 0) 
            if(coinArray[i] == null || coin > coinArray[i]) //if the array spot is null then it's empty so put a coin in if it's not empty put the highest value coin it can take in
            {
                coinsArray[i] = coin;
            }
       ***********************/
        
        
        
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
        
        }
        System.out.println("combos.length is " + combos.length);
        for(int k = 0; k < combos.length-1; k++)
        {
            System.out.println("coin # "+ k + " " + combos[k] + " is in combos");
            //System.out.println("coin # "+ k + " " + coins[k]);
        }
        
        int[] coinsUsed = new int[amount]; // array to hold list of coins
        int counter = 0; // the loop counter for lastUsed array
        
        for(int n = amount; n > 0;){
            //System.out.print(lastUsed[n] + ", ");
            coinsUsed[counter] = lastUsed[n];
            counter++;
            
            n = n - lastUsed[n];
        }
        //System.out.println();
        
        //return combos[amount];
        return coinsUsed;
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
