//Converts input dollar amount into cents and gives coins to value
//Import necessary utilities
import java.util.Scanner;

public class Dollars_To_Cents {
    public static void main(String[] args){
        //Initialize variables
        double dollarValue;
        int centValue, numQuarters, numDimes, numNickels, numPennies;

        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //Ask user for input
        System.out.print("Please input your dollar amount: $");

        //Make sure user inputs valid double
        while(!scanner.hasNextDouble()){
            System.out.println("Please input a valid dollar amount");

            //Ignore invalid input and reprompt
            scanner.next();
            System.out.print("Please input your dollar amount: $");
        }

        //Bring in dollar value
        dollarValue = scanner.nextDouble();

        //Convert to cents and display
        dollarValue *= 100;
        centValue = (int) Math.round(dollarValue);
        System.out.println("The value you entered in dollars is worth " + centValue + " cents");

        //Find how many coins make up the amount
        numQuarters = centValue / 25;
        centValue %= 25;
        numDimes = centValue / 10;
        centValue %= 10;
        numNickels = centValue / 5;
        centValue %= 5;
        numPennies = centValue;
        System.out.println("This is equal to " + numQuarters + " quarters, " + numDimes + 
        " dimes, " + numNickels + " nickels, and " + numPennies + " pennies");

        scanner.close();
    }
}
