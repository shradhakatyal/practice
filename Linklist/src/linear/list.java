package linear;

public class list {
	node start;
	int size;
	public list(){
		start=null;
		size=0;	
	}
	public void addAtStart(int v){
		node temp=new node(v,null);
		if(start==null){
			start=temp;
		}
		else{
			temp.setNext(start);
			start=temp;
		}
		size++;
	}
	public void addAtEnd(int v){
		node temp=new node(v,null);
		node ptr=start;
		if(start==null){
			start=temp;
		}
		else{
			while(ptr.getNext()!=null){
				ptr=ptr.getNext();
			}
			ptr.setNext(temp);
		}
		size++;
	}
	public void addAfter(int v,int k){
		node temp=new node(v,null);
		node ptr,pptr;
		ptr=start;
		while(ptr!=null){
			if(ptr.getKey()==k){
				pptr=ptr.getNext();
				ptr.setNext(temp);
				temp.setNext(pptr);
				size++;
			}
			ptr=ptr.getNext();
		}
	}
	public void deleteFromPos(int pos){
		if(pos>0&&pos<=size){
			if(start==null){
				System.out.println("List is empty!");
			}
			else if(start.getNext()==null){
				start=null;
			}
			node ptr=start;
			pos--;
			for(int i=1;i<size;i++){
				if(pos==i){
					node pptr=ptr.getNext();
					ptr.setNext(pptr.getNext());
				}
			}
			size--;
		}
		else{
			System.out.println("Invalid input!!");
		}
	}
	public void reverse(){
		node before,current,after;
		before=null;
		current=start;
		while(current!=null){
			after=current.getNext();
			current.setNext(before);
			before=current;
			current=after;
		}
		start=before;
	}
	public void isEmpty(){
		if(start==null){
			System.out.println("Empty!");
		}
		else
			System.out.println("Not Empty!");
	}
	public void size(){
		if(size==0){
			System.out.println("Empty!");
		}
		else
			System.out.println("The size is: "+size);
	}
	public void display(){
		node ptr=start;
		if(start==null){
			System.out.println("Empty List!");
		}
		else if(start.getNext()==null){
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
