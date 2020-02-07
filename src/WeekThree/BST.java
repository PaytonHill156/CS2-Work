package WeekThree;

public class BST {

	Node root;

	public BST(int initialValue, char[] initialTestResults){
		root = new Node(initialValue, initialTestResults);
	}

	public boolean addNode(int valueToAdd, char[] testResults){
		return addNode(root, valueToAdd, testResults);
	}

	private boolean addNode(Node current, int valueToAdd, char[] testResults){
		//safety check, is the current node null
		if(current == null){
			return false; //Failed the add
		}

		//Test to see if the valueToAdd is lessthanorequalto current node, if so call left node
		//unless left node is null, in which case add the new node
		if(valueToAdd < current.value || valueToAdd == current.value){
			if(current.left == null){
				current.left = new Node(valueToAdd, testResults);
				return true;
			} else {
				return addNode(current.left, valueToAdd, testResults);
			}
		}

		//If valueToAdd is greaterthan this node, call on right node unless right node is null
		//in which case add the new node
		if(valueToAdd > current.value){
			if(current.right == null){
				current.right = new Node(valueToAdd, testResults);
				return true;
			} else {
				return addNode(current.right, valueToAdd, testResults);
			}
		}

		return false; //Something has gone horribly wrong, should never reach this point
	}

	//Printing the tree! Public wrapper
	public void printLowToHigh(){
		printLowToHigh(root);
	}


	private void printLowToHigh(Node current){
		if(current == null){
			//base case
			return;
		}


		//recurse left subtree first, then print
		if(current.left != null){
			printLowToHigh(current.left);
		}

		//Print current
		current.print();

		//Print right subtree
		if(current.right != null){
			printLowToHigh(current.right);
		}
	}
	
	
	public void printHighToLow(){
		printHighToLow(this.root);
	}


	public void printHighToLow(Node current){
		if(current == null){
			return;
		}

		//Print right subtree first
		if(current.right != null){
			printHighToLow(current.right);
		}

		//Print current
		current.print();

		//Print left subtree
		if(current.left != null){
			printHighToLow(current.left);
		}
	}
}