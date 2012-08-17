interface KickassWeapon{void swing();}
public class Sword implements KickassWeapon{
	static int lengthCm = 120;
	public static void main(String[] args) {
		Sword s = new Sword();
		s.swing();
	}
	public void swing() {
		TrainingSwordOfTheMonkey tsm = new TrainingSwordOfTheMonkey();
		tsm.ownage();
		//Q: How many objects eligible for garbage collection at this point?
	}
}

class TrainingSword extends Sword{
	int hitpower = 5;
	static Object[] mode = new Object[1];
	public TrainingSword() {mode[0] = new String("aggressive");}
}

class TrainingSwordOfTheMonkey extends TrainingSword{
	Boolean epicNevertheless;
	void ownage() {
		String battlecry = "Arrr ";
		int hitpower = 20;
		System.out.println(battlecry + hitpower + " attack");
	}
}