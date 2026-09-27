/*
 * Problem 33 - GCR Methods Level 1
 *
 * Program to create a deck of cards, initialize the deck,
 * shuffle the deck, and distribute the cards among players.
 *
 * The program:
 * 1. Creates a deck using 4 suits and 13 ranks.
 * 2. Initializes all 52 cards in the deck.
 * 3. Shuffles the deck using random card positions.
 * 4. Takes the number of cards to distribute and the number
 *    of players as input.
 * 5. Checks whether the cards can be equally distributed
 *    among the given number of players.
 * 6. Creates a 2D array to store the cards of each player.
 * 7. Distributes the cards among the players.
 * 8. Displays the cards received by each player.
 *
 * Hint =>
 * 1. Create suits:
 *    Hearts, Diamonds, Clubs and Spades.
 *
 * 2. Create ranks:
 *    2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King and Ace.
 *
 * 3. Calculate the number of cards:
 *    numOfCards = suits.length * ranks.length
 *
 * 4. Create a method to initialize the deck. Each card should
 *    be stored as "rank of suit".
 *
 * 5. Create a method to shuffle the deck by swapping each card
 *    with a random card from the remaining deck.
 *
 * 6. Create a method to distribute n cards among x players.
 *    The cards must be equally divisible among the players.
 *
 * 7. Create a method to print the players and their cards.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class DeckOfCards {

    // Method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;

        String[] deck = new String[numOfCards];

        int index = 0;

        // Create each card using rank and suit
        for (int i = 0; i < suits.length; i++) {

            for (int j = 0; j < ranks.length; j++) {

                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            // Generate random card number from i to n-1
            int randomCardNumber =
                    i + (int) (Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute cards among players
    public static String[][] distributeCards(String[] deck,
                                               int numberOfCards,
                                               int numberOfPlayers) {

        // Check if cards can be equally distributed
        if (numberOfCards % numberOfPlayers != 0) {
            return null;
        }

        int cardsPerPlayer = numberOfCards / numberOfPlayers;

        String[][] players = new String[numberOfPlayers][cardsPerPlayer];

        int index = 0;

        // Distribute cards one by one
        for (int i = 0; i < numberOfPlayers; i++) {

            for (int j = 0; j < cardsPerPlayer; j++) {

                players[i][j] = deck[index];
                index++;
            }
        }

        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create suits and ranks
        String[] suits = {
            "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"
        };

        // Calculate total number of cards
        int numOfCards = suits.length * ranks.length;

        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle the deck
        deck = shuffleDeck(deck);

        System.out.println("Total cards in deck: " + numOfCards);

        System.out.print("Enter number of cards to distribute: ");
        int numberOfCards = sc.nextInt();

        System.out.print("Enter number of players: ");
        int numberOfPlayers = sc.nextInt();

        // Check whether enough cards are available
        if (numberOfCards > numOfCards) {

            System.out.println("Cannot distribute more than "
                    + numOfCards + " cards.");

        } else if (numberOfPlayers <= 0) {

            System.out.println("Number of players must be greater than 0.");

        } else if (numberOfCards % numberOfPlayers != 0) {

            System.out.println("Cards cannot be equally distributed "
                    + "among the players.");

        } else {

            // Distribute the cards
            String[][] players = distributeCards(
                    deck, numberOfCards, numberOfPlayers
            );

            // Print the players and their cards
            printPlayers(players);
        }

        sc.close();
    }
}