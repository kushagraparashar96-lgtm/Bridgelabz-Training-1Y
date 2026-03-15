package Level_3;

public class FactorProcessor {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        if (factors.length <= 1) return factors[0];
        return factors[factors.length - 2];
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double findProductOfCubes(int[] factors) {
        double productOfCubes = 1;
        for (int factor : factors) {
            productOfCubes *= Math.pow(factor, 3);
        }
        return productOfCubes;
    }

    public static void main(String[] args) {
        int num = 6;
        int[] factors = findFactors(num);

        System.out.print("Factors of " + num + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\n---------------------------");
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes: " + findProductOfCubes(factors));
    }
}
