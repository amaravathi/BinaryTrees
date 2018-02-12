package com.binarytree.test;

public class Main {
	public static void main( String[] args ) {
		BinaryTreeNode root = createTree() ;
		
		System.out.print( " PreOrder: ");
		Traversals.preOrderRecursive( root );
		
		System.out.println();
		System.out.print( " PostOrder: ");
		Traversals.postOrderRecursive( root );
		
		System.out.println();
		System.out.print( " InOrder: ");
		Traversals.inOrderRecursive( root );
		
		System.out.println();
		System.out.print( " PreOrderNonRecursive: ");
		Traversals.preOrderNonRecursive( root );
		
		System.out.println();
		System.out.print( " InOrderNonRecursive: ");
		Traversals.InOrderNonRecursive( root );
		
		System.out.println();
		System.out.print( " LevelOrder: ");
		Traversals.levelOrder( root );
		
	}
	public static BinaryTreeNode createTree() {
		BinaryTreeNode root = new BinaryTreeNode();
		root.setData( 1 );
		
		BinaryTreeNode node = new BinaryTreeNode();
		node.setData( 2 );		
		root.setLeft( node );
		
		node = new BinaryTreeNode();
		node.setData( 3 );		
		root.setRight( node );
		
		node = new BinaryTreeNode();
		node.setData( 4 );
		root.getLeft().setLeft( node );
		
		node = new BinaryTreeNode();
		node.setData( 5  );
		root.getLeft().setRight( node );
		
		node = new BinaryTreeNode();
		node.setData( 6 );
		root.getRight().setLeft( node );
		
		node = new BinaryTreeNode();
		node.setData( 7  );
		root.getRight().setRight( node );			
		
		return root;		
	}
	

}
