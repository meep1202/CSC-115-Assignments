// public class A4Grader {
// 	private static int testPassCount = 0;
// 	private static int testCount = 0;
	
// 	public static void main (String[] args)	{
// 		testCount = 0;
// 		testPassCount = 0;
		
// 		/* Part 1: Using the List ADT */		
// 		testCompetitorsCount();
// 		testCountScoresAboveX();
// 		testDistanceAway();
// 		testGetBestCompetitorName();
// 		testNumberTimesRecordBroken();
// 		testListOfRecordBreakers();
		
// 		/* Part 2: Implementing the Generic Stack ADT */
// 		testStackOperations();
// 		testStackIsGeneric();
		
// 		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
// 	}
	

// 	public static void testCompetitorsCount() {
// 		System.out.println("\nTesting competitorsCount...");
		
// 		Competitor c1  = new Competitor("Ali",  37); 
// 		Competitor c2  = new Competitor("Sam",  18);
// 		Competitor c3  = new Competitor("Lee",  49); 
// 		Competitor c4  = new Competitor("Jo",   53); 
// 		Competitor c5  = new Competitor("Dani", 41); 
// 		Competitor c6  = new Competitor("Zee",  52); 
// 		Competitor c7  = new Competitor("Ola",  75); 
// 		Competitor c8  = new Competitor("Mary", 24); 
// 		Competitor c9  = new Competitor("Theo", 72); 
// 		Competitor c10 = new Competitor("Ali",  91); 
// 		Competitor c11 = new Competitor("Tay",  80); 
// 		Competitor c12 = new Competitor("Luis", 88); 
		
// 		Competitor[] arr1 = {c1};
// 		Competitor[] arr2 = {c1, c4, c3, c2};
// 		Competitor[] arr3 = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12};
		
// 		List list1 = new ArrayList(arr1);
// 		List list2 = new ArrayList(arr2);
// 		List list3 = new ArrayList(arr3);
		
// 		int result = 0;
// 		int expected = 0;
		
// 		result = A4Exercises.competitorsCount(list1);
// 		expected = 1;
// 		displayResults(result == expected, "competitorsCount(list1)");
		
// 		result = A4Exercises.competitorsCount(list2);
// 		expected = 4;
// 		displayResults(result == expected, "competitorsCount(list2)");
		
// 		result = A4Exercises.competitorsCount(list3);
// 		expected = 12;
// 		displayResults(result == expected, "competitorsCount(list3)");
		
// 		// Add tests until you are sure your implementation 
// 		// produces the correct result for all inputs

// 		Competitor[] arr4 = {c5, c6, c7, c8, c9, c10};
// 		List list4 = new ArrayList(arr4);
		
// 		result = A4Exercises.competitorsCount(list4);
// 		expected = 6;
// 		displayResults(result == expected, "competitorsCount(list4)");

// 	}
	
	
// 	public static void testCountScoresAboveX() {
// 		System.out.println("\nTesting countScoresAboveX...");
		
// 		Competitor c1  = new Competitor("Ali",  37); 
// 		Competitor c2  = new Competitor("Sam",  18);
// 		Competitor c3  = new Competitor("Lee",  49); 
// 		Competitor c4  = new Competitor("Jo",   53); 
// 		Competitor c5  = new Competitor("Dani", 41); 
// 		Competitor c6  = new Competitor("Zee",  52); 
// 		Competitor c7  = new Competitor("Ola",  75); 
// 		Competitor c8  = new Competitor("Mary", 24); 
// 		Competitor c9  = new Competitor("Theo", 72); 
// 		Competitor c10 = new Competitor("Ali",  91); 
// 		Competitor c11 = new Competitor("Tay",  80); 
// 		Competitor c12 = new Competitor("Luis", 88); 
		
// 		Competitor[] arr1 = {c1};
// 		Competitor[] arr2 = {c1, c4, c3, c2};
// 		Competitor[] arr3 = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12};
		
