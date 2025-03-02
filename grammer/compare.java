package grammer;

public class compare {
	static public String comporasion(String line) {
        String[] wordStrings = line.split(" ");
		 String senteString="";

        for (int i = 0; i < wordStrings.length; i++) {
            if ("than".equals(wordStrings[i]) && i > 0) {
                // If the word before "than" needs to be in its comparative form
                wordStrings[i - 1] = compare_nouns.tagWord(wordStrings[i - 1]);

            } 
            else if ("more".equals(wordStrings[i]) && i + 1 < wordStrings.length) {
            	// If "more" is before the adjective, modify the next word (comparative)
                wordStrings[i + 1] = compare_nouns.tagWord(wordStrings[i + 1]);
            } 
            else if ("the".equals(wordStrings[i]) && "adjective".equals(wordStrings[i+1]) && i + 1 < wordStrings.length) {
                // Handling superlative case ("the biggest", etc.)
                wordStrings[i + 1] = compare_nouns.tagWord2(wordStrings[i + 1]);
            }
		}
        for (int i = 0; i < wordStrings.length; i++) {
			senteString=senteString+" "+wordStrings[i];
        }
		return senteString;
	}
}
/*
public class compare {
	static public String comporasion(String line) {
		String[] wordStrings= line.split(" ");
		 String senteString="";
		for (int i=0;i<wordStrings.length;i++) {
			if("than".equals(wordStrings[i])) {
				wordStrings[i-1]= compare_nouns.tagWord(wordStrings[i-1]);
			}
			else if("more".equals(wordStrings[i])) {
				wordStrings[i+1]= compare_nouns.tagWord(wordStrings[i+1]);
			}
			else{
				wordStrings[i-1]= compare_nouns.tagWord2(wordStrings[i-1]);
			}
			senteString=senteString+" "+wordStrings[i];
		}
		return senteString;
		
	}
}
*/
