// Java program to demonstrate the
// creation of queue object using the
// PriorityQueue class

import java.util.*;

class GfG {

	public static void main(String args[])
	{
		// Creating empty priority queue
		Queue<Integer> pQueue
			= new PriorityQueue<Integer>();

		// Adding items to the pQueue
		// using add()
		System.out.println(pQueue.add(8));
		System.out.println(pQueue.add(9));
		System.out.println(pQueue.poll());
        System.out.println(pQueue.add(10));
        System.out.println(pQueue.add(11));
        System.out.println(pQueue.add(pQueue.poll()));
        System.out.println(pQueue.add(12));
        System.out.println(pQueue.poll());
        System.out.println(pQueue.add(13));
        System.out.println(pQueue.poll());

    }
}