// 		List list1 = new ArrayList(arr1);
// 		List list2 = new ArrayList(arr2);
// 		List list3 = new ArrayList(arr3);
		
// 		int result = 0;
// 		int expected = 0;
		
// 		result = A4Exercises.countScoresAboveX(list1, 30);
// 		expected = 1;
// 		displayResults(result == expected, "countScoresAboveX(list1, 30)");
// 		result = A4Exercises.countScoresAboveX(list1, 40);
// 		expected = 0;
// 		displayResults(result == expected, "countScoresAboveX(list1, 40)");
		
// 		result = A4Exercises.countScoresAboveX(list2, 40);
// 		expected = 2;
// 		displayResults(result == expected, "countScoresAboveX(list2, 40)");
// 		result = A4Exercises.countScoresAboveX(list2, 50);
// 		expected = 1;
// 		displayResults(result == expected, "countScoresAboveX(list2, 50)");
		
// 		// Add tests until you are sure your implementation 
// 		// produces the correct result for all inputs
		
// 		result = A4Exercises.countScoresAboveX(list3, 80);
// 		expected = 2;
// 		displayResults(result == expected, "countScoresAboveX(list3, 80)");
// 		result = A4Exercises.countScoresAboveX(list3, 50);
// 		expected = 7;
// 		displayResults(result == expected, "countScoresAboveX(list3, 50)");
		
// 	}


// 	public static void testDistanceAway() {
// 		System.out.println("\nTesting distanceAway...");
		
// 		Competitor c1  = new Competitor("Ali",  37); 
// 		Competitor c2  = new Competitor("Sam",  18);
// 		Competitor c3  = new Competitor("Lee",  49); 
// 		Competitor c4  = new Competitor("Jo",   53); 
// 		Competitor c5  = new Competitor("Dani", 41); 
// 		Competitor c6  = new Competitor("Zee",  52); 
// 		Competitor c7  = new Competitor("Ola",  75); 
// 		Competitor c8  = new Competitor("Mary", 24); 
// 		Competitor c9  = new Competitor("Theo", 72); 
// 		Competitor c10 = new Competitor("Ali",  91); 
// 		Competitor c11 = new Competitor("Tay",  80); 
// 		Competitor c12 = new Competitor("Luis", 88); 
		
// 		Competitor[] arr1 = {c1};
// 		Competitor[] arr2 = {c1, c4, c3, c2};
// 		Competitor[] arr3 = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12};
		
// 		List list1 = new ArrayList(arr1);
// 		List list2 = new ArrayList(arr2);
// 		List list3 = new ArrayList(arr3);
		
// 		int result = 0;
// 		int expected = 0;
		
// 		result = A4Exercises.distanceAway(list1, c1);
// 		expected = 0;
// 		displayResults(result==expected, "distanceAway(list1, c1)");
		
// 		result = A4Exercises.distanceAway(list2, c2);
// 		expected = 3;
// 		displayResults(result==expected, "distanceAway(list2, c2)");
		
// 		result = A4Exercises.distanceAway(list3, c3);
// 		expected = 2;
// 		displayResults(result==expected, "distanceAway(list3, c3)");

// 		// Add tests until you are sure your implementation 
// 		// produces the correct result for all inputs
		
// 		result = A4Exercises.distanceAway(list1, c2);
// 		expected = -1;
// 		displayResults(result==expected, "distanceAway(list1, c2)");
		
// 		result = A4Exercises.distanceAway(list2, c1);
// 		expected = 0;
// 		displayResults(result==expected, "distanceAway(list2, c1)");
		
// 		result = A4Exercises.distanceAway(list3, c12);
// 		expected = 11;
// 		displayResults(result==expected, "distanceAway(list1, c8)");
		
// 		Competitor[] arr4 = {c4, c4, c7, c4, c8, c1, c7, c3};
// 		List list4 = new ArrayList(arr4);
		
