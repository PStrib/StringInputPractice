import java.util.Scanner;

public class StringInputPractice {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter two integers seperated by one or more spaces");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("The larger integer is "+Math.max(a,b));
    }
}