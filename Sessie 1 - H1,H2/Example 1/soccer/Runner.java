package soccer; 

public interface Runner{
	void run();
	int sprintSpeed = 10;
}	

class SoccerPlayer2 implements Runner{
	void run(){
		setSprintSpeed(15);
	}

	private void setSprintSpeed(int speed){
		sprintSpeed = speed;
	}	
}
