package csci232_program04;

/**
 * Author: Selene Smith
 * Date: 4/13/18
 */

public class Coins {
    

    
    // method that makes change given an amount and set of coin denominations  
    public static int[] getChange(int[] coins, int amount){
        // thow exception if coin array is empty
        if(coins.length == 0){
            throw new IllegalArgumentException("Coin array is empty, cannot make change");
        }
        
        int[] combos = new int[amount + 1]; // make array big enough to hold combos for amount increments
        int[] lastUsed = new int[amount + 1]; // array to hold what the last coin used was
        
        // set first combo to 1
        combos[0] = 1;
       
        // loop thru each 'coin' in denomination array
        for(int coin : coins){
            for(int i = 1; i < combos.length; i++){
                if(i >= coin){
                    combos[i] += combos[i - coin];
                    lastUsed[i] = coin;
                    //System.out.println("coin # "+ i + " " + coin);
                }
            }
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
