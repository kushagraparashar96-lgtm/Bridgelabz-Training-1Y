package EmployeeManagementSystem;

import java.util.*;

public class Runner {




        public static void main(String[] args) {
            List<Employee> employeeList = new ArrayList<>();

            FullTimeEmployee ft = new FullTimeEmployee(101, "Rahul Gandhi", 50000, 5000);
            ft.assignDepartment("Aloo To Gold");

            PartTimeEmployee pt = new PartTimeEmployee(102, "Modi", 80, 500);
            pt.assignDepartment("BJP");


            employeeList.add(ft);
            employeeList.add(pt);

            System.out.println("--- Employee Payroll Report ---");
            for (Employee emp : employeeList) {
                emp.displayDetail();

                if (emp instanceof Department) {
                    System.out.println(((Department) emp).getDepartmentDetails());
                }
                System.out.println("-------------------------------");
            }
        }
    }

