package tree;

public class binarySearchTree {
	treeNode root;
	public binarySearchTree(){
		root=null;
	}
	public boolean isEmpty(){
		if(root==null){
			return true;
		}
		else
			return false;
	}
//	public void insertNode(int k){
//		treeNode temp=new treeNode(k);
//		treeNode ptr=root;
//		//treeNode pptr=root;
//		if(root==null){
//			root=temp;
//		}
//		else{
//			while (true){
//				if(temp.getKey()<ptr.getKey()){
//					if(ptr.getLeftChild()==null){
//						ptr.setLeftChild(temp);
//						return;
//					}
//					else{
//						ptr=ptr.getLeftChild();
//					}
//				}
//				else if(temp.getKey()>ptr.getKey()){
//					if(ptr.getRightChild()==null){
//						ptr.setRightChild(temp);
//						return;
//					}
//					else{
//						ptr=ptr.getRightChild();
//					}
//				}
//				else{
//					System.out.println("Node already exists!");
//				}
//			}
//		}
//	}
	public void insertNode(int k){
		root=insertNode(root,k);
	}
	public treeNode insertNode(treeNode r,int k){
		if(r==null){
			r=new treeNode(k);
		}
		else{
			if(r.getKey()>k){
				r.left=insertNode(r.getLeftChild(),k);
			}
			else{
				r.right=insertNode(r.getRightChild(),k);
			}
		}
		return r;
	}
	public boolean search(int val){
		return search(root,val);
	}
	private boolean search(treeNode r, int val){
		boolean found=false;
		while(r!=null&&!found){
			if(val<r.getKey()){
				r=r.getLeftChild();
			}
			else if(val>r.getKey()){
				r=r.getRightChild();
			}
			else{
				found=true;
				break;
			}
		}
		return found;
	}
	public int size(){
		return size(root);
	}
	private int size(treeNode r){
		if(root==null){
			return 0;
		}
		else{
			int count=1;
			if(r.getLeftChild()!=null){
				count+=size(r.getLeftChild());
			}
			if(r.getRightChild()!=null){
				count+=size(r.getRightChild());	
			}
			return count;
		}
	}

	 public void inorder()
     {
         inorder(root);
     }
	private void inorder(treeNode r)
    {
        if (r != null)
        {
            inorder(r.getLeftChild());
            System.out.print(r.getKey() +" ");
            inorder(r.getRightChild());
        }
    }
	
}
