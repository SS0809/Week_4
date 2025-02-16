package java.org.regex.extraction;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4️⃣ Extract All Email Addresses from a Text
//🔹 Example Text:
//        "Contact us at support@example.com and info@company.org"
//        🔹 Expected Output:
//support@example.com
//info@company.org
public class ExtractEmails {
    ArrayList<String> ans = new ArrayList<>();
    void validate(String input){
        //support@example.com
        //info@company.org
        String regex = "[0-9A-Za-z]+@[a-zA-Z]+.[a-z]{3}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()){
            this.ans.add(m.group());
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ExtractEmails vu = new ExtractEmails();
        vu.validate(scn.nextLine());
    }
}
