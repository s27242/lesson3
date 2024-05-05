import java.time.LocalDate;
import java.util.ArrayList;

public class Tester extends Employee {
    ArrayList<String> testType = new ArrayList<>();

    public Tester(
            String fname,
            String lname,
            String address,
            String email,
            String pesel,
            LocalDate interDate
    ) {
        super(fname, lname, address, email, pesel, interDate);
    }

    public void addTestType(String testType) {
        this.testType.add(testType);
    }

    public float calculateSalary() {
        float salary = super.calculateSalary();
        salary += this.testType.size() * 300;
        return salary;
    }
}