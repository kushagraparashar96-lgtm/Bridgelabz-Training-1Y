package com.gla.level_2;

    import java.util.Scanner;

    public class RockPaperScissorGame {

        public static String computerChoice() {

            int num = (int) (Math.random() * 3);

            if (num == 0) return "rock";
            if (num == 1) return "paper";
            return "scissors";
        }

        public static String findWinner(String user, String computer) {

            if (user.equals(computer)) return "Draw";

            if (user.equals("rock") && computer.equals("scissors")) return "User";
            if (user.equals("paper") && computer.equals("rock")) return "User";
            if (user.equals("scissors") && computer.equals("paper")) return "User";

            return "Computer";
        }

        public static String[][] calculateStats(int userWin, int compWin, int games) {

            String[][] stats = new String[2][3];

            double userPercent = (userWin * 100.0) / games;
            double compPercent = (compWin * 100.0) / games;

            stats[0][0] = "User";
            stats[0][1] = String.valueOf(userWin);
            stats[0][2] = String.valueOf(userPercent);

            stats[1][0] = "Computer";
            stats[1][1] = String.valueOf(compWin);
            stats[1][2] = String.valueOf(compPercent);

            return stats;
        }

        public static void displayGames(String[][] games, String[][] stats) {

            System.out.println("Game\tUser\tComputer\tWinner");

            for (int i = 0; i < games.length; i++) {
                System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
            }

            System.out.println("\nPlayer\tWins\tWin%");

            for (int i = 0; i < stats.length; i++) {
                System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of games:");
            int n = sc.nextInt();

            String[][] games = new String[n][3];

            int userWin = 0;
            int compWin = 0;

            for (int i = 0; i < n; i++) {

                System.out.println("Enter your choice (rock/paper/scissors):");
                String user = sc.next().toLowerCase();

                String computer = computerChoice();

                String winner = findWinner(user, computer);

                if (winner.equals("User")) userWin++;
                if (winner.equals("Computer")) compWin++;

                games[i][0] = user;
                games[i][1] = computer;
                games[i][2] = winner;
            }

            String[][] stats = calculateStats(userWin, compWin, n);

            displayGames(games, stats);
        }
    }

