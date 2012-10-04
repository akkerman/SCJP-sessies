package scjp.h7;
import java.util.*;

class Priorities {
	public static void main(String[] args) {
		PriorityQueue toDo = new PriorityQueue();
		toDo.add("dishes");
		toDo.add("laundry");
		toDo.add("bills");
		toDo.offer("bills");
		System.out.print(toDo.size() + " " + toDo.poll());
		System.out.print(" " + toDo.peek() + " " + toDo.poll());
		System.out.println(" " + toDo.poll() + " " + toDo.poll());
	}
}