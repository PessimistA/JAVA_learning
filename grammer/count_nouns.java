package grammer;

import java.util.HashMap;
import java.util.Map;

public class count_nouns {
    private static final Map<String, String> wordTags = new HashMap<>();
    static {
    	//Singular count nouns refer to one person or thing:
        wordTags.put("book", "books"); 
        wordTags.put("kid", "kids"); 
        wordTags.put("teacher", "teachers"); 
        wordTags.put("wish", "wishes"); 
        wordTags.put("idea", "ideas"); 
        wordTags.put("apple", "apples");
        wordTags.put("car", "cars");
        wordTags.put("dog", "dogs");
        wordTags.put("cat", "cats");
        wordTags.put("pen", "pens");
        wordTags.put("table", "tables");
        wordTags.put("computer", "computers");
        wordTags.put("song", "songs");
        wordTags.put("city", "cities");
        wordTags.put("country", "countries");
        wordTags.put("person", "people");
        wordTags.put("child", "children");
        wordTags.put("bus", "buses");
        wordTags.put("fish", "fish");  // Same form for plural
        wordTags.put("box", "boxes");
        wordTags.put("brush", "brushes");
        wordTags.put("baby", "babies");
        wordTags.put("party", "parties");
        wordTags.put("potato", "potatoes");
        wordTags.put("tomato", "tomatoes");
        wordTags.put("hero", "heroes");
        wordTags.put("zero", "zeros");
        wordTags.put("wolf", "wolves");
        wordTags.put("calf", "calves");
        wordTags.put("life", "lives");
        wordTags.put("wife", "wives");
        wordTags.put("loaf", "loaves");
        wordTags.put("craft", "crafts");
        wordTags.put("student", "students");
        wordTags.put("friend", "friends");
        wordTags.put("teacher", "teachers");
        wordTags.put("box", "boxes");
        wordTags.put("class", "classes");
        wordTags.put("bus", "buses");
        wordTags.put("stadium", "stadiums");
        wordTags.put("glass", "glasses");
        wordTags.put("watch", "watches");
        wordTags.put("roof", "roofs");
        wordTags.put("match", "matches");
        wordTags.put("witch", "witches");
        wordTags.put("fox", "foxes");
        wordTags.put("church", "churches");
        wordTags.put("box", "boxes");
        wordTags.put("witch", "witches");
        wordTags.put("calf", "calves");
        wordTags.put("chief", "chiefs");
        wordTags.put("mango", "mangos");
        wordTags.put("bush", "bushes");
        wordTags.put("class", "classes");
        wordTags.put("teacher", "teachers");
        wordTags.put("bench", "benches");
        wordTags.put("cactus", "cacti");
        wordTags.put("axis", "axes");
        wordTags.put("crisis", "crises");
        wordTags.put("focus", "foci");
        wordTags.put("fungus", "fungi");
        wordTags.put("thesis", "theses");
        wordTags.put("octopus", "octopuses");
        wordTags.put("emphasis", "emphases");
        wordTags.put("focus", "focuses");
        wordTags.put("octopus", "octopuses");
        wordTags.put("crisis", "crises");
        wordTags.put("matrix", "matrices");
        wordTags.put("datum", "data");
        wordTags.put("museum", "museums");
        wordTags.put("formula", "formulas");
        //
        wordTags.put("leaf", "leaves");
        wordTags.put("knife", "knives");
        wordTags.put("leaf", "leaves");
        wordTags.put("thief", "thieves");
        wordTags.put("knife", "knives");
        wordTags.put("shelf", "shelves");
                
        //irreguler nouns
        wordTags.put("person", "people");
        wordTags.put("child", "children");
        wordTags.put("man", "men");
        wordTags.put("woman", "women");
        wordTags.put("foot", "feet");
        wordTags.put("tooth", "teeth");
        //
        wordTags.put("bacterium", "bacteria");
        wordTags.put("medium", "media");
        wordTags.put("alumnus", "alumni");
        wordTags.put("curriculum", "curricula");
        wordTags.put("radius", "radii");
        wordTags.put("analysis", "analyses");
        wordTags.put("criterion", "criteria");
        wordTags.put("index", "indices");
        wordTags.put("appendix", "appendices");
    }
    static {
    	//no plurals
    	wordTags.put("advice", "uncountable noun");
    	wordTags.put("accommodation", "uncountable noun");
    	wordTags.put("baggage", "uncountable noun");
    	wordTags.put("equipment", "uncountable noun");
    	wordTags.put("furniture", "uncountable noun");
    	wordTags.put("homework", "uncountable noun");
    	wordTags.put("knowledge", "uncountable noun");
    	wordTags.put("luggage", "uncountable noun");
    	wordTags.put("machinery", "uncountable noun");
    	wordTags.put("money", "uncountable noun");
    	wordTags.put("news", "uncountable noun");
    	wordTags.put("traffic", "uncountable noun");
    	wordTags.put("bread", "uncountable noun");
    	wordTags.put("courage", "uncountable noun");
    	wordTags.put("dust", "uncountable noun");
    	wordTags.put("education", "uncountable noun");
    	wordTags.put("food", "uncountable noun");
    	wordTags.put("happiness", "uncountable noun");
    	wordTags.put("imagination", "uncountable noun");
    	wordTags.put("jewelry", "uncountable noun");
    	wordTags.put("laughter", "uncountable noun");
    	wordTags.put("literature", "uncountable noun");
    	wordTags.put("meat", "uncountable noun");
    	wordTags.put("music", "uncountable noun");
    	wordTags.put("news", "uncountable noun");
    	wordTags.put("patience", "uncountable noun");
    	wordTags.put("pollution", "uncountable noun");
    	wordTags.put("progress", "uncountable noun");
    	wordTags.put("rain", "uncountable noun");
    	wordTags.put("salt", "uncountable noun");
    	wordTags.put("science", "uncountable noun");
    	wordTags.put("snow", "uncountable noun");
    	wordTags.put("software", "uncountable noun");
    	wordTags.put("strength", "uncountable noun");
    	wordTags.put("sugar", "uncountable noun");
    	wordTags.put("tea", "uncountable noun");
    	wordTags.put("traffic", "uncountable noun");
    	wordTags.put("violence", "uncountable noun");
    	wordTags.put("water", "uncountable noun");
    	wordTags.put("weather", "uncountable noun");
    	wordTags.put("work", "uncountable noun");
    	wordTags.put("admission", "uncountable noun");
    	wordTags.put("anger", "uncountable noun");
    	wordTags.put("behavior", "uncountable noun");
    	wordTags.put("carpet", "uncountable noun");
    	wordTags.put("cattle", "uncountable noun");
    	wordTags.put("charity", "uncountable noun");
    	wordTags.put("clothing", "uncountable noun");
    	wordTags.put("commerce", "uncountable noun");
    	wordTags.put("currency", "uncountable noun");
    	wordTags.put("data", "uncountable noun");
    	wordTags.put("dirt", "uncountable noun");
    	wordTags.put("dust", "uncountable noun");
    	wordTags.put("empathy", "uncountable noun");
    	wordTags.put("fame", "uncountable noun");
    	wordTags.put("furniture", "uncountable noun");
    	wordTags.put("guilt", "uncountable noun");
    	wordTags.put("harmony", "uncountable noun");
    	wordTags.put("homework", "uncountable noun");
    	wordTags.put("improvement", "uncountable noun");
    	wordTags.put("innovation", "uncountable noun");
    	wordTags.put("integrity", "uncountable noun");
    	wordTags.put("intelligence", "uncountable noun");
    	wordTags.put("jelly", "uncountable noun");
    	wordTags.put("literacy", "uncountable noun");
    	wordTags.put("luggage", "uncountable noun");
    	wordTags.put("mathematics", "uncountable noun");
    	wordTags.put("meat", "uncountable noun");
    	wordTags.put("money", "uncountable noun");
    	wordTags.put("news", "uncountable noun");
    	wordTags.put("oil", "uncountable noun");
    	wordTags.put("patience", "uncountable noun");
    	wordTags.put("pollution", "uncountable noun");
    	wordTags.put("power", "uncountable noun");
    	wordTags.put("progress", "uncountable noun");
    	wordTags.put("reliability", "uncountable noun");
    	wordTags.put("salt", "uncountable noun");
    	wordTags.put("shopping", "uncountable noun");
    	wordTags.put("snow", "uncountable noun");
    	wordTags.put("sorrow", "uncountable noun");
    	wordTags.put("strength", "uncountable noun");
    	wordTags.put("sugar", "uncountable noun");
    	wordTags.put("surgery", "uncountable noun");
    	
    }
	
    public static String tagWord(String word) {
        return wordTags.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
}
