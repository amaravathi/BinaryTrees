package com.binarytree.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversals {
	
	public static void preOrderRecursive( BinaryTreeNode root ) {
		if ( root != null ) {
			System.out.print( root.getData() + " " );
			preOrderRecursive( root.getLeft() );
			preOrderRecursive( root.getRight() );			
		}		
	}
	public static void postOrderRecursive( BinaryTreeNode root ) {
		if ( root != null ) {			
			postOrderRecursive( root.getLeft() );
			postOrderRecursive( root.getRight() );
			System.out.print( root.getData() + " " );
		}		
	}
	public static void inOrderRecursive( BinaryTreeNode root ) {
		if ( root != null ) {			
			inOrderRecursive( root.getLeft() );
			System.out.print( root.getData() + " " );
			inOrderRecursive( root.getRight() );			
		}		
	}	
	public static void preOrderNonRecursive( BinaryTreeNode root ) {
		if ( root == null ) return ;
		Stack < BinaryTreeNode > S = new Stack() ;
		
		while( true ) {
			while ( root != null ) {
				System.out.print( root.getData()+ " ");
				S.push( root );
				root = root.getLeft();			
			}
			if ( S.isEmpty() )
				break;
			root = S.pop();
			root = root.getRight();			
		}
	}
	public static void postOrderNonRecursive( BinaryTreeNode root ) {
		if ( root == null ) return;
		
		Stack < BinaryTreeNode > S = new Stack();
		while ( true ) {
			
		}	
	}
	public static void InOrderNonRecursive( BinaryTreeNode root ) {
		if ( root == null ) return;
		
		Stack < BinaryTreeNode > S = new Stack();
		while ( true ) {
			while ( root != null ) {
				S.push( root );
				root = root.getLeft();
			}
			if ( S.isEmpty() )
				break;
			
			root = S.pop();
			System.out.print( root.getData()+" " );
			root = root.getRight();			
		}	
	}
	public static void levelOrder( BinaryTreeNode root ) {
		if ( root == null ) return;
		
		Queue < BinaryTreeNode > q = new LinkedList<BinaryTreeNode>();
		q.add( root );
		
		BinaryTreeNode node = null;
		while ( !q.isEmpty() ) {
			node = q.remove();
			System.out.print( node.getData()+" ");
			if ( node.getLeft() != null )
				q.add( node.getLeft() );
			if ( node.getRight() != null )
				q.add( node.getRight() );
		}
		
	}
}
