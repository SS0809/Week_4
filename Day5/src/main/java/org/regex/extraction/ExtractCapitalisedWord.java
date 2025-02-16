package java.org.regex.extraction;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5️⃣ Extract All Capitalized Words from a Sentence
//🔹 Example Text:
//        "The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
//        🔹 Expected Output:
//Eiffel, Tower, Paris, Statue, Liberty, New, York
public class ExtractCapitalisedWord {
    ArrayList<String> ans = new ArrayList<>();
    void validate(String input){
        //All Capitalized Words from a Sentence
        String regex = "[A-Z][a-z]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()){
            this.ans.add(m.group());
        }
    }
    public static void main(String[] args) {
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        ExtractCapitalisedWord vu = new ExtractCapitalisedWord();
        vu.validate(input);
        System.out.println(vu.ans);
    }
}
