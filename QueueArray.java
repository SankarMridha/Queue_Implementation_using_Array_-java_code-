import java.util.Scanner;

public class QueueArray {
	public static final int MAX = 5;
	public static int front = -1;
	public static int rear= -1;
    public static void insert(int S[])
    {
        Scanner sc = new Scanner(System.in);
        if(isFull(rear))
            System.out.println("Queue Overflow, Insert not possible");
        else
        {
            System.out.println("Enter a data to be add: ");
            if(front==-1)
            {
            	front = 0;
            }
            rear++;
            S[rear] = sc.nextInt();
        }
    }
    public static void Delete(int S[])
    {
        if(isEmpty(front))
        	System.out.println("Queue Underflow, delete not possible");
        else
        {
        	System.out.println("Deleted item is "+S[front]);
        	if(front==rear)
        	{
        	   rear=-1;
        	   front=-1;
        	}
        	else
        	{
        		front++;
        	}
        }
    }
    public static void display(int S[])
    {
        if(front==-1)
         System.out.println("Empty queue");
        else
        {
            System.out.println("Array elements are: ");
            for(int i = front;i<=rear;i++)
            {
                System.out.print(S[i]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isFull(int rear)
    {
        return rear==MAX-1;
    }
    public static boolean isEmpty(int front)
    {
        return front==-1;
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for creating queue using array");
		int[] S = new int[MAX];
		while(true)
		{
			System.out.println("Manu for different operation");
			System.out.println("Press 0: Exit");
			System.out.println("Press 1: Insert");
			System.out.println("Press 2: Delete");
			System.out.println("Press 3: Display");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 0: System.exit(0);
			case 1: insert(S);
			        break;
			case 2: Delete(S);
					break;
			case 3: display(S);
	        		break;
			default: System.out.println("Wrong choice, try again");
			}
		}
	}
}
