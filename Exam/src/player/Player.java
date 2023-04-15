package player;

public class Player {
	String name;
	int totalWickets;
	String playerType;
	
	

	public Player(String name, int totalWickets, String playerType) {
		//super();
		this.name = name;
		this.totalWickets = totalWickets;
		this.playerType = playerType;
	}



	public int getTotalWickets()                   {
		return totalWickets;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", totalWickets=" + totalWickets + ", playerType=" + playerType + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Every player has name, total_wickets and role attributes
		Player ashwin = new Player("Ashwin", 455, "Bowler");
		Player shammi = new Player("Shammi", 344, "Bowler");
		//If below line un-commented, it should be compile time error 
		//Player p3 = new Player();
		if ( ashwin.getTotalWickets() > shammi.getTotalWickets() )
		System.out.println(ashwin);
		else
		System.out.println(shammi);

	}

}
