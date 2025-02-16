package java.org.regex.advanced;
//1️⃣5️⃣ Validate a Social Security Number (SSN)
//🔹 Example Input:
//        "My SSN is 123-45-6789."
//        🔹 Expected Output:
//        ✅ "123-45-6789" is valid
//❌ "123456789" is invalid

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidSSN {
    boolean validate(String temp){
        //        "My SSN is 123-45-6789."
//        🔹 Expected Output:
//        ✅ "123-45-6789" is valid
//❌ "123456789" is invalid
        String regex = "\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(temp);

        return matcher.find();
    }
    public static void main(String[] args) {
        ValidSSN ip = new ValidSSN();
        System.out.println(ip.validate("My SSN is 123-45-6789."));
    }
}