// 		result = A4Exercises.distanceAway(list4, c4);
// 		expected = 0;
// 		displayResults(result==expected, "distanceAway(list4, c4)");
		
// 		result = A4Exercises.distanceAway(list4, c7);
// 		expected = 2;
// 		displayResults(result==expected, "distanceAway(list4, c7)");	

// 		result = A4Exercises.distanceAway(list4, c1);
// 		expected = 5;
// 		displayResults(result==expected, "distanceAway(list4, c1)");				
		
// 	}
	

// 	public static void testGetBestCompetitorName() {
// 		System.out.println("\nTesting getBestCompetitorName...");
		
// 		Competitor c1  = new Competitor("Ali",  37); 
// 		Competitor c2  = new Competitor("Sam",  18);
// 		Competitor c3  = new Competitor("Lee",  49); 
// 		Competitor c4  = new Competitor("Jo",   53); 
// 		Competitor c5  = new Competitor("Dani", 41); 
// 		Competitor c6  = new Competitor("Zee",  52); 
// 		Competitor c7  = new Competitor("Ola",  75); 
// 		Competitor c8  = new Competitor("Mary", 24); 
// 		Competitor c9  = new Competitor("Theo", 72); 
// 		Competitor c10 = new Competitor("Ali",  91); 
// 		Competitor c11 = new Competitor("Tay",  80); 
// 		Competitor c12 = new Competitor("Luis", 88); 
		
// 		Competitor[] arr1 = {c1};
// 		Competitor[] arr2 = {c1, c4, c3, c2};
// 		Competitor[] arr3 = {c1, c2, c3, c4};
// 		Competitor[] arr4 = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12};
		
// 		List list1 = new ArrayList(arr1);
// 		List list2 = new ArrayList(arr2);
// 		List list3 = new ArrayList(arr3);
// 		List list4 = new ArrayList(arr4);
		
// 		String result = "";
// 		String expected = "";
		
// 		result = A4Exercises.getBestCompetitorName(list1);
// 		expected = "Ali";
// 		displayResults(result.equals(expected), "getBestCompetitorName(list1)");
		
// 		result = A4Exercises.getBestCompetitorName(list2);
// 		expected = "Jo";
// 		displayResults(result.equals(expected), "getBestCompetitorName(list2)");

// 		result = A4Exercises.getBestCompetitorName(list3);
// 		expected = "Jo";
// 		displayResults(result.equals(expected), "getBestCompetitorName(list3)");
		
// 		result = A4Exercises.getBestCompetitorName(list4);
// 		expected = "Ali";
// 		displayResults(result.equals(expected), "getBestCompetitorName(list3)");
		
// 		// Write more of your own tests here
		
// 		Competitor[] arr5 = {c7, c2, c1};
// 		Competitor[] arr6 = {c2, c1, c7};
// 		Competitor[] arr7 = {c1, c3, c9, c2, c8, c5, c4};
// 		List list5 = new ArrayList(arr5);
// 		List list6 = new ArrayList(arr6);
// 		List list7 = new ArrayList(arr7);

// 		result = A4Exercises.getBestCompetitorName(list5);
// 		expected = "Ola";
// 		displayResults(result.equals(expected), "getBestCompetitorName(list5)");
		
// 		result = A4Exercises.getBestCompetitorName(list6);
// 		expected = "Ola";
// 		displayResults(result.equals(expected), "getBestCompetitorName(list6)");
		
// 		result = A4Exercises.getBestCompetitorName(list7);
// 		expected = "Theo";
// 		displayResults(result.equals(expected), "getBestCompetitorName(list7)");
// 	}
	
	
// 	public static void testNumberTimesRecordBroken() {
// 		System.out.println("\nTesting numberTimesRecordBroken...");
		
