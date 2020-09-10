package madeira.cs;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * Lab 1
         * Author: Mary Wu
         * Date: 9/8/2020
         **/
        String myString1 = "Hello World";
        System.out.println(myString1);
        myString1 = "Hello World 1";
        System.out.println(myString1);
        System.out.println("string length is: "+myString1.length());

        String myString2 = "I'm Mary Wu";
        System.out.println(myString2);
        myString2 = "I'm Mary Wu 1";
        System.out.println(myString2);
        String replaceString=myString2.replace('u','o');
        System.out.println(replaceString);

        String myString3 = "Buh Bye World";
        System.out.println(myString3);
        myString3 = "Buh Bye World 1";
        System.out.println(myString3);
        String myString3upper=myString3.toUpperCase();
        System.out.println(myString3upper);

        /**
         * Lab 2
         * Author: Mary Wu
         * Date: 9/9/2020
         **/
        Scanner myScanner = new Scanner(System.in);
        String myScannedInput = myScanner.nextLine();
        System.out.println(myScannedInput);
        System.out.println("Greetings"+myScannedInput);


        /**Write a program that does the following
        I. Read your name
        a. Print a greeting
        II. Read your favorite artist or author
        a. Print your favorite song or book by that artist
        III. Read your age
        a. Print the number of days you've been alive (an estimate is fine)**/
    }
}
