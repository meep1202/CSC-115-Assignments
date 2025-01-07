// public class A5Exercises {

// 	/*
// 	 * Purpose: change all occurrences of x to y in the given list
// 	 * Parameters: List<T> theList - the list to search through
// 	 *			   T x - the value to change
// 	 *			   T y = the value to change all x's to
// 	 * Returns: void - nothing
// 	 */
// 	public static<T> void changeXToY(List<T> theList, T x, T y) {
// 		changeXToY(theList, x, y, 0);
// 	}


// 	private static<T> void changeXToY(List<T> listo, T x, T y, int pos) {
// 		if (listo.isEmpty()) {
// 			return;
// 		}
// 		try {
// 			if (listo.get(pos) == x) {
// 				listo.change(pos, y);
// 			}
// 			changeXToY(listo, x, y, pos + 1);
// 		}
// 		catch (Exception NullPointerException) {
// 			return;
// 		}
// 	}
	
// 	/*
// 	 * Purpose: count the total number of odd values in this list
// 	 * Parameters: List<Integer> theList - the list of Integers
// 	 * Returns: int - the total number of odd values found
// 	 */
// 	public static int countOdd(List<Integer> theList) {
// 		return countOdd(theList, 0, 0);
// 	}


// 	private static int countOdd(List<Integer> listo, int pos, int count) {
// 		if (listo.isEmpty()) {
// 			return 0;
// 		}
// 		try {
// 			if (listo.get(pos) % 2 != 0) {
// 				count++;
// 			}
// 			return countOdd(listo, pos + 1, count);
// 		}
// 		catch (Exception NullPointerException) {
// 			return count;
// 		}
// 	}
	

// 	/*
// 	 * Purpose: get the largest sequence of odd values found in a row
// 	 * Parameters: List<Integer> theList - the list of Integers
// 	 * Returns: int - the largest sequence of odd values found in a row
// 	 */
// 	public static int countMostOddInARow(List<Integer> theList) {
// 		return countMostOddInARow(theList, 0, 0, 0);
// 	}


// 	private static int countMostOddInARow(List<Integer> listo, int pos, int count, int maxcount) {
// 		if (listo == null) {
// 			return 0;
// 		}
// 		try {
// 			if (listo.get(pos) % 2 != 0) {
// 				count++;
// 			}
// 			else {
// 				count = 0;
// 			}
// 			if (count > maxcount) {
// 				maxcount = count;
// 			}
// 			return countMostOddInARow(listo, pos+1, count, maxcount);
// 		}
// 		catch (Exception NullPointerException) {
// 			return maxcount;
// 		}
// 	}
	
	
// 	/*
// 	 * Purpose: count the elements found in between the first two x's
// 	 * Parameters: List<Integer> theList - the list of Integers
// 	 *             int x - the values to search for
// 	 * Returns: int - the number of values in the list found 
// 	 *                between the first 2 occurrences if x,
// 	 *                or -1 if there are not 2 x's in the list.
// 	 */
// 	public static int countBetweenX(List<Integer> theList, int x) {
// 		return countBetweenX(theList, x, 0, 0, false, false);
// 	}


// 	private static int countBetweenX(List<Integer> listo, int x, int pos, int count, boolean start, boolean done) {
// 		try {
// 			if (listo.get(pos) == x && start == false && done == false) {  // if first x
// 				start = true;
// 			}
// 			else if (listo.get(pos) == x && start == true) {  // if second x
// 				start = false;
// 				done = true;
// 			}
// 			else if (start == true && done == false) {  // if after first x but not == second x
// 				count++;
// 			}
// 			return countBetweenX(listo, x, pos+1, count, start, done);
// 		}
// 		catch (Exception nullPointerException) {
// 			if (done == false) {
// 				return -1;
// 			}
// 			return count;
// 		}
// 	}

	
// }