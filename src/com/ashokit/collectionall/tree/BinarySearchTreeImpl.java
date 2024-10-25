package com.ashokit.collectionall.tree;

import com.ashokit.collectionall.tree.TreeImplementation.Node;

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
		b.inOrder(root);
		
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
}
