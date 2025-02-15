package org.regex.basic;
//1️⃣ Validate a Username
//A valid username:
//Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
//Must start with a letter
//Must be between 5 to 15 characters long
//🔹 Example Inputs & Outputs
//✅ "user_123" → Valid
//❌ "123user" → Invalid (starts with a number)
//❌ "us" → Invalid (too short)

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    boolean validate(String input){
        //Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
        //Must start with a letter
        //Must be between 5 to 15 characters long
        String regex = "^[a-zA-Z][a-zA-Z0-9_.+-]{4,14}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return pattern.matches(regex,input);
    }
    public static void main(String[] args) {
        String input ;
        Scanner scn = new Scanner(System.in);
        ValidateUsername vu = new ValidateUsername();
        vu.validate(scn.nextLine());
    }
}
