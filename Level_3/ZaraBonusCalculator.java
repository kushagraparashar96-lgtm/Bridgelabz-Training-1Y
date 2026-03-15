package Level_3;

public class ZaraBonusCalculator {

    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        for (int i = 0; i < count; i++) {
            // Generate 5-digit salary: 10000 to 99999
            data[i][0] = (Math.random() * 90000) + 10000;
            // Generate years of service: 1 to 10 years (company age)
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        int count = employeeData.length;
        double[][] results = new double[count][2]; // [0] is Bonus, [1] is New Salary

        for (int i = 0; i < count; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;

            double bonusAmount = salary * bonusPercentage;
            results[i][0] = bonusAmount;
            results[i][1] = salary + bonusAmount;
        }
        return results;
    }

    public static void displayReport(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-12s | %-12s | %-12s | %-12s | %-12s%n",
                "Emp ID", "Old Salary", "Service Yrs", "Bonus Amt", "New Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][0];
            double nextSalary = newData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += nextSalary;

            System.out.printf("Emp %-8d | %-12.2f | %-12.0f | %-12.2f | %-12.2f%n",
                    (i + 1), oldSalary, years, bonus, nextSalary);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-23s | %-12.2f | %-12.2f | %-12.2f%n",
                "TOTALS", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate original data
        double[][] employeeBase = generateEmployeeData(numEmployees);

        // Step 2: Process bonuses
        double[][] updatedRecords = calculateBonusAndNewSalary(employeeBase);

        // Step 3: Display results
        displayReport(employeeBase, updatedRecords);
    }
}