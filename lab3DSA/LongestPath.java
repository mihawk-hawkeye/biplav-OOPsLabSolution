package lab3DSA;

import java.util.ArrayList;
import java.util.Collections;

public class LongestPath {

	public static void main(String[] args) {

			Node root = new Node(100);
		 root.leftNode 	= new Node(20);
		 root.rightNode 	= new Node(130);
		 root.leftNode.leftNode 	= new Node(10);
		 root.leftNode.rightNode 	= new Node(50);
		 root.rightNode.leftNode 	= new Node(110);
		 root.rightNode.rightNode 	= new Node(140);
		 root.leftNode.leftNode.leftNode 	= new Node(5);
		 
		 ArrayList<Integer> path = findLongestPath(root);
		 for(int i=path.size()-1;i>=0;i--) {
			 System.out.print( "->" + path.get(i));
		 }
		 
		 System.out.println();
		 System.out.println(path.toString());
		 Collections.reverse(path);
		 System.out.println(path.toString());
	}

	private static ArrayList<Integer> findLongestPath(Node root) {
		if (root == null) {
			ArrayList<Integer> path = new ArrayList<>();
			return path;
		}
		ArrayList<Integer> rightNode =findLongestPath(root.rightNode); 
		ArrayList<Integer> leftNode =findLongestPath(root.leftNode);
		
		if(rightNode.size() <  leftNode.size()) {
			leftNode.add(root.data);
		}else {
			rightNode.add(root.data);
		}

		return (leftNode.size() > rightNode.size() ) ?leftNode : rightNode;
		
	}

}
