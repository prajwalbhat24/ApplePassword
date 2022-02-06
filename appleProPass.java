package com.company;

import java.util.Scanner;

public class appleProPass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myPassword = "";
        int pNum;
        appleProPass obj = new appleProPass();

        int min = 0;
        int max = 2;

        System.out.println("Enter the NUMBER of PASSWORDS: ");

        pNum = sc.nextInt();

        for (int x = 1; x < pNum+1; x++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <= 5; j++) {
                    int b = (int) (Math.random() * (max - min + 1) + min);
                    switch (b) {
                        case 0:
                            myPassword += obj.genCAlpa();
                            break;
                        case 1:
                            myPassword += obj.genSAlpa();
                            break;
                        case 2:
                            myPassword += obj.genNums();
                            break;


                    }
                }
                myPassword += "-";
            }




        StringBuffer newPwd = new StringBuffer(myPassword);

        newPwd.deleteCharAt(newPwd.length() - 1);

        System.out.println(x+": "+newPwd);
        myPassword="";
    }
    }


    public String genCAlpa()
    {
        int min = 65;
        int max = 90;
        int b = (int)(Math.random()*(max-min+1)+min);
        char c=(char)b ;
        String abc=String.valueOf(c);
        return abc;
    }

    public String genSAlpa()
    {
        int min = 97;
        int max = 122;
        int b = (int)(Math.random()*(max-min+1)+min);
        char c=(char)b ;
        String abc=String.valueOf(c);
        return abc;
    }
    public String genNums()
    {
        int min = 48;
        int max = 57;
        int b = (int)(Math.random()*(max-min+1)+min);
        char c=(char)b ;
        String abc=String.valueOf(c);
        return abc;
    }

}
