package grammer;

public class Simple_tense {
	public static String work(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";
		for (String word : wordStrings) {
			for (String past :tenses_verbs.pastIndicators) {
				if (word.contains(past)) {
					senteString=past_tense(line);
					break;
				}	
			}
		}
		for (String word : wordStrings) {
			for (String future :tenses_verbs.futureIndicators) {
				if (word.contains(future)) {
					senteString=future_tense(line);
					break;
				}	
			}
		}
		for (String word : wordStrings) {
			for (String present :tenses_verbs.simpleIndicatorString) {
				if (word.contains(present)) {
					senteString=present_tense(line);
					break;
				}	
			}
		}
		return senteString;
	}
	
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
	}
	public static String future_tense(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";

		for (int i=0;i<wordStrings.length;i++) {
			senteString=senteString+" "+wordStrings[i];
			if("pronouns".equals(part_of_speech.tagWord(wordStrings[i]))) {
				senteString=senteString+" will";
			}
		}
		return senteString;
	}
}
