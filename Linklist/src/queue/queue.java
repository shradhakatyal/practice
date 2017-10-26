package queue;
public class queue {
	Node head,tail;
	int size;
	public queue(){
		head=null;
		tail=null;
		size=0;
	}
	public void addAtTail(int k){
		Node temp=new Node(k,null);
		if(head==null){
			head=temp;
			tail=head;
		}
		else if(head.next==null){
			head.setNext(temp);
			tail=temp;
		}
		else{
			tail.setNext(temp);
			tail=temp;
		}
		size++;
	}
	public Node popFromHead(){
		Node temp;
		if(head==null){
			return null;
		}
		else if(head.getNext()==null){
			temp=head;
			head=null;
			tail=null;
			size--;
			return temp;
		}
		else{
			temp=head;
			head=head.getNext();
			size--;
			return temp;
		}
	}
	public void display(){
		Node ptr=head;
		if(head==null){
			System.out.println("Empty List!");
		}
		else if(head.getNext()==null){
			System.out.println(ptr.getKey());
		}
		else{

			while(ptr.getNext()!=null){
				System.out.print(ptr.key+" ");
				ptr=ptr.next;
			}
			System.out.println(ptr.key);
		}
	}
}
