package model;

public class Elf extends Player {
	private  int speed;

	public Elf(int health_point, int strength, int lives, int speed) {
		super(health_point, strength, lives);
		this.speed = speed;
	}

	public Elf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elf(int health_point, int strength, int lives) {
		super(health_point, strength, lives);
		// TODO Auto-generated constructor stub
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Elf [speed=" + speed + ", getHealth_point()=" + getHealth_point() + ", getStrength()=" + getStrength()
				+ ", getLives()=" + getLives() + "]";
	}
	

}
