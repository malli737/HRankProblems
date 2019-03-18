package com.malli;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DuplicateWords {

	public static void main(String[] args) {

//(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+ 
//\\b(\\w+)(?:\\W+\\1\\b)+/
        String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            java.util.regex.Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    
	}

}