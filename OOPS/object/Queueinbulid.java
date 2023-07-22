package object;
import java.util.*;

public class Queueinbulid {
	public static void main(String args[]) {
		//add offer remove poll peek element
		
		System.out.print("Priority Queue:");
		Queue<Integer> qe=new PriorityQueue<Integer>();//multithreading
		qe.offer(0);//return success after insert
		qe.add(1);
		qe.add(2);
		qe.add(3);
		System.out.println(qe);
		System.out.println("Size:"+qe.size());
		System.out.println("Element:"+qe.element());  
		System.out.println("Peek:"+qe.peek()); 	//finds head returns null
		
		System.out.print("Remove:");
		System.out.print(qe.remove());	//removes head
		System.out.print(qe.remove());
		System.out.print(qe.poll());	//removes head if empty ->null
		System.out.println(qe.poll());
		System.out.print("\n");
		
		System.out.print("Linked List:");
		Queue<Integer> qt=new LinkedList<Integer>();
		qt.add(4);
		qt.add(5);
		qt.add(6);
		
		System.out.print(qt.remove());
		System.out.print(qt.remove());
		System.out.println(qt.remove());
		
		System.out.print("ArrayDeque:");
		Queue<Integer> q=new ArrayDeque<Integer>();
		q.add(7);
		q.add(8);
		q.add(9);
		System.out.print(q.remove());
		System.out.print(q.remove());
		System.out.print(q.remove());
	}
}
