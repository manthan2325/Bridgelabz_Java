/*
 * Problem 22 - GCR Methods Level 1
 *
 * Program to play Rock-Paper-Scissors between the user and the
 * computer for multiple games.
 *
 * The program:
 * 1. Takes the number of games from the user.
 * 2. Takes the user's choice of Rock, Paper or Scissors.
 * 3. Generates a random choice for the computer.
 * 4. Finds the winner of each game based on the game rules.
 * 5. Keeps track of player and computer wins.
 * 6. Calculates the win percentage of the player and computer.
 * 7. Displays the result of every game and the final statistics
 *    in a tabular format.
 *
 * Hint =>
 * 1. Rock beats Scissors, Paper beats Rock and Scissors beats Paper.
 * 2. Create a method to find the computer choice using Math.random().
 * 3. Create a method to find the winner between the user and computer.
 * 4. Create a method to calculate the average and percentage of wins
 *    and return the result in a 2D String array.
 * 5. Create a method to display the game results and final statistics.
 * 6. In main(), take the number of games and call the required methods.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class RockPaperScissors {

    // Method to generate computer choice
    public static String getComputerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    // Method to find the winner
    public static String findWinner(String player, String computer) {

        if (player.equals(computer)) {
            return "Draw";
        }

        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Paper") && computer.equals("Rock")) ||
            (player.equals("Scissors") && computer.equals("Paper"))) {

            return "Player";
        }

        return "Computer";
    }

    // Method to calculate win statistics
    public static String[][] calculateStats(int playerWins,
                                            int computerWins,
                                            int totalGames) {

        double playerPercentage =
                (playerWins * 100.0) / totalGames;

        double computerPercentage =
                (computerWins * 100.0) / totalGames;

        String[][] stats = new String[2][2];

        stats[0][0] = "Player";
        stats[0][1] = String.format("%.2f", playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f", computerPercentage);

        return stats;
    }

    // Method to display the results
    public static void displayResults(String[] players,
                                      String[] computers,
                                      String[] winners,
                                      String[][] stats) {

        System.out.println("\nGame Results");
        System.out.println("----------------------------------------------");
        System.out.println("Game\tPlayer\t\tComputer\tWinner");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < players.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    players[i] + "\t\t" +
                    computers[i] + "\t\t" +
                    winners[i]
            );
        }

        System.out.println("\nWin Statistics");
        System.out.println("-----------------------------");
        System.out.println("Player\t\tWin Percentage");
        System.out.println("-----------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t\t" +
                    stats[i][1] + "%"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int numberOfGames = sc.nextInt();

        String[] players = new String[numberOfGames];
        String[] computers = new String[numberOfGames];
        String[] winners = new String[numberOfGames];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < numberOfGames; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter Rock, Paper or Scissors: ");

            String player = sc.next();

            // Convert first letter to uppercase
            player = player.substring(0, 1).toUpperCase()
                    + player.substring(1).toLowerCase();

            String computer = getComputerChoice();

            String winner = findWinner(player, computer);

            players[i] = player;
            computers[i] = computer;
            winners[i] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        // Calculate final statistics
        String[][] stats = calculateStats(
                playerWins,
                computerWins,
                numberOfGames
        );

        // Display all results
        displayResults(
                players,
                computers,
                winners,
                stats
        );

        sc.close();
    }
}