package grammer;

public class plural_making {
	static public void review(String line) {
		String[] wordStrings= line.split(" ");
		for (String word : wordStrings) {
			
	
		}
	}
	static public String quantifiers(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";
		String singularString= "S_Q";
		String pluralString= "P_Q";
		for (int i=0;i<wordStrings.length;i++) {
			if(pluralString.equals(part_of_speech.tagWord(wordStrings[i]))) {
				for (int j=i;j<wordStrings.length;j++) {
					if ("noun".equals(part_of_speech.tagWord(wordStrings[j]))) {
						wordStrings[j]= count_nouns.tagWord(wordStrings[j]);
					}
				}
			}
			senteString=senteString+" "+wordStrings[i];
		}
		return senteString;
		
	}
}
