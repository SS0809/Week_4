package org.regex.basic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorCode {
    boolean validate(String input){
        //Starts with a #
        //Followed by 6 hexadecimal characters (0-9, A-F, a-f).
        String regex = "^#[0-9A-Fa-f]{6}";
        return Pattern.matches(regex, input);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HexColorCode vu = new HexColorCode();
        vu.validate(scn.nextLine());
    }
}
