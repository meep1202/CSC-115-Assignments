public class Fundraiser {
	private String name;
	private AuctionItem[] items;
	
	public Fundraiser() {
		this.name = null;
		this.items = null;
	}
	
	public Fundraiser(String name, AuctionItem[] items) {
		this.name = name;
		this.items = items;
	}
	
	public String getName() {
		return name;
	}
	
	public AuctionItem[] getItems() {
		return items;
	}
	
	public String toString() {
		if (items == null || items.length == 0) {
			return "Fundraiser without any items";
		}
		String s = name + "\nauction items:\n";
		for (int i = 0; i < items.length; i++) {
			s += items[i].toString();
		}
		return s;
	}
	
	/*
	 * Purpose: get the money raised, which will be the 
	 *          sum of all auction items that are sold
	 * Parameters: none
	 * Returns: int - the total money this fundraiser raises
	 */
	public int moneyRaised() {
		int total = 0;
		AuctionItem[] items = this.getItems();
		if (items != null) {
			for (int i = 0; i < items.length; i++) {
				total += items[i].getHighestBid();
			}
		}
		return total;
	}
	
	/*
	 * Purpose: get the total money spent at this fundraiser
	 *          by those with the given name
	 * Parameters: String name - the name to search for
	 * Returns: int - the total money spent by name
	 */
	public int moneySpent(String name) {
		int total = 0;
		AuctionItem[] items = this.getItems();
		if (items != null) {
			for (int i = 0; i < items.length; i++) {
				if (name.equals(items[i].getBidderName())) {
					total += items[i].getHighestBid();
				}
			}
		}
		return total;
	}
	
	/* 
	 * Purpose: get the most expensive auction item at this fundraiser
	 * Parameters: none
	 * Returns: AuctionItem - the most expensive item
	 * Preconditions: items is not null, and items.length > 0
	 */
	public AuctionItem mostExpensive() {
		AuctionItem mostExpensive = items[0];
		for (int i = 1; i < items.length; i++) {
			if (mostExpensive.getHighestBid() < items[i].getHighestBid()) {
				mostExpensive = items[i];
			}
		}
		return mostExpensive;
	}
	
	/* 
	 * Purpose: adds the new item to the items sold at this fundraiser
	 * Parameters: AuctionItem newItem - the item to add to the fundraiser
	 * Returns: void - nothing
	 */
	public void addToFundraiser(AuctionItem newItem) {
		AuctionItem[] array = this.getItems();
		AuctionItem[] temp = new AuctionItem[this.getItems().length + 1];
		if (array.length != 0) {
			for (int i = 0; i < temp.length-1; i++) {
				temp[i] = array[i];
			}
		}
		temp[temp.length-1] = newItem;
		this.items = temp;
	}
}