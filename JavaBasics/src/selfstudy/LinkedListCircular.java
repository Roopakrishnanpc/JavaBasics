package selfstudy;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListCircular {
	Node head, tail;
	class Node{
		int data;
		Node next;
		Node tail;
		Node(int data)
		{
			this.data=data;
		}
	}
	//singly linked list
	//here tail point to null
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
           Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
		void insertElements(int data)
		{
			Node newNode=new Node(data);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
				tail.next=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
				tail.next=head;
			}
		}
		void display()
		{
			Node n1=head;
			//if(tail==null) also same
			if(head==null)
			{
				System.out.println("Empty");
			}
			else
			{
				do
				{
					System.out.println(n1.data);
					n1=n1.next;
					System.out.print("done");
				}while(n1!=head);//tail != head also same
				//for singly linked list while(n1!=null);
			}
		}
	    public void remove(int value) {
	        if (head == null) {
	            System.out.println("List is empty. Nothing to remove.");
	            return;
	        }

	        if (head.data == value) {
	            head = head.next;
	            return;
	        }

	        Node prev = null;
	        Node current = head;
	  //      int count = 0;
	  //      while (current != null && count < index) {
//count < index)
	        while (current != null && current.data != value) {
	            prev = current;
	            current = current.next;
	            //count++;
	        }

	        if (current == null) {
	            System.out.println("Value " + value + " not found in the list.");
	            return;
	        }

	        prev.next = current.next;
	    }
	


		void deletesingle() {
		    if (head != null) {
		        // Check if there's only one node in the list
		        if (head.next == null) {
		        	//prev = null
		            head = null; // If there's only one node, set head to null
		            tail = null; // Also update tail to null
		        } else {
		            // Delete the first element
		        	//prev.next = null;
		            head = head.next;
		        }
		    } else {
		        System.out.print("List is empty");
		    }
		}
		void delete()
		{
			//tail.next only is pointed to head not tail and head
			if(tail!=head) //tail!=null(tail==head)
			{
				//delete first element
				head=head.next;
				tail.next=head;
			}else
			{
				head=tail=null;
				 System.out.print("done");
			}
		}
	    private Node getLastNode() {
	        Node current = head;
	        int count=0;
	        while (current.next != head) {
	        	count++;
	        	System.out.println("count "+ count);
	        	System.out.println("cureent next "+ current.next);
	            current = current.next;
	            System.out.println("cureent "+ current);
	        }
	        return current;
	    }
		void deletespecificelement(int value)
		{
	        if (head == null) {
	            return;
	        }

	        // If the value to be removed is at the head
	        if (head.data == value) {
	            //Node last = getLastNode();
	        	Node last = tail;
	            head = head.next;
	            last.next = head; // Adjust the last node's next pointer
	            System.out.print("done");
	            return;
	        }

	        Node current = head;
	    	int count=0;
	        // Traverse the list until we reach the node before head again
	        while (current.next != head && current.next.data != value) {
	        	//       while (current != head && current.data != value) {
				count++;
				System.out.println("count "+ count);
	        	System.out.println("cureent next "+ current.next);
	            current = current.next;
	            System.out.println("cureent "+ current);
	        }

	        // If the value is found, remove it by adjusting pointers
	        if (current.next != head && current.next.data == value) {
	            current.next = current.next.next;
	        }
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCircular l1= new LinkedListCircular();
		l1.insertElements(4);
		//l1.insert(41);
		//l1.insert(41);
		//l1.insert(41);
		l1.insertElements(69);
		//l1.insertElements(2);		
		//l1.insertElements(4);
		//l1.insertElements(69);
		//l1.insertElements(12);
		//l1.insertElements(12);
		l1.delete();
		//l1.deletespecificelement(12);
		l1.display();
	}

}
