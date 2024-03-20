package selfstudy;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stackone=new Stack<>();
		//1. push(), pop(), peek(), 
		//Inserting elements in stack
		stackone.push(111);
		stackone.push(90);
		stackone.push(100);
		stackone.push(0);
		stackone.push(8);
		//

		System.out.print(stackone);
		stackone.pop(); //First element will be removed -> Which is last entered value
		System.out.print(stackone);
		System.out.println(stackone.peek()); //peek last one
		System.out.println(stackone.empty());
		//Search()
		int index=stackone.search(10);
		System.out.println(index);
		//Iterator:
		//How to iterate over stack:
		Iterator<Integer> found=stackone.iterator();
		
		while(found.hasNext())
		{
			Object stacktwo=found.next();
			System.out.print(stacktwo + " ");
			//System.out.print("Stack one:" + stackone);
		}
		
		System.out.println(stackone.size());
		
		//Sort
		//stackone.sort(null);
		//System.out.println(stackone);
		Stack<Integer> sortedStack=sortStack(stackone);
		System.out.println(sortedStack);
        System.out.println("Sorted stack:");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
        Iterator<Integer> further = sortedStack.iterator();
        while(further.hasNext())
        {
        	Object stackthree= further.next();
        	System.out.println(stackthree);
        }
	}

    // Sorts the input stack in ascending order using a temporary stack
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<>();
        while (!input.isEmpty()) {
            int tmp = input.pop();
            //generallly first value < second value 
            // if stack is not empty and peek value < temp
            while (!tmpStack.isEmpty() && tmpStack.peek() < tmp) {
            	//ush the value from temp. looks like temp = a[j] then a[j]=a[j+1] then a[j+1]=temp;
                input.push(tmpStack.pop());
            }
            // if it doesn't satisfy the condition then push the value to temp stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}
