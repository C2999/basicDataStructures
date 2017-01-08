/**
 * This holds an Integer Node
 * @author Callum Neeson
 * @version 1.0
 *
 */

public class intNode {
	
	int data; //Name of animal
	intNode nextNode; //Node before the current Node
	intNode prevNode; //Node after the current Node
	/**
	 * constructs a node with a give integer
	 * @param dataInput integer that defines the node
	 */
	public intNode( int dataInput ) //constructor 
	{
		this.data = dataInput; //when data is passed in the constructor, it is set equal to "data" the instance variable 
	}

}
