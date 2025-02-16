package java.org.regex.advanced;

import java.util.regex.Pattern;

//1️⃣1️⃣ Validate a Credit Card Number (Visa, MasterCard, etc.)
//A Visa card number starts with 4 and has 16 digits.
//A MasterCard starts with 5 and has 16 digits.
public class ValidateCreditCard {
    boolean validate(String temp){
        //A Visa card number starts with 4 and has 16 digits.
        //A MasterCard starts with 5 and has 16 digits.
        String regex = "^4[0-9]{15}$|^5[0-9]{15}$";
        return Pattern.matches(regex, temp);
    }
    public static void main(String[] args) {
        ValidateCreditCard vc = new ValidateCreditCard();
        System.out.println(vc.validate("4012888888881881"));
        System.out.println(vc.validate("5105105105105100"));
    }
}
