public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public int getValue(){
		return value;
	}
	
	public IntegerTreeNode getLeft(){
		return left;
	}
	
	public IntegerTreeNode getRight(){
		return right;
	}
	
	public void setLeft(IntegerTreeNode leftNode){
		this.left = leftNode;		
	}
	 
	public void setRight(IntegerTreeNode rightNode){
		this.right = rightNode;
	}
	
	public IntegerTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public add(IntegerTreeNode n)
	{
		if(this.getValue() > n.getValue())
	}
}