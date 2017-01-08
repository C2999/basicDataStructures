package dataStructures;


public class StringNode {
	
	String data; //Name of animal
	StringNode nextNode; //Node before the current Node
	StringNode prevNode; //Node after the current Node
	
	public StringNode( String dataInput ) //constructor 
	{
		this.data = dataInput; //when data is passed in the constructor, it is set equal to "data" the instance variable 
	}


}
