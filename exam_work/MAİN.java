package exam_work;

public class MAİN {
	public static void main(String[] args) {
		wizard wzdWizard= new wizard("ti", "Al", 79, 49);
		warrior wrWarrior = new warrior("hi", "ol", 100, 90);
		//wrWarrior.attack(wzdWizard);
		wzdWizard.cast_spell(wrWarrior) ;
	}
}
