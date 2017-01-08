##Stack
Features were put in to prevent an index out of bound exception if a peek or
pop is tried when the stack is empty. Various Items were pushed and popped, and when popped, the previous item became the top of stack, and when that was removed, a pop resulted in the program reading "empty"
In addition, if more elements were added than initially estimated, the array doubles in size to 
accommodate

##Binary Tree
Various items were added, and because it is implemented as a linked list it
has a dynamic sizing. If the user tries to find an element not in the Tree, it is 
added.

##LinkedList
Size is dynamic so there are no issues with the list changing size frequently.
If the user searches for an item not in the list or searches an empty list, null is returned
and the console prints the list is empty or that the data is not in it. These same conditions 
apply for the print function if the list is empty.The Linked list also effectively finds 
nodes in the list, deletes objects in the list, and accounts for deletions of the
head and tail

##Queue
The Queue successfully swaps the head and tail around to make a circular array, and 
running through  a for loop with addition and removal of elements, the queue was able to move 
the least recently added item. The list will also expand if it has exceeded the estimated
size.

##Priority Heap
The heap also performed as intended while being run through for loops that 
deleted and added elements. The heap also has an isEmpty method that is used to prevent printing,
and popping of an array that is empty. A print feature was also put in to print the array 
as is.
