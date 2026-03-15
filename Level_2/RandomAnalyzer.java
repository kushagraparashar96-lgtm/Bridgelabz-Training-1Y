package Level_2;

public class RandomAnalyzer {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = sum / numbers.length;
        return new double[]{average, (double)min, (double)max};
    }

    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.print("Generated 4-digit numbers: ");
        for (int n : randomNumbers) {
            System.out.print(n + " ");
        }

        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("\n\nAverage Value: " + stats[0]);
        System.out.println("Minimum Value: " + (int)stats[1]);
        System.out.println("Maximum Value: " + (int)stats[2]);
    }
}
