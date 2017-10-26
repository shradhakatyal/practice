package linear;

public class node {
	protected int key;
	protected  node next;
	public node(){
		key=Integer.parseInt(null);
		next=null;
	}
	public node(int ke,node n){
		key=ke;
		next=n;
	}
	public int getKey(){
		return key;
	}
	public void setNext(node n){
		next=n;
	}
	public node getNext(){
		return next;
	}
}
