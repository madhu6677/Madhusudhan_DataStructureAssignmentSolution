package com.gl.alg.datastructureassig;
import java.util.Scanner;

import java.util.Deque;
import java.util.LinkedList;
	//class
	public class BsttransactionQ1 {
		
		static int value;
		static Scanner sc = new Scanner(System.in);
		Deque<Node> queue = new LinkedList<Node>();
		
		static class Node {
		int key;
		Node left;
		Node right;
		}
		static Node newNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		return temp;
		}
		Node insertNode1(Node root, int key) {
			Node newnode = newNode(key);
			if (root == null) {
			root = newnode;
			queue.add(root);
			return root;
			} else {
			Node node;
			node = queue.remove();
			System.out.println("parent is: " + node.key);
			if (node.left == null) {
			node.left = newnode;
			queue.add(node.left);
			queue.addFirst(node);
			return root;
			} else if (node.right == null) {
				node.right = newnode;
				queue.add(node.right);
				return root;
				}
				}
				return root;
				}
				public void preOrder1(Node root) {
				if (root == null)
				return;
				else {
				System.out.print(root.key + " ");
				preOrder1(root.left);
				preOrder1(root.right);
				}
				}
	//Main method			
	public static void main(String args[]) {
		
	BsttransactionQ1 preOrder = new BsttransactionQ1();
		Node root = null;
	   String status = "a";
	  while (!status.equals("s")) {
	System.out.println("Enter the total no of floors in the building");
	value = sc.nextInt();
	root = preOrder.insertNode1(root, value);
	System.out.println("Enter the floor size given on day :");
				
	preOrder.preOrder1(root);
	System.out.println("\nThe order of construction is as follows");
	status = sc.next();
					}
	System.out.println("Program Completed successfully");
				}
				
	public Node insertNode(Node root, int value) {
			
			return null;
		}

	public void preOrder(Node root) {
			
			
		}
	}
