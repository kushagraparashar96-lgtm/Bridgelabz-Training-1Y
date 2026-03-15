package com.gla.Level_3;
import java.util.Scanner;

public class CardGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Suits and Ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // b. Calculate and Initialize
        int n = suits.length * ranks.length;
        String[] deck = initializeDeck(suits, ranks, n);

        // d. Shuffle
        deck = shuffleDeck(deck, n);

        // e. Input players and Distribute
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        String[][] players = distributeCards(deck, n, x, cardsPerPlayer);

        // f. Print results
        if (players != null) {
            printPlayers(players);
        } else {
            System.out.println("Error: Not enough cards in the deck for " + x + " players.");
        }

        sc.close();
    }

    // c. Method to Initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks, int n) {
        String[] deck = new String[n];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // d. Method to Shuffle the deck
    public static String[] shuffleDeck(String[] deck, int n) {
        for (int i = 0; i < n; i++) {
            // Step 2: Generate random index
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Step 3: Swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // e. Method to distribute cards
    public static String[][] distributeCards(String[] deck, int n, int x, int cardsPerPlayer) {
        if (x * cardsPerPlayer > n) {
            return null; // Not enough cards
        }

        String[][] players = new String[x][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }
        return players;
    }

    // f. Method to Print the players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s Hand:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  - " + players[i][j]);
            }
        }
    }
}
