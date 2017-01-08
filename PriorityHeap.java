package dataStructures;

/**
 * This Class Implements a Priority Queue as a Heap
 * @author Callum Neeson
 *@version 1.0
 */

public class PriorityHeap 
{
	public HeapObj[] heap; //Heap object class which takes in an Object value, and a priority
	public int itemsInArr = - 1; //keeps track of the items currently in the array
	public int maxSize; //keeps track of the size of the Array
	
	/**
	 * This method constructs the Priority Heap as an Array
	 * @param intened size of the queue 
	 */
	
	public PriorityHeap( int sizeInput )
	{
		this.maxSize = sizeInput;
		heap = new HeapObj[sizeInput]; 
		
	}
	/**
	 * This method inserts a HeapObject with a Value and a Priority at the end of the Array
	 * @param priority
	 * @param valueInput
	 */
	
	public void insert( int priority, Object valueInput )
	{
		grow(); //checks if array is big enough, and expands it if it is not
		itemsInArr++;
		heap[itemsInArr] = new HeapObj( priority, valueInput );
			
		
	}
	/**
	 * This method removes the item with the highest Priority 
	 * @return HeapObject that was removed
	 */
	
	public HeapObj pop() 
	{
		if(!isEmpty()) //checks if array is empty
		{
			heapPart(itemsInArr); //heaps the input size of the array
			HeapObj root = heap[0]; //stores the root i.e. the highest priority
			itemsInArr--; //decrements the size tracker of the array
			heap[0] = heap[itemsInArr]; //makes second to last item the new root 
			heapify(0); //heaps the array once more;
			return root;
		}
		return null; //returns if empty
	}
	/**
	 * This method checks if the array is empty
	 * @return Boolean expression indicating if empty
	 */
	public boolean isEmpty() 
	{
		if( itemsInArr == -1 ){return true;} 
		else{return false;}
	}
	/**
	 * This method swaps the parent with its child if the child is larger, then does the same for child until it
	 * reaches a case where the children are smaller than the parents
	 * @param index initial parent
	 */
	
	public void heapify( int index ) 
	{
		int largestChild; //will hold the largest of the two children and will become the next index if larger than the parent
		HeapObj root = heap[index]; //initial root
		boolean running = true; //exists when parent > child
		while( (index <= itemsInArr/2 - 1) && (index > -1) && running ) //if index is within bounds to have a child
		{
			int leftChild =  (2 * index) + 1;
			int rightChild =  (2 * index) + 2;
			if( (rightChild <= itemsInArr) && heap[rightChild].priority > heap[leftChild].priority) //if rightChild is in the array and larger than left
			{
				largestChild = rightChild; 
			}
			else
			{
				largestChild = leftChild;
			}
			if( root.priority >= heap[largestChild].priority ) //if the parent is larger than its child, end while loop
			{
				running = false; 
			}
			else
			{
				heap[index] = heap[largestChild]; //if parent is smaller, swap values and run same loop for child as parent
				index = largestChild;
			}
		}
		heap[index] = root; //if parents larger than child, nothing changes. if vice versa, makes the last index the intitial root value
		
	}
	/**
	 * This method is used as a testing feature that returns the iterates though the array and gives
	 * each objects value and priority
	 * @return String of each objects value and priority
	 */
	
	public String print() 
	{
		String heapOutput = "";
		for( int i = 0; i < itemsInArr + 1; i++ )
		{
			heapOutput += "Priortiy: " + heap[i].priority + " Value: " + heap[i].value + "\n"  ;
		}
		
		return heapOutput;
	}
	/**
	 * This method iterates through the array and heaps each element that has a child
	 * @param size portion of array to be heaped
	 */
	public void heapPart( int size )
	{
		for( int i = (size/2) - 1; i >= 0; i-- ) 
		{
			heapify(i);
		}
	}
	/**
	 * This method returns the item with the highest priority in the array
	 * @return HeapObject with highest priority
	 */
	public HeapObj peek()
	{
		if(!isEmpty()) //checks if empty
		{
			heapPart(itemsInArr); //heaps through array so max is the first item
			return heap[0];
		}
		else return null;
		
	}
	/**
	 * This method checks if the array is large enough to add another element, and
	 * if not, it copies the array into a new array that's twice the size
	 */
	public void grow()
	{
		if(itemsInArr + 1 >= maxSize)
		{
			HeapObj[] newArr = new HeapObj[ maxSize * 2 ];
			for( int i = 0; i < heap.length; i++ )
			{
				newArr[i] = heap[i];
			}
			heap = newArr;
			maxSize = newArr.length;
		}
	}
	
	
}