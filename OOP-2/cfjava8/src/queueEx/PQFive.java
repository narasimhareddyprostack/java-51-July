package queueEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQFive {
	public static void main(String[] args) {
		Queue pq1=new PriorityQueue();
		Queue pq2=new PriorityQueue();
		pq1.add('A');
		pq1.add('B');
		pq1.add('C');

		System.out.println(pq1);
		System.out.println(pq2);
		
		System.out.println(pq2.peek());
		System.out.println(pq2.element());
		System.out.println(pq2);
		
	}
}
