package com.ashokit.collectionall.tree;

public class TreeImplementation {
	
	static Node root=null;
	static class Node{
		Object data;
		Node leftChild;
		Node rightChild;
		Node(Object data){
			this.data=data;
		}
	}
	
	//Binary Tree
	public static void main(String[] args) {
		TreeImplementation t= new TreeImplementation();
		t.root=new Node("A");
		t.root.leftChild= new Node("B");
		t.root.rightChild=new Node("C");
		t.root.leftChild.leftChild= new Node("D");
		t.root.leftChild.rightChild= new Node("E");		
		t.root.rightChild.rightChild= new Node("G");
		t.root.rightChild.leftChild= new Node("F");
		
		System.out.println(root);
		
		//
		
	}
	
	

}
