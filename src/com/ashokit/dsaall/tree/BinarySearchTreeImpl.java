package com.ashokit.dsaall.tree;



public class BinarySearchTreeImpl {
	
	static Node root=null;
	static class Node{
		Object data;
		Node left;
		Node right;
		Node(Object data){
			this.data=data;
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeImpl b= new BinarySearchTreeImpl();
		b.add(50);
		b.add(20);
		b.add(70);
		b.add(101);
		b.add(10);
		b.add(45);
		//b.add(49);
		System.out.println("inprder");
		b.inOrder(root);
		
		//left node
		System.out.println("leaf node");
		b.leftNode(root);
		
		//height of tree
		System.out.println("height of tree");
		System.out.println("height is"+b.heightoftree(root));
		
		//level of order
		System.out.println("levelOrder");
		b.levelOrder(root);
		
		//mirror image
		System.out.println("mirror image");
		
		System.out.println("Original tree (Inorder traversal):");
        b.inOrder(root);

        // Call the mirrorImage method
        b.mirririmage(root);

        System.out.println("\nMirrored tree (Inorder traversal):");
        b.inOrder(root);
        
        //minvalue
        System.out.println("Min Value");
        BinarySearchTreeImpl b1= new BinarySearchTreeImpl();
		b1.add(50);
		b1.add(20);
		b1.add(70);
		b1.add(101);
		b1.add(10);
		b1.add(45);
        System.out.println(b1.minValue(root));
        
        System.out.println("Min Value");
        System.out.println(b1.maxValue(root));
	}
	
	

	public void add(Object obj) {
		Integer givenNodeVal=(Integer)obj;//givenNodeVal=49
		Node n= new Node(obj);
		if(root==null) {
			root=n;
		}else {
			Node temp=root;//50
			while(true) {
				Integer rootVal=(Integer)temp.data;//45
				if(givenNodeVal.intValue()<rootVal.intValue()) {//49<49
					if(temp.left!=null) {
						temp=temp.left;//temp=20
					}else {
						temp.left=n;
						return;
					}
				}else {
					if(temp.right!=null) {
						temp=temp.right;//45
					}else {
						temp.right=n;
						return;
					}
				}
			}
		}
	}
	
	void inOrder(Node root){
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	void preOder(Node root){
		if(root!=null) {
			System.out.println(root.data);
			preOder(root.left);			
			preOder(root.right);
		}
	}
	
	void postOrder(Node root){
		if(root!=null) {			
			postOrder(root.left);			
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
	
	void leftNode(Node root)//leaf node
	{
		
		if(root!=null)
		{
			if(root.left==null && root.right==null)
			{
				System.out.println(root.data);
			}
			else
			{
				leftNode(root.left);
				leftNode(root.right);
			}
		}
	}
	
	
	 int heightoftree(Node root)
	{
	   if(root==null)
	   {
		   return 0;
	   }
	   else
	   {
		   //intialze left aand right node
		   int leftnode=0;
		   int rightnode=0;
		   leftnode=heightoftree(root.left);
		   rightnode=heightoftree(root.right);
		   
		   if(leftnode>rightnode)
		   {
			   return leftnode+1;
		   }
		   else
		   {
			   return rightnode+1;
		   }
		   
	   }
	
	
	
	}
	
	 
	 public void levelOrder(Node root)
	 {
		 int h=heightoftree(root);
		 for (int i = 1; i < h; i++) {
			 printNodeAtHeight(root,h);
		}
	 }
	 
	 public void printNodeAtHeight(Node root,int level) {
		 
		 if(root==null)
		 {
			 return;
		 }
		 if(level==1)
		 {
			 System.out.println(root.data);
		 }
		 else if(level>1)
		 {
			 printNodeAtHeight(root.left,level-1);
			 printNodeAtHeight(root.right,level-1);
		 }
			 
	 }
	 
	 public void mirririmage(Node root)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 else
		 {
			 mirririmage(root.left);
			 mirririmage(root.right);
			 
			 swap(root);
		 }
	 }

	private void swap(Node root2) {
		// TODO Auto-generated method stub
		if(root2==null)
		{
			return;
		}
		else
		{
			Node temp=root2.left;
			root2.left=root2.right;
			root2.right=temp;
		}
	}
	
	public Object minValue(Node root3)
	{
		Object data=null;
		while(root3!=null)
		{
			data=root3.data;
			root3=root3.left;
		}
		return data;
	}
	
	
	public Object maxValue(Node root3)
	{
		Object data=null;
		while(root3!=null)
		{
			data=root3.data;
			root3=root3.right;
		}
		return data;
	}
	
}
