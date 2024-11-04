package br.com.leetcode.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
class BestTimeBuySellStock {
	
    public int maxProfit(int[] prices) {
    	
    	int buyPrice = prices[0];
    	int total = 0;
    	for(int i = 0; i < prices.length; i++) {
    		
    		int indexNextSellPrice = findIndexNextSellPrice(i+1, prices, buyPrice);
    		
    		if(indexNextSellPrice == 0) {
    			int indexNextItem = i + 1;
    			if(prices.length > indexNextItem) {
    				buyPrice = prices[indexNextItem];
    			}
    			continue;
    		}
    		
    		total+= prices[indexNextSellPrice] - buyPrice;
			int indexNextItem = indexNextSellPrice + 1;
			if(prices.length > indexNextItem) {
				buyPrice = prices[indexNextItem];
			}
			
			i = indexNextItem - 1;
    	}
    	
    	return total;
    }
    
    public int findIndexNextSellPrice(int startIndex, int[] prices, int buyPrice) {
    	
    	int indexReturnt = 0;
    	for(int i = startIndex; i < prices.length; i++) {
    		if(buyPrice < prices[i]) {
    			
    			int indexNextItem = i + 1;
    			if(prices.length > indexNextItem && prices[i] < prices[indexNextItem]) {// vê se tem um maior 
    				
    				int indexNextSellPrice = findIndexNextSellPrice(indexNextItem, prices, buyPrice);
    				if(prices[indexNextSellPrice] >= prices[indexNextItem]) {
    					return indexNextSellPrice;
    				}else {
    					return indexNextItem;
    				}
    			}else {
    				return i;
    			}
    		}
    	}
    	
    	return indexReturnt;
    }


	public static void main(String[] args) {
		System.out.println(new BestTimeBuySellStock().maxProfit(new int[] { 7,1,5,3,6,4 }));
	}
}
