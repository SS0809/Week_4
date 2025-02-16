package java.org.regex.advanced;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1️⃣2️⃣ Extract Programming Language Names from a Text
//🔹 Example Text:
//        "I love Java, Python, and JavaScript, but I haven't tried Go yet."
//        🔹 Expected Output:
//Java, Python, JavaScript, Go
public class ExtractProgName {
    static ArrayList<String> progLang = new ArrayList<>();
    static ArrayList<String> matched = new ArrayList<>();
    static {
        progLang.add("Python");
        progLang.add("Go");
        progLang.add("Java");
        progLang.add("Javascript");
    }
    String extractLanguages(String text) {
        matched.clear(); // Clear previous matches

        for (String lang : progLang) {
            String regex = "\\b" + Pattern.quote(lang) + "\\b"; // word boundary
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                matched.add(lang);
            }
        }
        return String.join(", ", matched);
    }
    public static void main(String[] args) {
        ExtractProgName vc = new ExtractProgName();
        System.out.println(vc.extractLanguages("I love Java, Python, and JavaScript, but I haven't tried Go yet."));
    }
}
