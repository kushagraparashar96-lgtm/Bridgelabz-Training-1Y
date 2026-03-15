package Level_3;

public class FootballTeamAnalyzer {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * (250 - 150 + 1)) + 150;
        }
        return heights;
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] playerHeights = generateRandomHeights(11);

        System.out.print("Player Heights (cms): ");
        for (int h : playerHeights) {
            System.out.print(h + " ");
        }

        int shortest = findShortest(playerHeights);
        int tallest = findTallest(playerHeights);
        double mean = calculateMean(playerHeights);

        System.out.println("\n\n--- Team Statistics ---");
        System.out.println("Shortest Player: " + shortest + " cms");
        System.out.println("Tallest Player:  " + tallest + " cms");
        System.out.println("Mean Height:     " + String.format("%.2f", mean) + " cms");
    }
}
