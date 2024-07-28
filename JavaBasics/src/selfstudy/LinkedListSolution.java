package selfstudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1= new LinkedList<>();
		l1.add(31); //0 - index
		l1.add(10); //1 - index
		l1.add(15); //2 - index
		l1.add(38);
		l1.add(2,27);
		l1.remove();
		l1.removeFirst();
		l1.remove(1);
		l1.removeLast();
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println(l1.size());
		boolean b1=l1.contains(27);
		System.out.println(b1);
		boolean b2=l1.contains(23);
		System.out.println(b2);
		//Copy elements from one data structure to another
		//stack to linkedlist
		Stack<String> s1=new Stack<>();
		LinkedList<String> l2=new LinkedList<>();
		s1.push("Hello");
		s1.push("100");
		s1.push("everyone");
		l2.addAll(s1);
		Iterator i2=l2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}

}
