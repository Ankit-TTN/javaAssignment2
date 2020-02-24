package javaAssignment2;

import java.util.Scanner;

class MyCustomEvenException extends Exception{
    MyCustomEvenException(String message,boolean flag){
        super(message,null,flag,!flag);
    }
}

public class Ques13 {
    public static void main(String[] args) {
        System.out.println("Enter Even Value");
        try {
            Scanner in = new Scanner(System.in);
            int evenValue = in.nextInt();
            if(evenValue%2!=0){
                throw new MyCustomEvenException("Integer is not even",true);
            } else{
                System.out.println("Even Integer");
            }

        } catch (MyCustomEvenException e){
            e.printStackTrace();
        }
    }
}
