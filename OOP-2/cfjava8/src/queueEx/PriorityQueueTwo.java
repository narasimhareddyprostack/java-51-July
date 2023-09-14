package queueEx;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTwo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(5);
		
		System.out.println(pq1.offer(101));
		pq1.add(102);
		pq1.add(103);
		pq1.add(104);
		pq1.add(105);
		pq1.add(106);
		pq1.add(107);
		
		System.out.println(pq1);
		
		for(Object ele:pq1) {
			System.out.println(ele);
		}
		
		Iterator itr=pq1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	

}
