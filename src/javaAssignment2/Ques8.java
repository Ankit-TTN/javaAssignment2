package javaAssignment2;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";
        while(!str.equals("done")){
            str = in.nextLine();
            if(str.charAt(0)==str.charAt(str.length()-1)){
                System.out.println("Char first is equal to Char last");
            }
        }

        System.out.println("While Loop Ends");

        str = "";
        do {
            str = in.nextLine();
            if(str.charAt(0)==str.charAt(str.length()-1)){
                System.out.println("Char first is equal to Char last");
            }
        } while(!str.equals("done"));
    }
}
