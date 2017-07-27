/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Solution{
	public int maxProfit(int[] stocks){
		int profit = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < stocks.length; i++){
			while(i < stocks.length - 1 && stocks[i+1] <= stocks[i]) i++;
			min = sotcks[i];
			while(i < stocks.length - 1 && stocks[i+1] >= stocks[i]) i++;
			profit += stocks[i] - min;
		}
		return profit;
	}
}