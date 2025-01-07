public class A2Exercises {
	
	/*
	 * Purpose: get the total money raised across all fundraisers
	 *          in the given array
	 * Parameters: Fundraiser[] array - the array of fundraisers
	 * Returns: int: total money raised across all fundraisers
	 * Precondition: the array is not null
	 */	
	public static int totalMoneyRaised(Fundraiser[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i].moneyRaised();
		}
		return total;
	}
	// Test failed - Try doing fundraiser method first then use this as total-er
	
	/*
	 * Purpose: get the total money spent on winning auctions 
	 *          by people with the provided name
	 * Parameters: Fundraiser[] array - the array of fundraisers
	 *             String name - the name to search for
	 * Returns: int: total money raised across all fundraisers
	 * Precondition: the array and name are not null
	 */	
	public static  int totalSpent(Fundraiser[] array, String name) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i].moneySpent(name);
		}
		return total;
	}

	/*
	 * Purpose: create a new array of AuctionItems that contains
	 *          only the most expensive item from each fundraiser
	 * Parameters: Fundraiser[] array - the array of fundraisers
	 * Returns: AuctionItem[]: the array of most expensive items
	 * Precondition: the array is not null
	 */	
	public static AuctionItem[] mostExpensiveItems(Fundraiser[] array) {
		AuctionItem[] expensives = new AuctionItem[array.length];
		for (int i = 0; i < array.length; i++) {
			expensives[i] = array[i].mostExpensive();
		}
		return expensives;
	}
	
	/*
	 * Purpose: calculate and return the average price of the most
	 *          expensive items from each fundraiser in the array
	 * Parameters: Fundraiser[] array - the array of fundraisers
	 * Returns: double - the average price of the most expensive items
	 * Precondition: the array is not null
	 */	
	public static double averageOfMostExpensive(Fundraiser[] array) {
		AuctionItem[] expensives = mostExpensiveItems(array);
		double total = 0;
		double count = 0;
		for (int i = 0; i < expensives.length; i++) {
			total += expensives[i].getHighestBid();
			count++;
		}
		if (count == 0) {
			return 0.0;
		}
		return (total/count);
	}
}