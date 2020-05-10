package firstsemester;

/*
 * Amber Stone
 * 09.22.19
 * Description: This program invites the user to a friendly game of 
 * scissors-rock-paper against the computer.
 */
import java.util.Random;
import java.util.Scanner;

public class ScissorsRockPaper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter SCISSORS(0)" + " ROCK(1)"
                + " PAPER(2): ");
        int human = input.nextInt();

        Random guess = new Random();
        int computer = guess.nextInt(3);

        switch (computer) {
            case 0:
                switch (human) {
                    case 2:
                        System.out.println(" The computer chose scissors. "
                                + "You chose paper. Computer Wins!");
                        break;
                    case 1:
                        System.out.println(" The computer chose scissors. "
                                + "You chose rock. Human Wins!");
                        break;
                    case 0:
                        System.out.println(" The computer chose scissors. "
                                + "You chose scissors. It's a tie!");
                        break;
                }
        }

        switch (computer) {
            case 1:
                switch (human) {
                    case 0:
                        System.out.println(" The computer chose rock. "
                                + "You chose scissors. Computer Wins!");
                        break;
                    case 2:
                        System.out.println(" The computer chose rock. "
                                + "You chose paper. Human Wins!");
                        break;
                    case 1:
                        System.out.println(" The computer chose rock. "
                                + "You chose rock. It's a tie!");
                        break;
                }
        }

        switch (computer) {
            case 2:
                switch (human) {
                    case 1:
                        System.out.println(" The computer chose paper. "
                                + "You chose rock. Computer Wins!");
                        break;
                    case 0:
                        System.out.println(" The computer chose paper. "
                                + "You chose scissors. Human Wins!");
                        break;
                    case 2:
                        System.out.println(" The computer chose paper. "
                                + "You chose paper. It's a tie!");
                        break;
                }
        }

        if (human > 2) {
            System.out.println("You have entered an invalid response.");
        }

    }
}
