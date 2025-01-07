// /*
// * HeapPriorityQueue.java
// *
// * An implementation of a minimum PriorityQueue using a heap.
// * based on the implementation in "Data Structures and Algorithms
// * in Java", by Goodrich and Tamassia
// *
// * This implementation will throw a Runtime, HeapEmptyException
// *   if the heap is empty and removeLow is called.
// *
// * This implementation will throw a Runtime, HeapFullException
// *   if the heap is full and insert is called.
// *
// */
// @SuppressWarnings({"rawtypes", "unchecked"})
// public class HeapPriorityQueue implements PriorityQueue {

//     protected final static int DEFAULT_SIZE = 10000;
    
//     protected Comparable[] storage;
//     protected int currentSize;

//     /*
//      * Constructor that initializes the array to hold DEFAULT_SIZE elements
//      */
//     public HeapPriorityQueue() {
//         storage = new Comparable[DEFAULT_SIZE+1];
//         currentSize = 0;
//     }
    
//     /*
//      * Constructor that initializes the array to hold size elements
//      */
//     public HeapPriorityQueue(int size) {
//         storage = new Comparable[size+1];
//         currentSize = 0;
//     }

//     public void insert (Comparable element) throws HeapFullException {
//         if (isFull()) {
//             throw new HeapFullException();
//         }
//         storage[currentSize+1] = element;
//         currentSize++;
//         if (currentSize>1) {
//             bubbleUp(currentSize);
//         }
//     }
    
//     public void bubbleUp(int index) {
//         int parent = (index/2);
//         if (index < 4) {
//             if (storage[index].compareTo(storage[1]) < 0) {
//             swap(index, 1);
//             }   
//         }else if (storage[index].compareTo(storage[parent]) < 0) {
//             swap(index, parent);
//             bubbleUp(parent);
//         }
//     }
            
//     public Comparable removeMin() throws HeapEmptyException {
//         if (isEmpty()) {
//             throw new HeapEmptyException();
//         }
//         Comparable to_return = storage[1];
//         swap(1, currentSize);
//         storage[currentSize] = null;
//         currentSize--;
//         bubbleDown(1);
//         return to_return; 
//     }
    
//     private void bubbleDown(int index) {
// 		int left = (2*index);
// 		int right = ((2*index) + 1);
//         if (index < (storage.length - 1) &&  right < (storage.length - 1)) {
//             if (storage[left] == null) {
//                 if (storage[right] == null) {
//                     return;
//                 }
// 				else if (storage[right].compareTo(storage[index]) < 0) {
//                     swap(index, (right));
//                     bubbleDown(right);
//                 }
//             }
// 			else if (storage[right] != null) {
//                 if (storage[right].compareTo(storage[left]) < 0) {
//                     if (storage[right].compareTo(storage[index]) < 0) {
//                         swap(index,(right));
//                         bubbleDown(right);
//                     }
// 					else{
//                         return;
//                     }
//                 }
// 				else{
//                     if (storage[left].compareTo(storage[index]) < 0) {
//                         swap(index,(left));
//                         bubbleDown(left);
//                     }
// 					else{
//                         return;
//                     }
//                 }
//             }
// 			else{
//                 if (storage[left].compareTo(storage[index]) < 0) {
//                     swap(index,(left));
//                     bubbleDown(left);
//                 }
// 				else{
//                     return;
//                 }
//             }
// 		}
// 		else if (index < (storage.length - 1) && left < (storage.length - 1)) {
// 			if (storage[left] != null) {
// 				if (storage[left].compareTo(storage[index]) < 0) {
// 					swap(index,(left));
// 					bubbleDown(left);
// 				}
// 				else{
// 					return;
// 				}
// 			}
// 			else{
// 				return;
// 			}
// 		}
// 	}

//     private void swap(int a, int b) {
//         Comparable cur = storage[a];
//         storage[a] = storage[b];
//         storage[b] = cur;
//     }
    

//     public boolean isEmpty() {
//         if (currentSize == 0) {
//             return true; // so it compiles
//         }
//         return false;
//     }
    
//     public boolean isFull() {
//         if ((currentSize+1) == storage.length) {
//             return true;
//         }
//         return false; 
//     }
    
//     public int size () {
//         return currentSize; 
//     }

//     public String toString() {
//         String s = "";
//         String sep = "";
//         // This implementation of toString assumes you 
//         // are using a 1-based approach. Update the initial
//         // and final value for i if using a 0-based
//         for(int i=1; i<=currentSize; i++) {
//             s += sep + storage[i];
//             sep = " ";
//         }
//         return s;
//     }
// }