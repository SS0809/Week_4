package java.org.regex.advanced;

import java.util.regex.Pattern;

//Validate an IP Address
//A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
public class ValidateIP {
    boolean validate(String temp){
        //        127.0.0.1
        //A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."+
                "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."+
                "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."+
                "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return Pattern.matches(regex, temp);
    }
    public static void main(String[] args) {
        ValidateIP ip = new ValidateIP();
        System.out.println(ip.validate("127.0.0.1"));
    }
}
