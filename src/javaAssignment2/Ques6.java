package javaAssignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            float div = 100/n;
            System.out.println(div);
        } catch (InputMismatchException e) {
            System.out.println("Integer value not found");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("Airthmetic Exception"+ e.getMessage());
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Finally Block");
        }
    }

}
