package tree;

public class treeNode {
	treeNode left;
	treeNode right;
	int key;
	public treeNode(){
		left=null;
		right=null;
		key=0;
	}
	public treeNode(int k){
		left=null;
		right=null;
		key=k;
	}
	public void setLeftChild(treeNode l){
		left=l;
	}
	public void setRightChild(treeNode r){
		right=r;
	}
	public treeNode getLeftChild(){
		return left;
	}
	public treeNode getRightChild(){
		return right;
	}
	public int getKey(){
		return key;
	}
}
