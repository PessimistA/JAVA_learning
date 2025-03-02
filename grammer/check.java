package grammer;

public class check {
	static String check_all(String sentence) {
		sentence=plural_making.quantifiers(sentence);
		sentence = compare.comporasion(sentence);
		sentence = Simple_tense.work(sentence);
		
		return sentence;
	}
}
