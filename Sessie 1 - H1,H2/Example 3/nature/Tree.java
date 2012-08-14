package nature; 

public class Tree{
	
	public static void main(String[] args) {
		new Tree().grow();
		new BigTree().grow();
		new BigTree().moveToTheWind(10);
	}
	
	private void grow(){
		System.out.println("Tree is growing!");
	}
	public void moveToTheWind(int moveSpeed){
		 System.out.println("Tree is moving at " + moveSpeed);
	}
}	

class BigTree extends Tree{
	private void grow(){
		System.out.println("BigTree is growing!");
	}	
}