// 		Competitor c1  = new Competitor("Ali",  37); 
// 		Competitor c2  = new Competitor("Sam",  18);
// 		Competitor c3  = new Competitor("Lee",  49); 
// 		Competitor c4  = new Competitor("Jo",   53); 
// 		Competitor c5  = new Competitor("Dani", 41); 
// 		Competitor c6  = new Competitor("Zee",  52); 
// 		Competitor c7  = new Competitor("Ola",  75); 
// 		Competitor c8  = new Competitor("Mary", 24); 
// 		Competitor c9  = new Competitor("Theo", 72); 
// 		Competitor c10 = new Competitor("Ali",  91); 
// 		Competitor c11 = new Competitor("Tay",  80); 
// 		Competitor c12 = new Competitor("Luis", 88); 
		
// 		Competitor[] arr1 = {c1};
// 		Competitor[] arr2 = {c1, c4, c3, c2};
// 		Competitor[] arr3 = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12};
		
// 		List list1 = new ArrayList(arr1);
// 		List list2 = new ArrayList(arr2);
// 		List list3 = new ArrayList(arr3);
		
// 		int result = 0;
// 		int expected = 0;		
		
// 		result = A4Exercises.numberTimesRecordBroken(list1);
// 		expected = 1;
// 		displayResults(result==expected, "numberTimesRecordBroken(list1)");
		
// 		result = A4Exercises.numberTimesRecordBroken(list2);
// 		expected = 2;
// 		displayResults(result==expected, "numberTimesRecordBroken(list2)");

// 		result = A4Exercises.numberTimesRecordBroken(list3);
// 		expected = 5;
// 		displayResults(result==expected, "numberTimesRecordBroken(list3)");
		
// 		// Write more of your own tests here
		
// 		Competitor[] arr4 = {c2, c1, c3, c4};
// 		Competitor[] arr5 = {c4, c3, c1, c2};
// 		Competitor[] arr6 = {c5, c5, c5, c5};
// 		Competitor[] arr7 = {c2, c2, c4, c4, c4, c4, c7, c7, c7};
// 		Competitor[] arr8 = {c2, c4, c4, c2};
// 		List list4 = new ArrayList(arr4);
// 		List list5 = new ArrayList(arr5);
// 		List list6 = new ArrayList(arr6);
// 		List list7 = new ArrayList(arr7);
// 		List list8 = new ArrayList(arr8);

// 		result = A4Exercises.numberTimesRecordBroken(list4);
// 		expected = 4;
// 		displayResults(result==expected, "numberTimesRecordBroken(list4)");

// 		result = A4Exercises.numberTimesRecordBroken(list5);
// 		expected = 1;
// 		displayResults(result==expected, "numberTimesRecordBroken(list5)");
		
// 		result = A4Exercises.numberTimesRecordBroken(list6);
// 		expected = 1;
// 		displayResults(result==expected, "numberTimesRecordBroken(list6)");
		
// 		result = A4Exercises.numberTimesRecordBroken(list7);
// 		expected = 3;
// 		displayResults(result==expected, "numberTimesRecordBroken(list7)");
		
// 		result = A4Exercises.numberTimesRecordBroken(list8);
// 		expected = 2;
// 		displayResults(result==expected, "numberTimesRecordBroken(list8)");
// 	}

// 	private static boolean equal(String[] a1, String[] a2) {
// 		boolean equal = true;
// 		if ((a1 == null || a2 == null) && a1 != a2) { // one is null
// 			equal = false;
// 		} else if (a1.length != a2.length) { // different lengths
// 			equal = false;
// 		} else {
// 			int i = 0; 
// 			while (i < a1.length && equal == true) {
// 				if (!a1[i].equals(a2[i])) {
// 					equal = false;
// 				}
// 				i++;
// 			}
// 		}
// 		return equal;
// 	}

// 	public static void testListOfRecordBreakers() {
// 		System.out.println("\n Testing listOfRecordBreakers...");
		
