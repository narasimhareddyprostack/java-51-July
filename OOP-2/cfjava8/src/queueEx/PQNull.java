package queueEx;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQNull {
	public static void main(String[] args) {
	Queue	ll=new LinkedList<String>();
  	Queue	pq=new PriorityQueue<String>();
  	ll.add(null);
  	//pq.add(null);
  	System.out.println(ll);
  	System.out.println(pq);
	}
}	
