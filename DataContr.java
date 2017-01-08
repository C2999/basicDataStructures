package dataStructures;

public class DataContr {

	public static void main(String[] args) 
	{
		
		LinkedList l = new LinkedList();
		for( int i = 0; i < 1000; i ++ )
		{
			l.add( "" + i );
		}
		System.out.println(l.print());
		
		/*BinaryTree tree = new BinaryTree();
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		System.out.println(tree.find(7));
		System.out.println(tree.find(7));
		/*stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		stack.push("Ted");
		stack.push("ron");
		stack.push("philip");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());*/
		
		Queue queue = new Queue(11);
		queue.add("sam");
		System.out.println(queue.remove());
		queue.add("sam1");
		System.out.println(queue.remove());
		queue.add("sam2");
		System.out.println(queue.remove());
		queue.add("sam3");
		System.out.println(queue.remove());
		queue.add("sam4");
		queue.add("sam5");
		queue.add("sam4");
		queue.add("sam5");
		queue.add("sam4");
		queue.add("sam5");
		queue.add("sam4");
		queue.add("sam5");
		queue.add("sam4");
		queue.add("sam5");
		queue.add("sam4");
		queue.add("sam5");
		queue.add("sam4");
		queue.add("sam5");		queue.add("sam4");
		queue.add("sam5");
		System.out.println(queue.remove());
		queue.add("sam6");
		queue.add("sam7");
		System.out.println(queue.remove());
		queue.add("sam8");
		queue.add("sam9");
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		/*Stack stack = new Stack(3);
		stack.push("yea");
		//stack.pop();
		stack.push("yea");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6i");
		stack.push("7");
		stack.push("8");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());*/
		
		/*Queue q = new Queue(3);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();*/
		PriorityHeap h = new PriorityHeap(102);
		h.print();
		/*for( int i = 1; i < 400; i++ )
		{
			h.insert( i, "test"  );
		}*/
		//h.heapEntire();
		
		//h.heapSort();
	/*	h.insert(44, "davis");
		h.insert(43, "davis");
		h.insert(42, "davis");
		h.insert(41, "davis");
		h.insert(39, "davis");
		h.insert(38, "davis");
		h.insert(37, "davis");
		h.insert(36, "davis");
		h.heapSort();*/
		//h.pop();
		//h.pop();
		//h.pop();
		
		//System.out.println(h.print());
		//System.out.println(h.peek().priority);
		//h.print();
		//System.out.println(h.isFull());
		
		
		
		
	}

}
