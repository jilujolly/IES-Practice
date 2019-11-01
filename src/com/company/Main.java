package com.company;

public class Main {

    public static void main(String[] args) {
                String s = "Amanda Chui";
         // a
                char charAt3=s.charAt(3);
                System.out.println("The character is:"+ charAt3);
         //b
                String subs= s.substring(8);
                System.out.println("The substring is:"+ subs);
         //c
                int len=s.length();
                System.out.println("The length is:"+ len);
                //d

                int index= s.indexOf("a");
        System.out.println("The index is:"+ index);

        //e
        char charAT0=s.charAt(0);
        System.out.println("The character is:"+ charAT0);

        //f
        String subs2=s.substring(1,4);
        System.out.println("The string is:"+ subs2);

        //g
        String subs1=s.substring(1);
        System.out.println("The string is:"+ subs1);

        //h
        int index4=s.indexOf("m",4);
        System.out.println("The index is:"+ index4);

        //i
        char charAT4=s.charAt(4);
        System.out.println("The character is:"+ charAT4);

        //j
        String Subs3=s.substring(4,5);
        System.out.println("The string is:"+ Subs3);

    }
}
