package java.org.regex.basic;

import java.util.Scanner;
import java.util.regex.Pattern;

//2️⃣ Validate a License Plate Number
//License plate format: Starts with two uppercase letters, followed by four digits.
//Example: "AB1234" is valid, but "A12345" is invalid.
public class LicensePlateNumber {
    boolean validate(String input){
        //License plate format: Starts with two uppercase letters,
        // followed by four digits.
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return Pattern.matches(regex, input);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ValidateUsername vu = new ValidateUsername();
        vu.validate(scn.nextLine());
    }
}
