package dataStructures;
/**
 * This Class implements a linked list with String Nodes
 * @author Callum Neeson
 * @version 1.0
 */

public class LinkedList 
{
	StringNode head; //makes a head to linkedList with no value
	StringNode tail; //makes tail in linkedList with no value
	int size = 0; //initializes counter to keep track of size of the List
	
	/**
	 * This method adds a new node to the list alphabetically
	 * @param data the word the suer inputs that defines the new node
	 */

	public void add( String data ) 
	{
		size ++; //increments for each node added to the linkedList
		StringNode newNode = new StringNode( data ); //creates node with .data = to the data input and a null value for prevNode and nextNode
		/*Node exists = find(data);
		if( exists != null )
		{
			return;
		}*/
		if(data.isEmpty() || data.matches("\\s*"))
		{
			return; //case 1: user enters empty space
		}
		else if( size == 1 ) //case 2: if linked list is empty, the node is set as the head and tail
		{
			tail = newNode;
			head = newNode;
			return;
		}
		else if( size == 2 ) //second item added to list
		{
			int compareNodes = data.compareToIgnoreCase( head.data ); //returns negative if data is before head, and positive if it is after
			if( compareNodes <= 0 ) //case 3: the newNode comes before the 1st Node when there are two items in the list
			{
				StringNode newTail = head; 
				tail = newTail; //sets the tail of the list equal to the previous head
				head = newNode; //makes the newNode the head
				tail.prevNode = head;
				head.nextNode = tail;
			}
			else //case 4: the newNode comes after the first item in the list when there are two items in the list
			{
				tail = newNode; //sets the newNode as the tail
				tail.prevNode = head;
				head.nextNode = tail;
			}
		}
		else
		{
			StringNode node = head; //initiates node variable with first item in linkedList, will be the current node in the while loop
			while( (node != null) ) //while node has a value, loop runs
			{
				if( (data.compareToIgnoreCase( node.data ) < 0) && (node == head) ) //case 5: newNode comes before the head and there are multiple items in the list already
				{
					node.prevNode = newNode; 
					newNode.nextNode = node;
					head = newNode; 
					return;
				}
				else if( (data.compareToIgnoreCase( node.data ) >= 0) && (node == tail )) //case 6: newNode goes after the tail when there are multiple items in the list
				{
					tail.nextNode = newNode;
					newNode.prevNode = tail;
					tail = newNode;
					return; 
					
				}
				else if( data.compareToIgnoreCase( node.data ) < 0 ) // case 7: newNode comes before some node that is not the tail or head
				{
					StringNode prevNode = node.prevNode; //sets the current nodes previous node to a variable
					newNode.prevNode = prevNode; //inserts the newNode in by making it's previous nodes the currentNodes previous Node
					prevNode.nextNode = newNode; //assigns the previous Nodes nextNode as newNode
					newNode.nextNode = node; //sets newNode's nextNode equal to the current Node
					node.prevNode = newNode; //Makes the current Node's prevNode equal to newNode
					return;
				}
				else //case 8: newNode not equal to current Node. Makes current Node the next node in the list and runs the while loop again.
				{
					StringNode nextNode = node.nextNode; 
					node = nextNode;
				}
			}
		}
	
		
	}
	/**
	 * This method finds if a node is in the list
	 * @param the data of the node
	 * @return returns the node if found, and null if not
	 */
	public StringNode find( String data ) //data is the name of the node the user is searching for
	{
		//System.out.println(data.length());
		//System.out.println(head.data);
		//System.out.println(tail.data);
		
		if( head == null ) //case 1: list is Empty
		{
			System.out.println("list Empty");
			return null;
		}
		if( head.data.equals( data ) )//case 2: the head is the node the user is searching for
		{
			return head;
		}
		
		StringNode node = head; //node is the current node in the while loop which is initiated at the head
		while( (node.data != null) )
		{
			StringNode currentNode = node;
			if( node.data.equals(data) ) //case 3: node is found and not the head or tail 
			{
				System.out.println("it's a match");
				return node; //fix to show if value not in nodes
			}
			else if( currentNode.nextNode != null ) //case 4: current Node is not the node the user is searching for, but it does have another node in the list
			{
				node = currentNode.nextNode; //Does the while loop again with next node in List
				continue;
				
			} 
			else //case 5: Node user is searching for is not in the linkedlist
			{
				System.out.println("data not in linkedlist");
				return null;
				
			}
			

		}
		return null;


	}
	/**
	 * This method removes a node from the linked list and joins the bordering nodes
	 * @param data the String that defines the node
	 * @return the node that is deleted or null is it doesn't exist
	 */
	public StringNode delete( String data )
	{
		StringNode node = find(data); //finds node in list
		if( node == null ) //case 1: node user trying to delete is not in the list
		{
			System.out.println("data not in linked list");
			return null;
		}
		else if( (node == head) && (node == tail) )  //case 2: node user deleting is the only item in the list
		{
			size = 0;
			tail = null; //empty the list
			head = null;
		}
		else if( node == head ) //case 3: node user deleting is equal to the head of a list with multiple nodes
		{
			StringNode newHead = head.nextNode; //makes the head's next node the new head
			newHead.prevNode = null; //sets the new head's prev node to null
			head = newHead; //makes newHead global head of list
		}
		else if( node == tail ) //case 4: node user deleting is equal to the tail of a list with multiple nodes
		{
			StringNode newTail = tail.prevNode; //makes tail's previous node the new tail
			newTail.nextNode = null;
			tail = newTail;
		}
		else //case 5: node user deleting is in the middle of the list
		{
			StringNode prevNode = node.prevNode; //connects the node before and after the node being deleted through prevNode and nextNode
			StringNode nextNode = node.nextNode;
			prevNode.nextNode = nextNode; 
			nextNode.prevNode = prevNode;
		}
		return node;
	}
	/**
	 * This method prints the list starting at the head
	 * @return a string of the nodes data
	 */
	public String print()
	{
		if( head == null )
		{
			return "empty";
		}
		StringNode node = head; //initiates current node
		String listNames = "";
		while( node.data != null )
		{
			//System.out.println("running");
			StringNode currentNode = node;
			if( currentNode.nextNode != null ) //keeps running if there are more values in the list
			{
				listNames +=  node.data + ", "; //concatenates a string of the node's values
				node = currentNode.nextNode; //runs while loop with next value
			}
			else 
			{
				listNames +=  node.data;  //adds the tail to the string
				return listNames; 
			}


		}
		return "empty"; //returns empty if head doesn't exist
	}
	

}	