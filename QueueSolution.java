package selfstudy;
class QueueMethod
	{
		int front_Q=0, rear_Q=0, capacityOfQueue=0;
		static int[] q1;
		
		QueueMethod(int size)
		{
			capacityOfQueue=size;
			q1=new int[capacityOfQueue ];
		}

		void enqueue(int value)
		{
			if(rear_Q==capacityOfQueue )
			{
				System.out.println("Empty");
			}
			else
			{
				q1[rear_Q]=value;
				rear_Q++;
			}
		}
		void dequeue()
		{
			//empty
			if(rear_Q==0)
			{
				System.out.println("There is no data in the queue");
			}
			else
			{
				for(int i=0; i< rear_Q-1; i++)
				{
					q1[i]=q1[i+1];
				}
				rear_Q--;
			}	
		}
		void display()
		{
			//empty
			if(rear_Q==0)
			{
				System.out.println("There is no data in the queue");
			}
			else
			{
				for(int i=0; i< rear_Q-1; i++)
				{
					System.out.println(q1[i]);
				}
				rear_Q--;
			}
			System.out.println("front_Q " +front_Q);
			System.out.println("rear_Q " +rear_Q);
		}
		void peekFirst()
		{
			System.out.println(q1[front_Q]);
		}
		void peekLast()
		{
			System.out.println(q1[rear_Q]);
		}
		void anothertypedeuqueue()
		{
		for (int i = 0; i < rear_Q - 1; i++)
		{
		q1[i]=q1[i+1];
		System.out.println(" "+i);
		}
		rear_Q--;
		}
	}
public class QueueSolution {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueMethod q=new QueueMethod(5);
		q.enqueue(5); //0
		q.enqueue(6); //1
		q.enqueue(2); //2
		q.enqueue(61); //3
		q.enqueue(23);//4
		//q.peekLast();
		//q.peekFirst();
		//q.display();
		//q.dequeue();
		q.anothertypedeuqueue();
		q.display();

	}

}
