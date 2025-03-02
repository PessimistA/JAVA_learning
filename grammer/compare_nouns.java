package grammer;

import java.util.HashMap;
import java.util.Map;

public class compare_nouns {
    private static final Map<String, String> wordTags = new HashMap<>();
    private static final Map<String, String> wordTags2 = new HashMap<>();
    static {
    	//comparison
    	wordTags.put("small", "smaller");
    	wordTags.put("big", "bigger");
    	wordTags.put("fast", "faster");
    	wordTags.put("slow", "slower");
    	wordTags.put("strong", "stronger");
    	wordTags.put("weak", "weaker");
    	wordTags.put("happy", "happier");
    	wordTags.put("easy", "easier");
    	wordTags.put("hard", "harder");
    	wordTags.put("large", "larger");
    	wordTags.put("cold", "colder");
    	wordTags.put("hot", "hotter");
    	wordTags.put("short", "shorter");
    	wordTags.put("tall", "taller");
    	wordTags.put("young", "younger");
    	wordTags.put("old", "older");
    	wordTags.put("rich", "richer");
    	wordTags.put("poor", "poorer");
    	wordTags.put("bright", "brighter");
    	wordTags.put("dark", "darker");
    	wordTags.put("soft", "softer");
    	wordTags.put("strong", "stronger");
    	wordTags.put("weak", "weaker");
    	wordTags.put("warm", "warmer");
    	wordTags.put("cool", "cooler");
    	wordTags.put("kind", "kinder");
    	wordTags.put("wide", "wider");
    	wordTags.put("fine", "finer");
    	wordTags.put("deep", "deeper");
    	wordTags.put("high", "higher");
    	wordTags.put("low", "lower");
    	wordTags.put("safe", "safer");
    	wordTags.put("brave", "braver");
    	wordTags.put("slow", "slower");
    	wordTags.put("fast", "faster");
    	wordTags.put("easy", "easier");
    	wordTags.put("happy", "happier");
    	wordTags.put("angry", "angrier");
    	wordTags.put("busy", "busier");
    	wordTags.put("crazy", "crazier");
    	wordTags.put("funny", "funnier");
    	wordTags.put("friendly", "friendlier");
    	wordTags.put("gentle", "gentler");
    	wordTags.put("simple", "simpler");
    	wordTags.put("clever", "cleverer");
    	wordTags.put("hard", "harder");
    	wordTags.put("large", "larger");
    	wordTags.put("cold", "colder");
    	wordTags.put("hot", "hotter");

        wordTags.put("good", "better");
        wordTags.put("bad", "worse");
        wordTags.put("far", "farther");
        wordTags.put("little", "less");
        wordTags.put("much", "more");
        wordTags.put("many", "more");

    }
    static {
    	wordTags2.put("hot", "hottest");
    	 wordTags2.put("cold", "coldest");
    	    wordTags2.put("small", "smallest");
    	    wordTags2.put("big", "biggest");
    	    wordTags2.put("fast", "fastest");
    	    wordTags2.put("slow", "slowest");
    	    wordTags2.put("strong", "strongest");
    	    wordTags2.put("weak", "weakest");
    	    wordTags2.put("happy", "happiest");
    	    wordTags2.put("easy", "easiest");
    	    wordTags2.put("hard", "hardest");
    	    wordTags2.put("large", "largest");
    	    wordTags2.put("short", "shortest");
    	    wordTags2.put("tall", "tallest");
    	    wordTags2.put("young", "youngest");
    	    wordTags2.put("old", "oldest");
    	    wordTags2.put("rich", "richest");
    	    wordTags2.put("poor", "poorest");
    	    wordTags2.put("bright", "brightest");
    	    wordTags2.put("dark", "darkest");
    	    wordTags2.put("soft", "softest");
    	    wordTags2.put("warm", "warmest");
    	    wordTags2.put("cool", "coolest");
    	    wordTags2.put("kind", "kindest");
    	    wordTags2.put("wide", "widest");
    	    wordTags2.put("fine", "finest");
    	    wordTags2.put("deep", "deepest");
    	    wordTags2.put("high", "highest");
    	    wordTags2.put("low", "lowest");
    	    wordTags2.put("safe", "safest");
    	    wordTags2.put("brave", "bravest");
    	    wordTags2.put("angry", "angriest");
    	    wordTags2.put("busy", "busiest");
    	    wordTags2.put("crazy", "craziest");
    	    wordTags2.put("funny", "funniest");
    	    wordTags2.put("friendly", "friendliest");
    	    wordTags2.put("gentle", "gentlest");
    	    wordTags2.put("simple", "simplest");
    	    wordTags2.put("clever", "cleverest");
            
    	    wordTags2.put("good", "best");
            wordTags2.put("bad", "worse");

;
            wordTags2.put("much", "more");
            wordTags2.put("many", "more");
    }
	
    public static String tagWord(String word) {
        return wordTags.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
    public static String tagWord2(String word) {
        return wordTags2.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
}

