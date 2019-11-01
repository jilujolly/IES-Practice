public class EX2 {
    public static void main(String[]args){
        String name="Avi Laurie";

        //(a)
        int LIndex=name.toLowerCase().indexOf("a");
        System.out.println("The index is:"+ LIndex);

        //(b)
        char CharAt5=name.toUpperCase().charAt(5);
        System.out.println("The character is:"+ CharAt5);

        //(c)
        int SI=name.substring(3).indexOf("i");
        System.out.println("The index is:"+ SI);

        //(d)
        String SSU=name.substring(2).toUpperCase();
        System.out.println("The string is:"+ SSU);

        //(e)
        int IU=name.toUpperCase().indexOf("A",1);
        System.out.println("The index is:"+ IU);

        //(f)
        int Len=name.substring(name.indexOf(" ")+1).length();
        System.out.println("The length is:"+ Len);

    }
}
