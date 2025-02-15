package org.regex.extraction;

import org.junit.jupiter.api.Test;
import org.regex.extraction.ExtractEmails;

import static org.junit.jupiter.api.Assertions.*;

class ExtractEmailsTest {
    @Test
    void test1(){
        String input = "info@company.org";
        ExtractEmails vu = new ExtractEmails();
        assertEquals(true,vu.validate(input));
    }
    @Test
    void test2(){
        String input = "support@example.com";
        ExtractEmails vu = new ExtractEmails();
        assertEquals(true,vu.validate(input));
    }
    @Test
    void test3(){
        String input = "support@example.cm";
        ExtractEmails vu = new ExtractEmails();
        assertEquals(false,vu.validate(input));
    }
}