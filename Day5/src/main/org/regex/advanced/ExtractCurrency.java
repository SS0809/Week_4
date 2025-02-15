package org.regex.advanced;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1️⃣3️⃣ Extract Currency Values from a Text
//🔹 Example Text:
//        "The price is $45.99, and the discount is 10.50."
//        🔹 Expected Output:
//$45.99, 10.50
public class ExtractCurrency {
    String extractCurrency(String text) {
            StringBuilder sb = new StringBuilder();
            String regex = "\\$?\\d+\\.\\d{2}"; // word boundary
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(matcher.group());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ExtractCurrency vc = new ExtractCurrency();
        System.out.println(vc.extractCurrency("The price is $45.99, and the discount is 10.50."));
    }
}