// 		Competitor c1  = new Competitor("Ali",  37); 
// 		Competitor c2  = new Competitor("Sam",  18);
// 		Competitor c3  = new Competitor("Lee",  49); 
// 		Competitor c4  = new Competitor("Jo",   53); 
// 		Competitor c5  = new Competitor("Dani", 41); 
// 		Competitor c6  = new Competitor("Zee",  52); 
// 		Competitor c7  = new Competitor("Ola",  75); 
// 		Competitor c8  = new Competitor("Mary", 24); 
// 		Competitor c9  = new Competitor("Theo", 72); 
// 		Competitor c10 = new Competitor("Ali",  91); 
// 		Competitor c11 = new Competitor("Tay",  80); 
// 		Competitor c12 = new Competitor("Luis", 88); 
		
// 		Competitor[] arr1 = {c1};
// 		Competitor[] arr2 = {c1, c4, c3, c2};
// 		Competitor[] arr3 = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12};
		
// 		List list1 = new ArrayList(arr1);
// 		List list2 = new ArrayList(arr2);
// 		List list3 = new ArrayList(arr3);
		
// 		String[] result = null;
// 		String[] expected1 = {"Ali"};
// 		String[] expected2 = {"Ali", "Jo"};
// 		String[] expected3 = {"Ali", "Lee", "Jo", "Ola", "Ali"};
		
// 		result = A4Exercises.listOfRecordBreakers(list1);
// 		displayResults(equal(result,expected1), "listOfRecordBreakers(list1)");
		
// 		result = A4Exercises.listOfRecordBreakers(list2);
// 		displayResults(equal(result,expected2), "listOfRecordBreakers(list2)");
		
// 		result = A4Exercises.listOfRecordBreakers(list3);
// 		displayResults(equal(result,expected3), "listOfRecordBreakers(list3)");
		
// 		// Write more of your own tests here
		
// 		Competitor[] arr4 = {c2, c8, c1, c5, c3, c6, c4, c9, c7, c11, c12, c10};
// 		Competitor[] arr5 = {};
// 		Competitor[] arr6 = {c9, c11, c12, c10};
// 		Competitor[] arr7 = {c10, c9, c11, c12};
		
// 		List list4 = new ArrayList(arr4);
// 		List list5 = new ArrayList(arr5);
// 		List list6 = new ArrayList(arr6);
// 		List list7 = new ArrayList(arr7);
		
// 		String[] expected4 = {"Sam", "Mary", "Ali", "Dani", "Lee", "Zee", "Jo", "Theo", "Ola", "Tay", "Luis", "Ali"}; 
// 		String[] expected5 = {};
// 		String[] expected6 = {"Theo", "Tay", "Luis", "Ali"};
// 		String[] expected7 = {"Ali"};
		
// 		result = A4Exercises.listOfRecordBreakers(list4);
// 		displayResults(equal(result,expected4), "listOfRecordBreakers(list4)");
		
// 		// result = A4Exercises.listOfRecordBreakers(list5);
// 		// displayResults(equal(result,expected5), "listOfRecordBreakers(list5)");
		
// 		result = A4Exercises.listOfRecordBreakers(list6);
// 		displayResults(equal(result,expected6), "listOfRecordBreakers(list6)");
		
// 		result = A4Exercises.listOfRecordBreakers(list7);
// 		displayResults(equal(result,expected7), "listOfRecordBreakers(list7)");
		
// 	}

// 	public static void testStackOperations() {
// 		System.out.println("\nTesting stack operations...");
// 		A4Stack<Integer> testStack = new A4Stack<Integer>();
// 		Integer result = 0;
		
// 		displayResults(testStack.isEmpty(), "stack initially empty");
				
// 		testStack.push(2);
// 		result = testStack.peek();
// 		displayResults(!testStack.isEmpty(), "stack no longer empty");
// 		displayResults(result.equals(2), "peek works after initial push");
		
// 		// Write more of your own tests here
		
