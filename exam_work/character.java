package exam_work;

public class character {
	   private String nameString;
	    private int health;
	    private int attack_power;

	    // Getter ve Setter metodları
	    public String getNameString() {
	        return nameString;
	    }

	    public void setNameString(String nameString) {
	        this.nameString = nameString;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public void setHealth(int health) {
	        this.health = health;
	    }

	    public int getAttack_power() {
	        return attack_power;
	    }

	    public void setAttack_power(int attack_power) {
	        this.attack_power = attack_power;
	    }

	    // Constructor
	    public character(String nameString, int health, int attack_power) {
	        setNameString(nameString);
	        setHealth(health);
	        setAttack_power(attack_power);
	    }
	protected void take_damage(int attack_power) {
		this.health -=-attack_power;
		 System.out.println(nameString + " has taken " + attack_power + " damage. Health is now " + health + ".");
	}
	protected void attack(character target) {
		target.take_damage(this.attack_power);
	}	
	
}
