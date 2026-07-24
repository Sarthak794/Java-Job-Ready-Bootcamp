package day_7;
import java.util.*;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		System.out.println("Orignal List: "+list);
		
		list.addLast("C");
		list.addFirst("HTML");
		System.out.println("After addFirst/addLast:"+list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println("After removeFirst/removeLast:"+list);
		
		System.out.println("Peek(): "+list.peek());
		
		list.push("Javascript"); 
		System.out.println("After push: "+list);
		
		System.out.println("After pop: "+list.pop());
		
		list.offer("SpringBoot");
		
		System.out.println("After Offer: " + list);

        System.out.println("Poll: " + list.poll());

        System.out.println("After Poll: " + list);
	}

}
