package com.stackroute;

public class Tomjerry {
    public String tomJerry(int number)
    {



        if (number % 2 == 0 && number>20 && number<30)
        {
            return "Tom";
        } else if(number>20 && number<30)
        {
            return "Jerry";
        }
        else
        {
            return "NOTHING";
        }


    }
}
