// /*
//  * represents a line-up to get into the venue of a music concert
//  */

// public class ConcertLine {

// 	private PriorityQueue attendees;

// 	/* 
//  	 * constructor that initializes attendees to a default-sized priority queue
// 	 */
// 	public ConcertLine() {
// 		attendees = new HeapPriorityQueue();
// 	}

// 	/* 
// 	 * constructor that initializes attendees to a priority queue of given size
// 	 */
// 	public ConcertLine(int size) {
// 		attendees = new HeapPriorityQueue(size);
// 	}


// 	/* Purpose: add given Attendee to attendees line or prints
// 	 *          a notification message if attendees is full
// 	 * Parameters: Attendee a - the attendee who just arrived at
// 	 *             the concert and wants to enter the venue
// 	 * Returns: void - nothing
// 	 */
// 	public void addAttendee(Attendee a) {
// 		try {
// 			attendees.insert(a);
// 		}
// 		catch (Exception HeapFullException) {
// 			System.out.println("\nAttendees Full\n");
// 		}
// 	}


// 	/* Purpose: gets the number of attendees waiting to get in
// 	 * Parameters: none
// 	 * Returns: int - number of attendees waiting to get in
// 	 */
// 	public int numAttendeesWaiting() {
// 		return attendees.size();
// 	}


// 	/* Purpose: removes and returns the next attendee from attendees
// 	 * Parameters: none
// 	 * Returns: Attendee - the next attendee, null if there are no more
// 	 *                     attendees waiting to get into the venue.
// 	 */
// 	public Attendee nextAttendee() {
// 		try {
// 			return (Attendee) attendees.removeMin();
// 		}
// 		catch (Exception HeapEmptyException) {
// 			return null;
// 		}
// 	}
// }

