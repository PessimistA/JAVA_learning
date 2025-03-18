package exam_work;

class wizard extends character {
	private String spellString;

	public String getSpellString() {
		return spellString;
	}
	public void setSpellString(String spellString) {
		this.spellString = spellString;
	}
	public wizard(String weaponString,String nameString,int health,int attack_power) {
		super(nameString, health, attack_power);
		setSpellString(spellString);
	}
	public void cast_spell(character target) {
	        super.attack(target); 
	        System.out.println(this.getNameString() + " attacks with " + getSpellString() + ".");
	}
}
