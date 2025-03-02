package grammer;

import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class rules {
    public static void main(String[] args) {
        Scanner scnScanner = new Scanner(System.in);
        System.out.println("please enter a sentence: ");
        String sentence = scnScanner.nextLine();
        
       sentence=check.check_all(sentence);
       System.out.println(sentence);
       
    }
}