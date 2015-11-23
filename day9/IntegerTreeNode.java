public class IntegerTreeNode implements IntegerTree {
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
	
	public boolean contains(int intToFind){
		boolean result = false;
		if(this.value == intToFind){
			return true;
		}
		else {
			if (intToFind > this.value){
				if (right != null){
					return right.contains(intToFind);
				}	
			}
			else {
				if (left != null){
					return left.contains(intToFind);
				}
			}
		}
		return false;
	}
	
	public int getMax(){
		if (right == null){
			return this.value;
		}
		else {
			return right.getMax();
		}
	}
	
	public int getMin(){
		if (left == null){
			return this.value;
		}
		else {
			return left.getMin();
		}
	}
	
	public int getDepth(){
		int leftDepth = 0;
		if (left != null){
				leftDepth = left.getDepth();
		}
		int rightDepth = 0;
		if(right != null){
			rightDepth = right.getDepth();
		}
		if (leftDepth > rightDepth){
			return 1 + leftDepth;
		}
		else {
				return 1 + rightDepth;
		}
	}
	public IntegerTreeNode(int newvalue){
		this.value = newvalue;
		this.left = null;
		this.right = null;
	}
	
	public void addInteger(int newInteger)
	{
		if(newInteger > value){
			if(right == null) {
				right = new IntegerTreeNode(newInteger);
			}
			else {
				right.addInteger(newInteger);
			}
		}
		else {
			if(left == null) {
				left = new IntegerTreeNode(newInteger);
			}
			else {
				left.addInteger(newInteger);
			}
		}
	}
}