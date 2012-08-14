public abstract class House{
	
	int getHouseNumber(){return 1;}
	private String getSize(){return "HUGE";};
	public abstract void setOnFire();
	protected void callFireBrigade(){};
}

abstract class Villa extends House{
	public int getHouseNumber(String gateName){return 2;}
	private String getSize(){return "MORE HUGE";}	
	void callFireBrigade(){};
}

class Mansion extends Villa{	
}
