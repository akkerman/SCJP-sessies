
public class BobTheBuilder {
	
	private String tool;
	
	BobTheBuilder(String tool){
		this.tool = tool;
	}
	
	public static void main(String[] args) {
		BobTheBuilder builder1 = new BobTheBuilder("Hammer");
		builder1.build();
		RobTheBuilder builder2 = new RobTheBuilder();
		builder2.build();
	}	
	
	private void build(){
		System.out.println("O YEAH! I am using my " + tool);
	}
}

class RobTheBuilder extends BobTheBuilder{
	protected void build(){
		System.out.println("I ROCKED THE " + tool + "!");
	}
}