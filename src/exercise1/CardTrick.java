package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Harshdeep Singh Jan 30, 2024 
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick 
{
    
    public static void main(String[] args) 
    {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
            Random random = new Random();

            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);

            hand[i] = card;
        }
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Pick a suit (1-Hearts, 2-Diamonds, 3-Spades, 4-Clubs): ");
        int userSuitIndex = scanner.nextInt() - 1;
        String userSuit = Card.SUITS[userSuitIndex];

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean foundMatch = false;
        for (Card card : hand) 
        {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) 
            {
                printInfo();
                foundMatch = true;
                break;
            }       
        }
        if (!foundMatch) 
        {
            System.out.println("Sorry, you didn't guess correctly. Better luck next time!");
        }   
    }
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Harshdeep Singh Jan 30, 2024
     */
    private static void printInfo() 
    {
    
        System.out.println("I'm done!");
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Harshdeep Singh, but you can call me as Harsh");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Invest time in learning new things related to technology.");
        System.out.println("Having a great interest in Web Programming!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Travelling");
        System.out.println("Reading");
        System.out.println("Gaming");

        System.out.println();
    }
}
