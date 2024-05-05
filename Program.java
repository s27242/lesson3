import java.time.LocalDate;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating and adding developers
        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", LocalDate.of(2020, 1, 1));
        Technology t = new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);

        // Creating and adding testers
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", LocalDate.of(2021, 1, 1));
        tester.addTestType("UI/UX");
        employees.add(tester);

        // Creating and adding a manager
        Manager manager = new Manager("Bob", "Johnson",
                "Chicago", "bob@johnson.com", "1122334455", LocalDate.of(2019, 1, 1));
        Goal g = new Goal(LocalDate.of(2024, 5, 4), "Implementing FB login", 1000);
        manager.addGoal(g);
        employees.add(manager);

        // Calculating total amount to be paid
        float totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");
    } }