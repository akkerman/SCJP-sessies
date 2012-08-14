package soccer;

import player.Player;

public class SoccerPlayer extends Player{
	public static void main(String[] args) {
		SoccerPlayer player = new SoccerPlayer();
		((Player)player).name = "Messi";
		((Player)player).age = 22; 		
	}
}

/*package player;

public class Player {
	String name;
	protected int age ;
}*/
