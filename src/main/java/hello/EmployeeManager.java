package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

    public void listEmployees() {
        System.out.println("Listing all employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Registration System");
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Add employee");
            System.out.println("2 - List employees");
            System.out.println("3 - Exit");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter employee ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter employee position: ");
                    String position = scanner.nextLine();

                    Employee emp = new Employee(id, name, position);
                    manager.addEmployee(emp);
                    break;

                case "2":
                    manager.listEmployees();
                    break;

                case "3":
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
                    break;
            }
        }

        scanner.close();
    }
}}
