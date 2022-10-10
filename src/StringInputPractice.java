import java.util.Scanner;

public class StringInputPractice {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter a string of at least two letters");
        String s=scan.nextLine();
        System.out.println("String s is "+s);
        System.out.println("The length of string s is "+s.length());
        String firstHalf=s.substring(0,s.length()/2);
        String secondHalf=s.substring(s.length()/2);
        System.out.println(secondHalf+"."+firstHalf);
    }
}