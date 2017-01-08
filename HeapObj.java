package dataStructures;

/**
 * This Object stores a value of Object type, and a priority of that value
 * @author Callum Neeson
 * @version 1.0
 */
public class HeapObj 
{
	int priority;
	Object value;
	/**
	 * This method is the constructor
	 * @param priorityInput priority of item
	 * @param valueInput name of item
	 */
	
	HeapObj( int priorityInput, Object valueInput )
	{
		this.priority = priorityInput;
		this .value = valueInput;
	}
	
	
}
