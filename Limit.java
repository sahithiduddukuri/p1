package com.stackroute;

public class Limit {
    public String guessNumber(int n)
    {
        int tar=15;


        System.out.println("Guess the number between 1 to 25");

        while(tar>n)
        {
            System.out.println("Number guessed is less than original number     ");
            System.out.println("Guess the number");
            return "Number guessed is less than original number     ";

        }
        while(tar<n)
        {
            System.out.println("Number guessed is more than original number     ");
            System.out.println("Guess the number");
            return "Number guessed is more than original number     ";

        }
        if(tar==n)
        {
            System.out.println("Number guessed is equal to original number     ");
            return "Number guessed is equal to original number     ";
        }
        else
        {
            System.out.println("Invalid");
            return "Invalid";
        }



    }
}
