public class dataStructContr {
	
	public static void main(String[] args) 
	{
		queue testqueue = new queue(6);
		System.out.println(testqueue.isEmpty());
		for(int i = 0; i < 20; i++ ) {
			testqueue.add(new intNode(i));
		}
		while(!testqueue.isEmpty()) {
			intNode in = (intNode)testqueue.remove();
			System.out.println(in.data);
		}

	}

}