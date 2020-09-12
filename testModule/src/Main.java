package madeira.cs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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
         * Date: 9/10/2020
         **/
        //type in "Mary" please
        Scanner myScanner1 = new Scanner(System.in);
        String myScannedInput1 = myScanner1.nextLine();
        System.out.println("Greetings "+myScannedInput1);

        //type in "Maroon 5" please
        Scanner myScanner2 = new Scanner(System.in);
        String myScannedInput2 = myScanner2.nextLine();
        System.out.println("My favorite song is Memories and it's singer is "+myScannedInput2);

        //type in "15" please
        Scanner myScanner3 = new Scanner(System.in);
        String myScannedInput3 = myScanner3.nextLine();
        System.out.println("I'm "+myScannedInput3+" and I lived for 5525 days.");


        /**
         * Week 2 Challenges
         * Author: Mary Wu
         * Date: 9/10/2020
         **/
        //Problem I
        String myStringfirstname = "Hanrong";
        String myStringenglishname = "Mary";
        String myStringlastname = "Wu";
        System.out.println(myStringfirstname+" "+myStringenglishname+" "+myStringlastname);

        //Problem II
        String myStringhello = "Hello ";
        String myStringworld = "World";
        System.out.format(myStringhello);
        System.out.format(myStringworld);

        //Problem III
        //type in which year you were born please
        Scanner myScannerage = new Scanner(System.in);
        int myScannedInputage = myScannerage.nextInt();
        int counter = 2020;
        counter = counter - myScannedInputage;
        System.out.println("You are "+counter+" years old.");

        //Problem IV
        //FYI My name is Mary Wu
        String Name1;
        Scanner readfirstName = new Scanner(System.in);
        Name1 = readfirstName.nextLine();
        if(Name1.equals("Mary")){
            System.out.println(Name1+" is my first name.");
        }else{
            System.out.println(Name1+" is my last name.");
        }
        String Name2;
        Scanner readlastName = new Scanner(System.in);
        Name2 = readlastName.nextLine();
        if(Name2.equals("Wu")){
            System.out.println(Name2+" is my last name.");
        }else{
            System.out.println(Name2+" is my first name.");
        }

        //Problem V
        int i = 5;
        int x = 1;
        int j = 2;
        boolean b = false;
        b = j % x == i;
        System.out.print(b);

        // ==================
        // EXTRA CREDIT BELOW
        // ==================
        //Problem VI
        //type in which year you were born please
        Scanner myScannerage5 = new Scanner(System.in);
        int myScannedInputage2 = myScannerage5.nextInt();
        int counter2 = 2020;
        counter2 = counter2 - myScannedInputage2 + 5;
        System.out.println("You are "+counter2+" years old in 5 years.");

        //Problem VII
        System.out.println("Type in your first number please.");
        double number = 2;
        Scanner myScannernumber1 = new Scanner(System.in);
        double scannedNumber1 = myScannernumber1.nextInt();
        double result1 = scannedNumber1 / number;
        System.out.println("Type in your second number please.");
        Scanner myScannernumber2 = new Scanner(System.in);
        double scannedNumber2 = myScannernumber2.nextInt();
        double result2 = scannedNumber2 / number;
        System.out.println("Type in your third number please.");
        Scanner myScannernumber3 = new Scanner(System.in);
        double scannedNumber3 = myScannernumber3.nextInt();
        double result3 = scannedNumber3 / number;
        double counter1 = 2;
        counter1 = result1 + result2 + result3 ;
        System.out.println(counter1);

        //Problem VIII
        System.out.println("Guess my name, you have 3 chances.");
        String Name3;
        Scanner readName3 = new Scanner(System.in);
        Name3 = readName3.nextLine();
        if(Name3.equals("Mary")){
            System.out.println("You got it!");
        }else{
            System.out.println(Name3+" is not my name, please try again.");
        }
        String Name4;
        Scanner readName4 = new Scanner(System.in);
        Name4 = readName4.nextLine();
        if(Name4.equals("Mary")){
            System.out.println("You got it!");
        }else{
            System.out.println(Name4+" is not my name, please try again.");
        }
        String Name5;
        Scanner readName5 = new Scanner(System.in);
        Name5 = readName5.nextLine();
        if(Name5.equals("Mary")){
            System.out.println("You got it!");
        }else{
            System.out.println(Name5+" is not my name, please try again.");
        }

        //Problem IX
        File readmeFile = new File("resources/readme.txt");
        Scanner scannerFile = new Scanner(readmeFile);
        String myscannerFile2 = scannerFile.nextLine();
        System.out.println(myscannerFile2);

        //Problem X
        Scanner myScanner = new Scanner(System.in);
        String wholeNumber = myScanner.nextLine();
        int firstNumber = Character.getNumericValue(wholeNumber.charAt(0));
        int counterfirstnumber = 1;
        counterfirstnumber = firstNumber + counterfirstnumber;

        int secondNumber = Character.getNumericValue(wholeNumber.charAt(1));
        int countersecondnumber = 1;
        countersecondnumber = secondNumber + countersecondnumber;

        int thirdNumber = Character.getNumericValue(wholeNumber.charAt(2));
        int counterthirdnumber = 1;
        counterthirdnumber = thirdNumber + counterthirdnumber;

        int fourthNumber = Character.getNumericValue(wholeNumber.charAt(3));
        int counterfourthnumber = 1;
        counterfourthnumber = fourthNumber + counterfourthnumber ;

        int fifthNumber = Character.getNumericValue(wholeNumber.charAt(4));
        int counterfifthnumber = 1;
        counterfifthnumber = fifthNumber + counterfifthnumber;

        int sixthNumber = Character.getNumericValue(wholeNumber.charAt(5));
        int countersixthnumber = 1;
        countersixthnumber = sixthNumber + countersixthnumber;

        int seventhNumber = Character.getNumericValue(wholeNumber.charAt(6));
        int counterseventhnumber = 1;
        counterseventhnumber = seventhNumber + counterseventhnumber;

        int eighthNumber = Character.getNumericValue(wholeNumber.charAt(7));
        int countereighthnumber = 1;
        countereighthnumber = eighthNumber + countereighthnumber;

        int ninthNumber = Character.getNumericValue(wholeNumber.charAt(8));
        int counterninthnumber = 1;
        counterninthnumber = ninthNumber + counterninthnumber;

        int tenthNumber = Character.getNumericValue(wholeNumber.charAt(9));
        int countertenthnumber = 1;
        countertenthnumber = tenthNumber + countertenthnumber;

        String counterfirstnumber1 = Integer.toString(counterfirstnumber);
        String countersecondnumber1 = Integer.toString(countersecondnumber);
        String counterthirdnumber1 = Integer.toString(counterthirdnumber);
        String counterfourthnumber1 = Integer.toString(counterfourthnumber);
        String counterfifthnumber1 = Integer.toString(counterfifthnumber);
        String countersixthnumber1 = Integer.toString(countersixthnumber);
        String counterseventhnumber1 = Integer.toString(counterseventhnumber);
        String countereighthnumber1 = Integer.toString(countereighthnumber);
        String counterninthnumber1 = Integer.toString(counterninthnumber);
        String countertenthnumber1 = Integer.toString(countertenthnumber);

        if(counterfirstnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(counterfirstnumber1);
        }

        if(countersecondnumber1.equals("10")){
                System.out.format("0");
            }else {
            System.out.format(countersecondnumber1);
        }

        if(counterthirdnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(counterthirdnumber1);
        }

        if(counterfourthnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(counterfourthnumber1);
        }

        if(counterfifthnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(counterfifthnumber1);
        }

        if(countersixthnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(countersixthnumber1);
        }

        if(counterseventhnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(counterseventhnumber1);
        }

        if(countereighthnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(countereighthnumber1);
        }

        if(counterninthnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(counterninthnumber1);
        }

        if(countertenthnumber1.equals("10")){
            System.out.format("0");
        }else {
            System.out.format(countertenthnumber1);
        }

    }
}
