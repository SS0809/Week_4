package java.org.regex.replacemodify;

import java.util.ArrayList;
import java.util.regex.Pattern;

//Censor Bad Words in a Sentence
//Given a list of bad words, replace them with ****.
//        🔹 Example Input:
//        "This is a damn bad example with some stupid words."
//        🔹 Expected Output:
//        "This is a **** bad example with some **** words."
public class CensorBadWords {
    static ArrayList<String> list = new ArrayList<>();
    static {
        list.add("damn");
        list.add("stupid");
    }
    String replace(String input){
        for (String bad : list) {
            String regex = "\\b" + Pattern.quote(bad) + "\\b";//boundary constraints
            input = input.replaceAll(regex, "****");
        }
        return input;
    }
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        CensorBadWords ms = new CensorBadWords();
        System.out.println(ms.replace(input));
    }
}
