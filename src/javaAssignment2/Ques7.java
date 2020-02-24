package javaAssignment2;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sec = in.nextInt();
        int day,hour,min,remSec;
        day = sec / (24 * 3600);
        sec %= (24 * 3600);
        hour = sec / 3600;
        sec %= 3600;
        min = sec / 60;
        sec %= 60;
        remSec = sec;

        System.out.println("Day:"+day + "\n"+hour+":"+min+":"+remSec);


    }
}
