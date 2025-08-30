package Strings.Level2;

import java.util.*;

public class q9 {

    // Method to get computer choice using Math.random
    public static String getComputerChoice() {
        int num = (int)(Math.random() * 3); // 0,1,2
        if (num == 0) return "rock";
        else if (num == 1) return "paper";
        else return "scissors";
    }

    // Method to determine winner
    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) return "draw";

        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "player";
        } else {
            return "computer";
        }
    }

    // Method to calculate average and percentages
    public static String[][] calculateStats(int totalGames, int playerWins, int computerWins, int draws) {
        String[][] stats = new String[3][2];
        stats[0][0] = "Player Wins";
        stats[0][1] = playerWins + " (" + (playerWins * 100 / totalGames) + "%)";
        stats[1][0] = "Computer Wins";
        stats[1][1] = computerWins + " (" + (computerWins * 100 / totalGames) + "%)";
        stats[2][0] = "Draws";
        stats[2][1] = draws + " (" + (draws * 100 / totalGames) + "%)";
        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("Game   Player     Computer   Winner");
        System.out.println("--------------------------------------");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i+1) + "      " + games[i][0] + "      " + games[i][1] + "      " + games[i][2]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("---------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + " : " + stats[i][1]);
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] games = new String[n][3];
        int playerWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = getWinner(playerChoice, computerChoice);

            if (winner.equals("player")) playerWins++;
            else if (winner.equals("computer")) computerWins++;
            else draws++;

            games[i][0] = playerChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;
        }

        String[][] stats = calculateStats(n, playerWins, computerWins, draws);

        displayResults(games, stats);
    }
}

