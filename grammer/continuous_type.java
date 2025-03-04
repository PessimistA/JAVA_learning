package grammer;

import java.util.Iterator;

public class continuous_type {
	public static String work(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";
		for (String word : wordStrings) {
			for (String past :continuous_verbs.past_cont) {
				if (word.contains(past)) {
					//senteString=past_tense(line);
					break;
				}	
			}
		}
		for (String word : wordStrings) {
			for (String future :continuous_verbs.future_cont) {
				if (word.contains(future)) {
					senteString=future_tense(line);
					break;
				}	
			}
		}
		for (String word : wordStrings) {
			for (String present :continuous_verbs.present_cont) {
				if (word.contains(present)) {
					//senteString=present_tense(line);
					break;
				}	
			}
		}
		for (String word : wordStrings) {
			for (String perfect :continuous_verbs.perfect_cont) {
				if (word.contains(perfect)) {
					//senteString=perfect_tense(line);
					break;
				}	
			}
		}
		return senteString;
	}
	/*
	public static String present_tense(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";

		for (int i=0;i<wordStrings.length;i++) {
			if("he".equals(wordStrings[i])||"she".equals(wordStrings[i])||"it".equals(wordStrings[i])) {
				for (int j=i;j<wordStrings.length;j++) {
					if ("do".equals(wordStrings[j])) {
						wordStrings[j]= "does";
						break;
					}
					else if("verb".equals(part_of_speech.tagWord(wordStrings[j]))){
						wordStrings[j]= tenses_verbs.tagWord(wordStrings[j]);
					}
				}
			}
			if("I".equals(wordStrings[i])||"you".equals(wordStrings[i])||"we".equals(wordStrings[i])||"they".equals(wordStrings[i])) {
				break;
			}
		}
        for (int i = 0; i < wordStrings.length; i++) {
			senteString=senteString+" "+wordStrings[i];
        }
		return senteString;
	}
	public static String perfect_tense(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";

		for (int i=0;i<wordStrings.length;i++) {
			if("he".equals(wordStrings[i])||"she".equals(wordStrings[i])||"it".equals(wordStrings[i])) {
				for (int j=i;j<wordStrings.length;j++) {
					if ("do".equals(wordStrings[j])) {
						wordStrings[j]= "does";
						break;
					}
					else if("verb".equals(part_of_speech.tagWord(wordStrings[j]))){
						wordStrings[j]= tenses_verbs.tagWord(wordStrings[j]);
					}
				}
			}
			if("I".equals(wordStrings[i])||"you".equals(wordStrings[i])||"we".equals(wordStrings[i])||"they".equals(wordStrings[i])) {
				break;
			}
		}
        for (int i = 0; i < wordStrings.length; i++) {
			senteString=senteString+" "+wordStrings[i];
        }
		return senteString;
	}
	public static String past_tense(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";

		for (int i=0;i<wordStrings.length;i++) {
			if("verb".equals(part_of_speech.tagWord(wordStrings[i]))) {
				wordStrings[i]= tenses_verbs.tagWord2(wordStrings[i]);
			}
			senteString=senteString+" "+wordStrings[i];
		}
		return senteString;
	}*/
	public static String future_tense(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";

		for (int i=0;i<wordStrings.length;i++) {
			if("will".equals((wordStrings[i]))&&!("be".equals((wordStrings[i+1])))) {
				wordStrings[i]=wordStrings[i]+" be";
			    System.out.println("ilk if"+wordStrings[i]);
				i++;
			}
			if("verb".equals(part_of_speech.tagWord(wordStrings[i]))&& !wordStrings[i].endsWith("ing") &&!("be".equals(wordStrings[i])&&!wordStrings[i].equals(continuous_verbs.tagWord(continuous_verbs.reversetagWord(wordStrings[i]))))) {
			    System.out.println("ikinci if"+wordStrings[i]);
				wordStrings[i]=continuous_verbs.tagWord(wordStrings[i]);
			}
		}
		for (int i=0;i<wordStrings.length;i++) {
			senteString=senteString+" "+wordStrings[i];
		}
		return senteString;
	}
}
