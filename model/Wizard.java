package model;

public class Wizard extends Player {
 private int mana;

public Wizard() {
	super();
	// TODO Auto-generated constructor stub
}

public Wizard(int health_point, int strength, int lives) {
	super(health_point, strength, lives);
	// TODO Auto-generated constructor stub
}

public Wizard(int health_point, int strength, int lives, int mana) {
	super(health_point, strength, lives);
	this.mana = mana;
}

public int getMana() {
	return mana;
}

public void setMana(int mana) {
	this.mana = mana;
}

@Override
public String toString() {
	return "Wizard [mana=" + mana + ", getHealth_point()=" + getHealth_point() + ", getStrength()=" + getStrength()
			+ ", getLives()=" + getLives() + "]";
}
 
 
 
 
 
}
