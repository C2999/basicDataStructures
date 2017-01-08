package dataStructures;

/**
 * This Class holds a Binary Tree that sorts Nodes
 * @author Callum Neeson
 * @version 1.0
 */

public class BinaryTree {
	
	intNode root;
	/**
	 * This constructs the tree and initializes it as having no nodes
	 */
	public BinaryTree()
	{
		root = null; //initializes root as null because no values have been added
	}
	/**
	 * This method takes in integer to make into a node that will go into the tree
	 * @param data The number of the node that is created
	 */
	
	public void add(int data ) //takes in integer to make into a node that will go into the tree
	{
		intNode newNode = new intNode( data );
		
		if( root == null ) //if root == null, then search tree is empty
		{
			root = newNode; //make first node the root
		}
		else
		{
			addNode(newNode, root); //calls addNode method of the node class to traverse down the tree and find the nodes position to add
		}
			
	}
	
	/**
	 * This Method Searches for a node in the tree, and adds it if it is not there
	 * @param data of node that is being searched
	 * @return string letting the user know if the node was found or if it was added
	 */
	public String find( int data ) 
	{
		intNode currentNode = root; //starts at root
		while( currentNode != null ) //runs down the tree until it is at the bottom
		{
			if( currentNode.data == data ) { return "Node in Tree"; } //current node exists, has same data as one trying to be found
			else if( data < currentNode.data ) { currentNode = currentNode.prevNode; } //if less than current node, runs while loop again with current node's left child as the parent 
			else if( data > currentNode.data ) { currentNode = currentNode.nextNode; } //if more than current node, runs while loop again with current node's right child
		}
		add( data ); //adds data if not tree
		return "Node has been added"; //if goes through while loop without returning, node was not found
		
	}
	/**
	 * This method adds nodes that are not the root and sorts it accordingly in the tree
	 * @param newNode node being added
	 * @param tempRoot temporary root that's used recursively
	 */
	public void addNode( intNode newNode, intNode tempRoot ) //used for adding nodes that aren't the root
	{
		int data = tempRoot.data;
		intNode prevNode = tempRoot.prevNode;
		intNode nextNode = tempRoot.nextNode;
		
		if( data > newNode.data ) //add new node to left if smaller than current node
		{
			if( prevNode == null ) { tempRoot.prevNode = newNode; } //if node has no left child, make it the left child
			else
			{ 
				addNode( newNode, prevNode ); 
			} //if node does have left child, run loop again comparing to the child
		}
		else if( data < newNode.data  ) //add new node to right if larger than current Node
		{
			if( nextNode == null ) { tempRoot.nextNode = newNode; }
			else 
			{ 
				addNode( newNode, nextNode );
			}
			
		}
	}

}
