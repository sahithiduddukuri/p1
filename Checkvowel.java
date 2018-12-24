package com.stackroute;

public class Checkvowel {
    public String stringChecker(String s) {
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            if (s1 == 'a' || s1 == 'e' || s1 == 'i' || s1 == 'o' || s1 == 'u') {
                System.out.println("Vowel");
                return "vowel";
            } else {
                System.out.println("consonant");
                return "consonant";
            }
        }
        return "success";
    }
}
