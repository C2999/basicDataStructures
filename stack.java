package dataStructures;

/**
 * This Class implements a stack in an array
 * @author Callum Neeson
 * @version 1.0
 */
public class Stack
{
	Object[] stackArray; 
	int stackSize; //size of stackArray
	int topOfStack; //topOfStack is the pointer to the mode recently pushed value, and has a default of -1
	
	/**
	 * This method creates a stack with the estimated size needed
	 * @param size estimated amount of objects
	 */
	public Stack( int size)
	{
		topOfStack = -1; 
		stackSize = size;
		
		stackArray = new String[size];
		
		for( int i = 0; i < stackArray.length; i++ )
		{
			stackArray[i] = "!!"; //initializes every value in the StackArray with a default of -1
		}
		
		
	}
	
	/**
	 * This method pushes a new element on the top of the stack
	 * @param input
	 */
	public void push( Object input )
	{
		grow(); //checks if array is big enough, and double it if not
		topOfStack++; //increments pointer
		stackArray[topOfStack] = input; //puts input at top of the stack
		
	}
	/**
	 * This method prints the stack in order and ignores the empty case
	 * @return The items in the stack that are not default
	 */
	public String print()
	{
		String result = "";
		for( int i = 0; i < stackArray.length; i++ )
		{
			if( stackArray[i] != "!!" ) //if not default item
			{
				result += " P" + i + " is " + stackArray[i];
			}
			
		}
		return result;
	}
	
	/**
	 * This method removes the most recently added item in the stack
	 */
	public void pop()
	{
		if( (stackArray[topOfStack] != "!!") && (stackArray[topOfStack] != "!!") ) //if the top of the stack is not a default value
		{
			stackArray[topOfStack] = "!!"; //makes it a default value
			topOfStack--; //makes the top the previous element 
		}
		else
		{
			System.out.println("Stack Empty");
		}
	}
	
	/**
	 * This method shows the most recently added object to the stack
	 * @return object at the top of the stack, and return empty if not there
	 */
	public Object peek()
	{
		if( (topOfStack > -1) && (stackArray[topOfStack] != "!!")  )
		{
			return stackArray[topOfStack];
		}
		else
		{
			return "empty";
		}
		
	}
	
	/**
	 * This Method checks if the stack is large enough to have add another item, and if not
	 * copies the stack into an array twice as large
	 */
	public void grow()
	{
		if (topOfStack + 1 >= stackSize)
		{
			System.out.println("this");
			Object[] newArr = new Object[2 * stackSize];
			for (int i = 0; i < stackSize; i++)
			{
				newArr[i] = stackArray[i];
			}
			for( int j = stackSize; j < newArr.length; j++ )
			{
				newArr[j] = "!!";
			}
			stackArray = newArr;
			//topOfStack = stackSize; 
			stackSize = newArr.length;
			
		}
	}
	
	
	
}
