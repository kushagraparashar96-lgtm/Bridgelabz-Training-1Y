package Level_1;

class Employee {
    // Attributes (Fields)
    String name;
    int id;
    double salary;

    // Constructor to initialize the attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("---------------------------");
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : $" + String.format("%.2f", salary));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating objects of the Employee class
        Employee emp1 = new Employee("Alice Johnson", 101, 75000.00);
        Employee emp2 = new Employee("Bob Smith", 102, 62500.50);

        // Displaying details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}