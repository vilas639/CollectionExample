package com.ashokit.realtimeexample;

import java.util.Scanner;

public class CardInput {


    public static void main(String[] args) {

        /*
        Today core java task:
 =====================

	1.  i/p : 0521 1500 7865 1476
	    o/p : XXXX XXXX XXX 51476

	2. i/p  : 0521 1500 7865 1476

	    o/p :  print cardnumber is a primary card or not

		Get the 12 and 13th digit from the given card number
		either of 12th and 13th digits are 0 then it is not a primary card
		else it is a primary card

		If both 12th and 13th are zero then send like cardnumber is invalid


         */
        //taking input from user
        //display the data in masking form

        System.out.println("Enter the 12 digit numer");
        Scanner sc = new Scanner(System.in);
                String InputString=sc.nextLine();
                System.out.println("you enter"+InputString);
                //dispalay in masking form
                //0 to 8 is masking

        System.out.println(mask(primary(InputString)));


    }

    public static String mask(String input) {
        int length = input.length() - input.length()/4;
        String s = input.substring(0, length);

        String res = s.replaceAll("[A-Za-z0-9]", "X") + input.substring(length);


        return res;
    }

    public static String primary(String input)
    {     char we=input.charAt(7);
        System.out.println(input.charAt(7));
        if(we=='0')
        {
            System.out.println("Primary");
        }else
        {
            System.out.println("Not Primary");
        }
        return input;
    }
}