// 		testStack.push(5);
// 		result = testStack.peek();
// 		displayResults(!testStack.isEmpty(), "stack not empty");
// 		displayResults(result.equals(5), "top works after second push");
		
// 		result = testStack.pop();
// 		displayResults(!testStack.isEmpty(), "stack not empty");
// 		displayResults(result.equals(5), "correct value returned from pop");
		
// 		result = testStack.peek();
// 		displayResults(result.equals(2), "top works after pop");
		
// 		result = testStack.pop();
// 		displayResults(testStack.isEmpty(), "stack is empty again");
// 		displayResults(result.equals(2), "correct value returned from pop");
		
// 		// result = testStack.peek();
// 		// displayResults(result == null, "peek from an empty stack is null");
// 		result = testStack.pop();
// 		displayResults(testStack.isEmpty(), "popping from an empty stack is still empty");
// 		displayResults(result == null, "pop from an empty stack returns null");
// 		// result = testStack.peek();
// 		// displayResults(result == null, "peek from an empty stack is null");
		
// 		testStack.push(9);
// 		result = testStack.peek();
// 		displayResults(!testStack.isEmpty(), "stack is no longer empty");
// 		displayResults(result.equals(9), "correct value returned from top");		
		
// 		A4Stack<Integer> s2 = new A4Stack<Integer>();
				
// 		for (int i = 0; i <= 4; i++) {
// 			try{
// 				s2.push(i);
// 			}catch(Exception e){
// 				System.out.println(e);
// 			}
// 		}
// 		displayResults(!s2.isEmpty(), "stack is no longer empty");
// 		displayResults(s2.pop()==4, "checking popped element values");
		
// 		for (int i=3; i>=0; i--) {
// 			displayResults(s2.pop()==i, "checking popped element values");
// 		}
// 		displayResults(s2.isEmpty(), "stack is now empty");
// 		displayResults(s2.pop()==null, "popping from empty stack");
// 		// displayResults(s2.peek()==null, "top of empty stack");
// 		displayResults(s2.isEmpty(), "stack is empty");
		
// 		s2.push(4);
// 		displayResults(!s2.isEmpty(), "stack is no longer empty");
// 		displayResults(s2.peek().equals(4), "stack is no longer empty");

// 	}
	
// 	public static void testStackIsGeneric() {
// 		System.out.println("\nTesting generics...");
// 		A4Stack<Integer> s1 = new A4Stack<Integer>();
// 		A4Stack<String> s2 = new A4Stack<String>();
// 		A4Stack<Double> s3 = new A4Stack<Double>();
		
// 		Integer result1;
// 		String result2;
// 		Double result3;
		
// 		s1.push(3);
// 		s1.push(8);
// 		s2.push("CSC");
// 		s2.push("ENGR");
// 		s3.push(5.5);
// 		s3.push(9.1);
		
// 		result1 = s1.pop();
// 		result2 = s2.pop();
// 		result3 = s3.pop();
		
// 		displayResults(result1.equals(8), "Integer Stack");
// 		displayResults(result2.equals("ENGR"), "String Stack");
// 		displayResults(result3.equals(9.1), "Double Stack");		

// 		// Write more of your own tests here

// 		result1 = s1.peek();
// 		result2 = s2.peek();
// 		result3 = s3.peek();
		
// 		displayResults(result1.equals(3), "Integer Stack");
// 		displayResults(result2.equals("CSC"), "String Stack");
// 		displayResults(result3.equals(5.5), "Double Stack");
				
// 	}
	
// 	public static void displayResults (boolean passed, String testName) {
// 		testCount++;
// 		if (passed)	{
// 			System.out.println ("Passed test: " + testCount);
// 			testPassCount++;
// 		} else {
// 			System.out.println ("Failed test: " + testName + " at line "
// 								+ Thread.currentThread().getStackTrace()[2].getLineNumber());
// 		}
// 	}
// }