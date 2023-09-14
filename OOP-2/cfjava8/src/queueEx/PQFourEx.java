package queueEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQFourEx {
	public static void main(String[] args) {
		Queue pq1=new PriorityQueue();
		Queue pq2=new PriorityQueue();
		pq1.add('A');
		pq1.add('B');
		pq1.add('C');
		pq1.add('D');
		pq1.add('E');
		pq1.add('F');
		pq1.add('G');
		System.out.println(pq1);
		System.out.println(pq1.peek());
		System.out.println(pq1.remove());
		System.out.println(pq1);
		System.out.println(pq2);
		System.out.println(pq2.poll());
		
		System.out.println(pq2);
		
	}
}
