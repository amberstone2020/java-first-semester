package firstsemester;

/*
 * Amber Stone
 * 10.09.19
 * This program prompts the user to enter a hexadecimal number containing 
 * exactly two characters and displays the decimal value.
 */
import java.util.Scanner;

public class HexToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two hexadecimal characters: ");
        String hexString = input.nextLine();

        // Check if the hex string has exactly one character
        if (hexString.length() != 2) {
            System.out.println("You must enter exactly two characters");
            System.exit(0);
        }

        // Display decimal value for the hex digit
	input.close();
		
	//converting hex to decimal by passing base 16 
	int num = Integer.parseInt(hexString,16);
		
	System.out.println("Decimal equivalent of given hex number: "+num);
   }
}
