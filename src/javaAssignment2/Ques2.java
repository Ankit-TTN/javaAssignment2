package javaAssignment2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Ques2 obj = new Ques2();
        String sortedString = obj.sort(str.toCharArray());
        System.out.println(sortedString);
    }

    String sort(char[] str) {
        for (int i = 1; i < str.length; i++) {
            char key = str[i];
            int j = i - 1;
            while (j >= 0 && Character.toLowerCase(str[j]) > Character.toLowerCase(key)) {
                str[j + 1] = str[j];
                j = j - 1;
            }
            str[j + 1] = key;
        }
        return String.valueOf(str);
    }
}
