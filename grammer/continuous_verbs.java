package grammer;

import java.util.HashMap;
import java.util.Map;

public class continuous_verbs {
    private static final Map<String, String> wordtag = new HashMap<>();
    private static final Map<String, String> reversedwordtag = new HashMap<>();
    
    private static final Map<String, String> wordtag2 = new HashMap<>();
    private static final Map<String, String> reversedwordtag2 = new HashMap<>();
    static {
    	for (String key : wordtag.keySet()) {
    		reversedwordtag.put(wordtag.get(key), key);
		}
    	for (String key : wordtag2.keySet()) {
    		reversedwordtag2.put(wordtag2.get(key), key);
		}
    }
    static {
        wordtag.put("work", "working");
        wordtag.put("play", "playing");
        wordtag.put("talk", "talking");
        wordtag.put("listen", "listening");
        wordtag.put("call", "calling");
        wordtag.put("write", "writing");
        wordtag.put("make", "making");
        wordtag.put("come", "coming");
        wordtag.put("have", "having");
        wordtag.put("take", "taking");
        wordtag.put("run", "running");
        wordtag.put("swim", "swimming");
        wordtag.put("sit", "sitting");
        wordtag.put("get", "getting");
        wordtag.put("begin", "beginning");
        wordtag.put("forget", "forgetting");
        wordtag.put("admit", "admitting");
        wordtag.put("prefer", "preferring");
        wordtag.put("permit", "permitting");
        wordtag.put("travel", "travelling");
        wordtag.put("control", "controlling");
        wordtag.put("refer", "referring");
        wordtag.put("occur", "occurring");
        wordtag.put("transfer", "transferring");
        wordtag.put("equip", "equipping");
        wordtag.put("cancel", "cancelling");
        wordtag.put("compel", "compelling");
        wordtag.put("format", "formatting");
        wordtag.put("regret", "regretting");
        wordtag.put("fly", "flying");
    }
    
    static {
        wordtag2.put("work", "worked");
        wordtag2.put("play", "played");
        wordtag2.put("talk", "talked");
        wordtag2.put("listen", "listened");
        wordtag2.put("call", "called");
        wordtag2.put("wait", "waited");
        wordtag2.put("want", "wanted");
        wordtag2.put("clean", "cleaned");
        wordtag2.put("need", "needed");
        wordtag2.put("help", "helped");
        wordtag2.put("smile", "smiled");
        wordtag2.put("move", "moved");
        wordtag2.put("use", "used");
        wordtag2.put("change", "changed");
        wordtag2.put("open", "opened");

        // Düzensiz fiiller (Irregular Verbs)
        wordtag2.put("go", "went");
        wordtag2.put("come", "came");
        wordtag2.put("eat", "ate");
        wordtag2.put("run", "ran");
        wordtag2.put("write", "wrote");
        wordtag2.put("take", "took");
        wordtag2.put("see", "saw");
        wordtag2.put("give", "gave");
        wordtag2.put("get", "got");
        wordtag2.put("find", "found");
        wordtag2.put("think", "thought");
        wordtag2.put("buy", "bought");
        wordtag2.put("bring", "brought");
        wordtag2.put("speak", "spoke");
        wordtag2.put("drive", "drove");
        wordtag2.put("forget", "forgot");
        wordtag2.put("break", "broke");
        wordtag2.put("choose", "chose");
        wordtag2.put("begin", "began");
        wordtag2.put("know", "knew");
        wordtag2.put("sing", "sang");
        wordtag2.put("drink", "drank");
        wordtag2.put("swim", "swam");
        wordtag2.put("freeze", "froze");
        wordtag2.put("steal", "stole");
        wordtag2.put("fall", "fell");
        wordtag2.put("show", "showed");
    }
    
    static String[] past_cont={
    		"at that time","when","all day","all week","all month","all year","earlier"
    };
    
    static String[] perfect_cont={
    		"for","since","lately","recently","all month","for the past","in the past","how long","all day","all week","all month","all year"
    };
    
    static String[] present_cont={
            "now", 
            "currently", 
            "at the moment", 
            "right now", 
            "still", 
            "at present", 
            "these days", 
            "this week", 
            "this month", 
            "temporarily"
    };
    static String[] future_cont={
    		"tomarrow","next","at this time","by","in this time","soon","later"
    };
    public static String reversetagWord(String word) {
        return reversedwordtag.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }    
    public static String reversetagWord2(String word) {
        return reversedwordtag2.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }    
    public static String tagWord(String word) {
        return wordtag.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
    public static String tagWord2(String word) {
        return wordtag2.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
}
