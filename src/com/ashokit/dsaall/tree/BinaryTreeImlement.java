package com.ashokit.dsaall.tree;

public class BinaryTreeImlement {
	
	static Node root = null;
	static class Node
	{
		Object data;
		Node Left;
		Node Right;
		
		Node(Object data)
		{
			this.data=data;
		}
	}
	
	
	public static void main(String[] args) {
		
		BinaryTreeImlement b= new BinaryTreeImlement();
		b.root = new Node("10");
		b.root.Left= new Node("8");
		b.root.Right=new Node("7");
		b.root.Left.Left= new Node("5");
		b.root.Left.Right=new Node("4");
		b.root.Right.Left=new Node("3");
		b.root.Right.Right=new Node("2");

		
		System.out.println(root);
		
	}

}
