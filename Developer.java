import java.time.LocalDate;
import java.util.ArrayList;

public class Developer extends Employee {
    ArrayList<Technology> technology = new ArrayList<>();

    public Developer(
            String fname,
            String lname,
            String address,
            String email,
            String pesel,
            LocalDate interDate
    ) {
        super(fname, lname, address, email, pesel, interDate);
    }

    public void addTechnology(Technology technology) {
        this.technology.add(technology);
    }

    public float calculateSalary() {
        float salary = super.calculateSalary();
        for (Technology technology : technology) {
            salary += technology.bonus;
        }
        return salary;
    }
}
