package com.example.java.Dynamic;

public class CoinChange {
	
	public static int coin(int[] coins, int amount) {
		if(amount < 1) {
			return 0;
		}
		
		int[] arr = new int[amount+1];
		
		for(int i=1;i<=amount;i++) {
            arr[i] = Integer.MAX_VALUE;
            for(int coin:coins) {
            	if(coin <=i && arr[i-coin] != Integer.MAX_VALUE) {
                    arr[i] = Math.min(arr[i],1+arr[i-coin]);
            	}
            }
		}
		if(arr[amount] == Integer.MAX_VALUE) {
			return -1;
		}
		return arr[amount];
	}
	
    public static void main(String[] args) {

        // coins available and target amount
        int[] coins = {1, 3, 4};
        int amount = 6;

        // min coins needed to reach amount
        int result = CoinChange.coin(coins, amount);

        System.out.println(result == -1 ? "Not possible" : "Min coins: " + result);
    }

}
