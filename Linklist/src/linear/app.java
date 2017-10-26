package linear;
import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		list List=new list();
		char ch;
		System.out.println("Choose one of the following options:");
		do{
			System.out.println("1. Insert at beginning");
			System.out.println("2. Insertion at end");
			System.out.println("3. Insertion after the specified element");
			System.out.println("4. Deletion from specified position");
			System.out.println("5. Check whether the list is empty");
			System.out.println("6. Return the size of the linked list");
			System.out.println("7. Reverse the linked list");
			System.out.println("8 Traversal of linked list");
			int a=sc.nextInt();
			int e;
			switch(a){
			case 1:
				System.out.println("Enter the element:");
				e=sc.nextInt();
				List.addAtStart(e);
				List.display();
				break;
			case 2:
				System.out.println("Enter the element:");
				e=sc.nextInt();
				List.addAtEnd(e);
				List.display();
				break;
			case 3:
				System.out.println("Enter the element top be added:");
				e=sc.nextInt();
				System.out.println("Enter the key after which new element is to be added:");
				int k=sc.nextInt();
				List.addAfter(e, k);
				List.display();
				break;
			case 4:
				System.out.println("Enter the position from which to be deleted:");
				int pos=sc.nextInt();
				List.deleteFromPos(pos);
				List.display();
				break;
			case 5:
				List.isEmpty();
				break;
			case 6:
				List.size();
				break;
			case 7:
				List.reverse();
				List.display();
				break;
			case 8:
				List.display();
			default:
				System.out.println("You've entered an invalid number!!");
			}	
			System.out.println("Do you want to continue?(Press 'y' to continue)");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		sc.close();
	}

}
