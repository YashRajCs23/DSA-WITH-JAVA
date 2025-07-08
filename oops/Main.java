import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Base class for Employee
class Employee {
    protected String name;
    protected int employeeId;
    protected int baseSalary;

    public Employee(String name, int employeeId, int baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Method to get details of the employee
    public void getDetails() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId + ", Base Salary: " + baseSalary);
    }

    // Method to calculate the total salary (to be overridden by subclasses)
    public int calculateTotalSalary() {
        return baseSalary;
    }
}

// PermanentEmployee class extends Employee
class PermanentEmployee extends Employee {
    private List<String> benefits;
    private int bonus;

    public PermanentEmployee(String name, int employeeId, int baseSalary, List<String> benefits, int bonus) {
        super(name, employeeId, baseSalary);
        this.benefits = benefits;
        this.bonus = bonus;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Benefits: " + benefits + ", Bonus: " + bonus);
    }

    @Override
    public int calculateTotalSalary() {
        // Calculate monthly salary, add the monthly portion of the annual bonus
        return baseSalary + (bonus / 12); // Monthly bonus from annual bonus
    }
}

// ContractualEmployee class extends Employee
class ContractualEmployee extends Employee {
    private int contractDuration; // in months
    private int hourlyRate;
    private int hoursWorked;

    public ContractualEmployee(String name, int employeeId, int baseSalary, int contractDuration, int hourlyRate, int hoursWorked) {
        super(name, employeeId, baseSalary);
        this.contractDuration = contractDuration;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Contract Duration: " + contractDuration + " months, Hourly Rate: " + hourlyRate);
    }

    @Override
    public int calculateTotalSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Intern class extends Employee
class Intern extends Employee {
    private int stipend;
    private String mentorName;

    public Intern(String name, int employeeId, int baseSalary, int stipend, String mentorName) {
        super(name, employeeId, baseSalary);
        this.stipend = stipend;
        this.mentorName = mentorName;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Stipend: " + stipend + ", Mentor: " + mentorName);
    }

    @Override
    public int calculateTotalSalary() {
        return stipend;
    }
}

// Company class to manage employees
class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int employeeId) {
        employees.removeIf(e -> e.getEmployeeId() == employeeId);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.getDetails();
        }
    }

    public int calculatePayroll() {
        int totalPayroll = 0;
        for (Employee employee : employees) {
            totalPayroll += employee.calculateTotalSalary();
        }
        return totalPayroll;
    }
}

// Main class to run the system
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        int n = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine().trim();
            switch (type) {
                case "p":
                    String[] permData = scanner.nextLine().trim().split(" ");
                    String permName = permData[0];
                    int permId = Integer.parseInt(permData[1]);
                    int permBaseSalary = Integer.parseInt(permData[2]);
                    List<String> benefits = new ArrayList<>();
                    for (int j = 3; j < permData.length - 1; j++) {
                        benefits.add(permData[j]);
                    }
                    int permBonus = Integer.parseInt(permData[permData.length - 1]);

                    PermanentEmployee permEmployee = new PermanentEmployee(permName, permId, permBaseSalary, benefits, permBonus);
                    company.addEmployee(permEmployee);
                    break;

                case "c":
                    String[] contractData = scanner.nextLine().trim().split(" ");
                    String contractName = contractData[0];
                    int contractId = Integer.parseInt(contractData[1]);
                    int contractBaseSalary = Integer.parseInt(contractData[2]);
                    int contractDuration = Integer.parseInt(contractData[3]);
                    int hourlyRate = Integer.parseInt(contractData[4]);
                    int hoursWorked = Integer.parseInt(contractData[5]);

                    ContractualEmployee contractEmployee = new ContractualEmployee(contractName, contractId, contractBaseSalary, contractDuration, hourlyRate, hoursWorked);
                    company.addEmployee(contractEmployee);
                    break;

                case "i":
                    String[] internData = scanner.nextLine().trim().split(" ");
                    String internName = internData[0];
                    int internId = Integer.parseInt(internData[1]);
                    int internBaseSalary = Integer.parseInt(internData[2]);
                    int stipend = Integer.parseInt(internData[3]);
                    String mentorName = internData[4];

                    Intern internEmployee = new Intern(internName, internId, internBaseSalary, stipend, mentorName);
                    company.addEmployee(internEmployee);
                    break;

                default:
                    System.out.println("Invalid employee type.");
                    break;
            }
        }

        // Calculate the total payroll (monthly expenditure)
        int totalExpenditure = company.calculatePayroll();
        System.out.println(totalExpenditure);
    }
}


