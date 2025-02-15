package org.regex.advanced;
//1️⃣4️⃣ Find Repeating Words in a Sentence
//🔹 Example Input:
//        "This is is a repeated repeated word test."
//        🔹 Expected Output:
//is, repeated

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.*;
import java.util.HashSet;

public class FindRepeatingWord {


    public static HashSet<String> extractRepeatingWords(String text) {
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }
        return repeatedWords;
    }

    // Test case
    public static void main(String[] args) {
        String testSentence = "This is is a repeated repeated word test.";
        HashSet<String> result = extractRepeatingWords(testSentence);
        System.out.println(result);
    }
}

