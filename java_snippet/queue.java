import java.util.*;
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> qu = new LinkedList<>();
		
		// Add elements to the queue
		
		for(int i=0;i<5;i++) {
			qu.add(i);
		}
		
		System.out.println("Elements for queue are - "+qu);
		
		// To remove the head of the queue
		int removelement = qu.remove();
		System.out.println("Removed Head element of queue is - "+removelement);
		
		// View the head element of the queue
		System.out.println(qu.peek());
		
		
		System.out.println("Elements for queue are - "+qu);
		
	}

}
