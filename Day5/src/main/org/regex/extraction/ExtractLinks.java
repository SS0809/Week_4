package org.regex.extraction;
//7️⃣ Extract Links from a Web Page
//🔹 Example Text:
//        "Visit https://www.google.com and http://example.org for more info."
//        🔹 Expected Output:
//https://www.google.com, http://example.org

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    ArrayList<String> ans = new ArrayList<>();
    void validate(String input){
//https://www.google.com, http://example.org
        String regex = "https?://(www\\.)?[A-Za-z0-9-]+\\.[A-Za-z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()){
            this.ans.add(m.group());
        }
    }
    public static void main(String[] args) {
        String input = "Visit https://www.google.com and http://example.org for more info.";
        ExtractLinks vu = new ExtractLinks();
        vu.validate(input);
        System.out.println(vu.ans);
    }
}
