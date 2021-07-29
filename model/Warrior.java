package model;

public class Warrior  extends Player{
	private int stamina;

	public Warrior(int health_point, int strength, int lives, int stamina ) {
		super(health_point, strength, lives);
		this.stamina =stamina ;
	}

	public Warrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Warrior(int health_point, int strength, int lives) {
		super(health_point, strength, lives);
		// TODO Auto-generated constructor stub
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	@Override
	public String toString() {
		return "Warrior [stamina=" + stamina + ", getHealth_point()=" + getHealth_point() + ", getStrength()="
				+ getStrength() + ", getLives()=" + getLives() + "]";
	}
	
	

}
