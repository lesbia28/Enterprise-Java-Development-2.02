package model;

public abstract class Player {
	
	private int health_point;
	private int strength;
	private int lives;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Player(int health_point, int strength, int lives) {
		super();
		this.health_point = health_point;
		this.strength = strength;
		this.lives = lives;
	}
	public int getHealth_point() {
		return health_point;
	}
	public void setHealth_point(int health_point) {
		this.health_point = health_point;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	
	public void attack(Player player2) {
		player2.setHealth_point(player2.getHealth_point()-this.strength);
		if (player2.getHealth_point()<0  ) {
		player2.setLives(player2.getLives()-1);
		}
		
			
	}

}
