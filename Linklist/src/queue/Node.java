package queue;

public class Node {
	protected int key;
	protected  Node next;
	public Node(){
		key=Integer.parseInt(null);
		next=null;
	}
	public Node(int ke,Node n){
		key=ke;
		next=n;
	}
	public int getKey(){
		return key;
	}
	public void setNext(Node n){
		next=n;
	}
	public Node getNext(){
		return next;
	}
}
