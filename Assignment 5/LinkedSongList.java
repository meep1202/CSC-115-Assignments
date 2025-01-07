public class LinkedSongList {
	// DO NOT ADD ANY MORE FIELDS OR METHODS
	private SongNode head;
	
	public LinkedSongList() {
		head = null;
	}

	public void addFront (Song s) {
		SongNode n = new SongNode(s);
		n.next = head;
		head = n;
	}

	public void addBack (Song s){
		SongNode n = new SongNode(s);
		if (head == null) {
			head = n;
		} else {
			addBackRec(head, n);
		}
	}
	
	private void addBackRec(SongNode cur, SongNode n) {
		if (cur.next == null) {
			cur.next = n;
		} else {
			addBackRec(cur.next, n);
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Song get (int position) {
		return getRec(head, 0, position);
	}
	
	private Song getRec(SongNode cur, int i, int position) {
		if (i == position) {
			return cur.getData();
		} else {
			return getRec(cur.next, i+1, position);
		}
	}

	/* Purpose: create a string representation of list
	 * Parameters: nothing	 
	 * Returns: String - the string representation of the list
	 */
	public String toString() {
		if (head == null) {
			return "{}";
		} else {
			return "{" + toStringRec(head) + "}";
		}
	}
	
	private String toStringRec(SongNode cur) {
		if (cur == null) {
			return "";
		} else if (cur.next == null) {
			return cur.getData().toString();
		} else {
			return cur.getData().toString() + ", " + toStringRec(cur.next);
		}
	}

	/*
	 * Purpose: Insert all elements from array into this linked list
	 * Parameters: Song[] array - the elements to add to this list
	 * Returns void - nothing
	 */
	public void buildFromArray(Song[] array) {
		buildFromArrayRec(array, array.length-1);
	}
	
	private void buildFromArrayRec(Song[] array, int i) {
		if (i < 0) {
			return;
		} else {
			addFront(array[i]);
			buildFromArrayRec(array, i-1);
		}
	}
	

	/*
	 * Purpose: gets the total number of songs in this list
	 * Parameters: none
	 * Returns: int - the number of songs in this list
	 */
	public int countSongs() {
		return countSongs(head);
	}

	
	private int countSongs(SongNode n) {
		if (n == null) {
			return 0;
		}
		else {
			int first = 1;
			int rest = countSongs(n.next);

			return first + rest;
		}
	}
	
		
	/*
	 * Purpose: gets the total duration of all songs in this list
	 * Parameters: none
	 * Returns: int - the total duration of all songs in this list
	 */
	public int totalDuration() {
		return totalDuration(head);
	}


	private int totalDuration(SongNode n) {
		if (n == null) {
			return 0;
		}
		else {
			int first = n.getData().getDuration();
			int rest = totalDuration(n.next);

			return first + rest;
		}
	}
	
	
	/*
	 * Purpose: counts the songs in this list by an artist with artistName
	 * Parameters: String artistName - the name of the artist to search for
	 * Returns: int - number of songs by artistName
	 */
	public int countSongsByArtist(String artistName) {
		return countSongsByArtist(head, artistName);
	}


	private int countSongsByArtist(SongNode n, String artistName) {
		if (n == null || artistName == null) {
			return 0;
		}
		else {
			int rest = countSongsByArtist(n.next, artistName);
			if (n.getData().getArtist().equals(artistName)) {
				return 1 + rest;
			}
			else {
				return 0 + rest;
			}
		}
	}
	
	
	/*
	 * Purpose: determines whether this list contains a song by artistName
	 * Parameters: String artistName - the name of the artist to search for
	 * Returns: boolean - true if a song by artistName is found
	 */
	public boolean containsArtist(String artistName) {
		return containsArtist(head, artistName);
	}
	

	private boolean containsArtist(SongNode n, String artistName) {
		if (n == null || artistName == null) {
			return false;
		}
		else {
			if (containsArtist(n.next, artistName) == true || n.getData().getArtist().equals(artistName)) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	/*
	 * Purpose: gets the longest song in the list
	 * Parameters: none
	 * Returns Song - the longest song in the list
	 *                or null if the list is empty
	 */
	public Song longestSong() {
		return longestSong(head, null);
	}
	

	private Song longestSong(SongNode n, Song biggest) {
		if (n == null) {
			return biggest;
		}
		else {
			if (biggest == null || n.getData().getDuration() > biggest.getDuration()) {
				return longestSong(n.next, n.getData());
			}
			else {
				return longestSong(n.next, biggest);
			}
		}
	}
		
	/*
	 * Purpose: get the total duration of all songs in the list
	 *          before the first song by artistName
	 * Parameters: String artistName - the artist name to search for
	 * Returns int - the duration of all songs before the first
	 *               song by artistName, or -1 if no song by 
	 *               artistName is found.
	 */
	public int totalTimeUntilArtist(String artistName) {
		return totalTimeUntilArtist(head, artistName, false);
	}


	private int totalTimeUntilArtist(SongNode n, String artistName, boolean found) {
		if (n == null) {
			return -1;
		}
		if (n.getData().getArtist().equals(artistName)) {
			found = true;
		}
		if (found == true) {
			return 0;
		}
		else {
			int val = totalTimeUntilArtist(n.next, artistName, found);
			if (val == -1) {
				return -1;
			}
			return n.getData().getDuration() + val;
		}

	}
}