package exam_work;

class warrior extends character {
	private String weaponString;
	public String getWeaponString() {
		return weaponString;
	}
	public void setWeaponString(String weaponString) {
		this.weaponString = weaponString;
	}
	public warrior(String weaponString,String nameString,int health,int attack_power) {
		super(nameString, health, attack_power);
		setWeaponString(weaponString);
	}
	  @Override
	    public void attack(character target) {
	        super.attack(target); 
	        System.out.println(this.getNameString() + " attacks with " + this.weaponString + ".");
	    }
}
