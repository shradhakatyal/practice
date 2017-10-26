package tree;

public class runTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarySearchTree t=new binarySearchTree();
		t.insertNode(4);
		t.insertNode(2);
		t.insertNode(1);
		t.insertNode(3);
		t.insertNode(6);
		t.insertNode(5);
		t.insertNode(7);
		t.inorder();
		//boolean f=t.search(11);
		//System.out.println(f);
		System.out.println("Size: "+t.size());
	}

}
