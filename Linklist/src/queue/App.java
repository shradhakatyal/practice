package queue;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		queue q=new queue();
		char ch;
		System.out.println("Choose one of the following options:");
		do{
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Check whether queue is empty");
			System.out.println("4. Display queue");
			int n=sc.nextInt();
			switch(n){
			case 1:
				System.out.println("Element to be enqueued:");
				int k=sc.nextInt();
				q.addAtTail(k);
				q.display();
				break;
			case 2:
				Node t=q.popFromHead();
				if(t==null){
					System.out.println("Queue is empty!");
				}
				else{
					System.out.println("Dequeued element is: "+t.getKey());
					q.display();
				}
				break;
			case 3:
				if(q.size==0){
					System.out.println("Queue is empty!");
				}
				else
					System.out.println("Queue is not empty!");
				break;
			case 4:
				q.display();
				break;
			default:
				System.out.println("You've entered an invalid option!");
			}
			System.out.println("Do you want to continue(Press 'y' to continue)");
			ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
		sc.close();
	}
}
