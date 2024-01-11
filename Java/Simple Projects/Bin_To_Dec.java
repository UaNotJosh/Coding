//Simple project to convert binary input to decimal output
//Import necessary utilities
import java.util.Scanner;

public class Bin_To_Dec {
    
    public static void main(String[] args){
        //Initialize variables
        int runSum = 0;
        
        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //Print prompt
        System.out.println("Please input binary to convert: ");

        //Wait for user input and assign to variable
        String binaryIn = scanner.nextLine();

        //Get length of string
        int stringL = binaryIn.length();

        //For loop for decimal value
        for(int i = 0; i < stringL; i++){
            char digit = binaryIn.charAt(i);
            if(digit != '1' || digit != '0'){
                System.out.println("Please only input binary");
                System.exit(1);
            }
            if(digit == '1'){
                runSum += Math.pow(2, stringL - 1 - i);
            }
        }

        //Print result
        System.out.println("The result in decimal is: " + runSum);

        //Close scanner
        scanner.close();
    }
}
