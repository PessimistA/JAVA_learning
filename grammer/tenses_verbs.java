package grammer;

import java.util.HashMap;
import java.util.Map;

public class tenses_verbs {
    private static final Map<String, String> wordTags = new HashMap<>();
    private static final Map<String, String> wordtag2 = new HashMap<>();
    private static final Map<String, String> wordTags3 = new HashMap<>();
    static {
    	//simple present tense

        // Regular verbs (-s)
        wordTags.put("walk", "walks");
        wordTags.put("speak", "speaks");
        wordTags.put("sleep", "sleeps");
        wordTags.put("write", "writes");
        wordTags.put("help", "helps");
        wordTags.put("call", "calls");
        wordTags.put("love", "loves");

        // Verbs ending in -s, -sh, -ch, -x, -o (-es)
        wordTags.put("watch", "watches");
        wordTags.put("go", "goes");
        wordTags.put("do", "does");
        wordTags.put("fix", "fixes");
        wordTags.put("push", "pushes");
        wordTags.put("teach", "teaches");
        wordTags.put("pass", "passes");
        wordTags.put("mix", "mixes");

        // Verbs ending in consonant + y (-ies)
        wordTags.put("study", "studies");
        wordTags.put("try", "tries");
        wordTags.put("carry", "carries");
        wordTags.put("worry", "worries");
        wordTags.put("copy", "copies");

        // Verbs ending in vowel + y (-s)
        wordTags.put("play", "plays");
        wordTags.put("enjoy", "enjoys");
        wordTags.put("stay", "stays");
    }
    
    
    static {
    	//past simple
        // Regular verbs (-ed)
        wordtag2.put("walk", "walked");
        wordtag2.put("play", "played");
        wordtag2.put("work", "worked");
        wordtag2.put("call", "called");
        wordtag2.put("watch", "watched");
        wordtag2.put("accept", "accepted");
        wordtag2.put("arrive", "arrived");
        wordtag2.put("ask", "asked");
        wordtag2.put("believe", "believed");
        wordtag2.put("change", "changed");
        wordtag2.put("clean", "cleaned");
        wordtag2.put("close", "closed");
        wordtag2.put("dance", "danced");
        wordtag2.put("decide", "decided");
        wordtag2.put("describe", "described");
        wordtag2.put("discover", "discovered");
        wordtag2.put("enjoy", "enjoyed");
        wordtag2.put("explain", "explained");
        wordtag2.put("follow", "followed");
        wordtag2.put("happen", "happened");
        wordtag2.put("hope", "hoped");
        wordtag2.put("invite", "invited");
        wordtag2.put("learn", "learned");
        wordtag2.put("like", "liked");
        wordtag2.put("listen", "listened");
        wordtag2.put("need", "needed");
        wordtag2.put("open", "opened");
        wordtag2.put("paint", "painted");
        wordtag2.put("plan", "planned");
        wordtag2.put("play", "played");
        wordtag2.put("rain", "rained");
        wordtag2.put("start", "started");
        wordtag2.put("stay", "stayed");
        wordtag2.put("study", "studied");
        wordtag2.put("talk", "talked");
        wordtag2.put("travel", "traveled");
        wordtag2.put("use", "used");
        wordtag2.put("visit", "visited");
        wordtag2.put("wait", "waited");
        wordtag2.put("walk", "walked");
        wordtag2.put("want", "wanted");
        wordtag2.put("watch", "watched");
        wordtag2.put("work", "worked");
        // Irregular verbs
        wordtag2.put("go", "went");
        wordtag2.put("eat", "ate");
        wordtag2.put("see", "saw");
        wordtag2.put("take", "took");
        wordtag2.put("write", "wrote");
        wordtag2.put("run", "ran");
        wordtag2.put("give", "gave");
        wordtag2.put("come", "came");
        wordtag2.put("think", "thought");
        wordtag2.put("know", "knew");
        wordtag2.put("be", "was/were");
        wordtag2.put("begin", "began");
        wordtag2.put("break", "broke");
        wordtag2.put("bring", "brought");
        wordtag2.put("build", "built");
        wordtag2.put("buy", "bought");
        wordtag2.put("catch", "caught");
        wordtag2.put("choose", "chose");
        wordtag2.put("come", "came");
        wordtag2.put("cost", "cost");
        wordtag2.put("cut", "cut");
        wordtag2.put("do", "did");
        wordtag2.put("draw", "drew");
        wordtag2.put("drink", "drank");
        wordtag2.put("drive", "drove");
        wordtag2.put("eat", "ate");
        wordtag2.put("fall", "fell");
        wordtag2.put("feel", "felt");
        wordtag2.put("find", "found");
        wordtag2.put("forget", "forgot");
        wordtag2.put("get", "got");
        wordtag2.put("give", "gave");
        wordtag2.put("go", "went");
        wordtag2.put("grow", "grew");
        wordtag2.put("have", "had");
        wordtag2.put("hear", "heard");
        wordtag2.put("hold", "held");
        wordtag2.put("keep", "kept");
        wordtag2.put("know", "knew");
        wordtag2.put("leave", "left");
        wordtag2.put("lose", "lost");
        wordtag2.put("make", "made");
        wordtag2.put("meet", "met");
        wordtag2.put("pay", "paid");
        wordtag2.put("put", "put");
        wordtag2.put("read", "read");
        wordtag2.put("run", "ran");
        wordtag2.put("say", "said");
        wordtag2.put("see", "saw");
        wordtag2.put("sell", "sold");
        wordtag2.put("send", "sent");
        wordtag2.put("show", "showed");
        wordtag2.put("sing", "sang");
        wordtag2.put("sit", "sat");
        wordtag2.put("sleep", "slept");
        wordtag2.put("speak", "spoke");
        //wordtag2.put("spend", "spent");2
        wordtag2.put("take", "took");
        wordtag2.put("teach", "taught");
        wordtag2.put("tell", "told");
        wordtag2.put("think", "thought");
        wordtag2.put("understand", "understood");
        wordtag2.put("wear", "wore");
        wordtag2.put("win", "won");
        wordtag2.put("write", "wrote");
    }
    static String[] pastIndicators = {
    	    "yesterday", "the day before yesterday", "last night", "last week", 
    	    "last month", "last year", "last summer", "last winter", "last Monday", 
    	    "last Tuesday", "an hour ago", "a day ago", "a week ago", "a month ago", 
    	    "a year ago", "a long time ago", "in 1999", "in the 18th century", 
    	    "in the past", "before", "previously", "earlier", "once", "formerly", 
    	    "in ancient times", "back in the day", "back then", "at that time", 
    	    "at one time", "in those days", "when I was a child", "when I was younger", 
    	    "when we lived in", "the other day","last time"
    };
    static String[] simpleIndicatorString= {"always","sometimes","usually","often","never","every","every day","rarely"
    };
    static String[] futureIndicators = {
    	    "tomorrow", "next", "next week", "next month", "next year", "next summer", 
    	    "next winter", "next Monday", "next Tuesday", "in the future", "soon", 
    	    "later", "in the coming days", "in a week", "in a month", "in a year", 
    	    "in two years", "in the near future", "in the long run", "after", "soon after", 
    	    "when", "by the time", "as soon as", "in the coming weeks", "in a while", 
    	    "this time next year", "in the future", "on the weekend", "this evening", 
    	    "next weekend", "next holiday"
    	};
    
    public static String tagWord(String word) {
        return wordTags.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
    public static String tagWord2(String word) {
        return wordtag2.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
    public static String tagWord3(String word) {
        return wordTags3.getOrDefault(word.toLowerCase(), "UNKNOWN");
    }
}

