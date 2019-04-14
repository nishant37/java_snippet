// ENQUE AND DEQUE IMPLEMENTATION IN JAVA

public class queue_props {
	
	 int[] queue = new int[5];
	 int size;
	 int front;
	 int rear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		queue_props que = new queue_props();
		
		que.enQueue(5);
		que.enQueue(2);
		que.enQueue(3);
		
		que.deQueue();
		que.deQueue();
		
		
		que.enQueue(30);
		que.enQueue(20);
		
		System.out.println("Size of queue is "+que.getSize());
	    
		que.show();
		
	}
	
	public void enQueue(int data) {
		if(!isFull()) {
		queue[rear] = data;
		rear = (rear+1)%5;
		size = size+1;
		}
		else
			System.out.println("Queue is Full");
	}
	
	public  int deQueue() {
		int data = queue[front];
		if(!isEmpty()) {
		front = (front+1)%5;
		size = size-1;
		}
		return data;
	}
	
	public  int getSize() {
		return size;
	}
	
	public  boolean isEmpty() {
		return size==0;
	}
	
	public  boolean isFull() {
		return size==5;
	}
	
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5] + " ");
		}
		System.out.println();
	}

}
