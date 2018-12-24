package com.stackroute;

public class Capital {
    public String character(char a)
    {

        System.out.println("enter the Character");

        if (a>=65 && a<=90) {
            System.out.println("Character is a capital letter");
            return "Character is a capital letter";
        }
        else if(a >= 97 && a <= 122) {
            System.out.println("Character is a small letter");
            return "Character is a small letter";
        }
        else if (a>=48 && a<=57) {
            System.out.println("Character is a digit");
            return "Character is a digit";
        }
        else if ((a>0 && a<=47)||(a>=58 && a<=64)||
                (a>=91 && a<=96)||(a>=123 && a<=127)) {
            System.out.println("Character is a special symbol");
            return "Character is a special symbol";
        }
        else
            System.out.println("Invalid");
        return "Invalid";



    }
}
