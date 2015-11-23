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
			if (intTofind > this.value){
				If (right != null){
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
	
	public IntegerTreeNode(int newvalue){
		this.value = newvalue;
		this.left = null;
		this.right = null;
	}
	
	public void addInteger(int newInteger)
	{
		if(newInteger() > value){
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