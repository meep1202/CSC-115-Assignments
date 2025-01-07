import java.util.*;

public class HashMap<K extends Comparable<K>, V> implements Map<K,V> {

	private List<List<Entry<K,V>>> 	table;
	private int	count;
	private int  tableSize;

	// For Part III
	private long getLoops;
	private long putLoops;
	

	public HashMap() {
		tableSize = 1000003; // prime number
		table = new ArrayList<List<Entry<K,V>>>(tableSize);

		// initializes table as a list of empty lists
		for (int i = 0; i < tableSize; i++) {
			table.add(new LinkedList<Entry<K,V>>());
		}

		count = 0;

		// For Part III:
		resetGetLoops();
		resetPutLoops();
	}

	// For Part III
	public long getGetLoopCount() {
		return getLoops;
	}

	// For Part III
	public long getPutLoopCount() {
		return putLoops;
	}

	// For Part III
	public void resetGetLoops() {
		getLoops = 0;
	}
	
	// For Part III
	public void resetPutLoops() {
		putLoops = 0;
	}

	public boolean containsKey(K key) {
		int index = Math.abs(key.hashCode()) % tableSize;

		List<Entry<K,V>> listo = table.get(index);
		if (listo == null) {
			return false;
		}
		else {
			Iterator<Entry<K,V>> iter = listo.iterator();
			while (iter.hasNext()) {
				Entry<K,V> temp = iter.next();
					if (temp.getKey().equals(key)) {
						return true;
					}
			}
		}
		return false;
	}

	public V get (K key) throws KeyNotFoundException {
		int index = Math.abs(key.hashCode()) % tableSize;

		List<Entry<K,V>> listo = table.get(index);

		if (listo == null) {
			throw new KeyNotFoundException();
		}
		else {
			Iterator<Entry<K,V>> iter = listo.iterator();
			while (iter.hasNext()) {
				Entry<K,V> temp = iter.next();
				if (temp.getKey().equals(key)) {
					return temp.getValue();
				}
			}
		}
		throw new KeyNotFoundException();
	}


	public List<Entry<K,V> >	entryList() {
		List <Entry<K,V>> resultList = new LinkedList<Entry<K,V>>();
		
		for (int i = 0; i < table.size(); i++) {
			List<Entry<K,V>> listo = table.get(i);
			Iterator<Entry<K,V>> iter = listo.iterator();
			while (iter.hasNext()) {
				Entry<K,V> temp = iter.next();
				resultList.add(temp);
			}
		}
		return resultList;
	}
	
	public void put (K key, V value){
		int index = Math.abs(key.hashCode())%tableSize;

		List<Entry<K,V>> listo = table.get(index);

		if (listo == null) {
			try {
				listo.add(new Entry<K,V>(key, value));
				count++;
			}
			catch (Exception nullPointerException) {
				System.out.println(":(");
			}
		}
		else if (containsKey(key)) {
			Iterator<Entry<K,V>> iter = listo.iterator();
			while (iter.hasNext()) {
				Entry<K,V> temp = iter.next();
				if (temp.getKey().equals(key)) {
					temp.setValue(value);
				}
			}
		}
		else {
			listo.add(new Entry<K,V>(key, value));
			count++;
		}
	}

	public int size() {
		return count;
	}

    public void clear() {
		for(int i = 0; i < tableSize; i++) {
			table.get(i).clear();
		}
        count = 0;
    }

}