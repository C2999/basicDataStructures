/**
 * This method implements a queue in an object array
 * @author Callum Neeson
 * @version 1.0
 */

public class queue
{
	Object[] elements; 
	int currentSize; //current amount of objects in queue
	int head; //head pointer
	int tail; //tail pointer

	/**
	 * This constructs the queue with the estimated input 
	 * @param sizeInput estimated size
	 */
	public queue( int sizeInput ) {
		elements = new Object[sizeInput]; 
		currentSize = 0;
		head = 0; 
		tail = 0;
	}
	/**
	 * This method finds if the array is empty
	 * @return
	 */
	public boolean isEmpty() { 
		if( currentSize == 0 ) {
			return true;
		}
		else {
			return false;
		}
	}

	
	/**
	 * This method adds an object to the array
	 * @param newElement the object that defines the element being added
	 */
	public void add(Object newElement) {
		grow(); //checks if array can add another item, and doubles its size if it cant
		currentSize++; //increments counter for number of items 
		elements[tail] = newElement; //makes the new item the tail
		tail = (tail + 1) % elements.length; //put tail on other side of the queue so every item doesn't have to be moved one over in array (Expensive operation)
	}


	 /**
	  * This Method removes the head of the queue 
	  * @return the head
	  */
	public Object remove() {
		if( isEmpty() == true ) 
		{
			System.out.println("Queue empty"); //if not empty
			return null;
		}
		Object removed = elements[head]; //keeps head in temp variable 
		head = (head + 1) % elements.length; //increments head in the circular array and wraps around if running out of room
		currentSize--; //decrements amount of items in array
		return removed;
	}

	/**
	 * This Method doubles the size of the Array if an object is added but the array is at maximum length
	 */
	public void grow() {
		if (currentSize == elements.length)
		{
			Object[] newElements = new Object[2 * elements.length];
			for (int i = 0; i < elements.length; i++)
			{
				newElements[i] = elements[(head + i) % elements.length]; //adds the elements into the new array accounting for the circular nature of the array
			}
			elements = newElements;
			head = 0;
			tail = currentSize; 
			
		}
	}

}
