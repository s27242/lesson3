import java.time.LocalDate;
import java.time.Period;

public class Employee {
    String fname;
    String lname;
    String address;
    String email;
    String pesel;
    LocalDate interDate;

    public Employee(
            String fname,
            String lname,
            String address,
            String email,
            String pesel,
            LocalDate interDate
            ) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.interDate = interDate;
    }

    public float calculateSalary() {
        float baseSalary = 3000;
        Period period = Period.between(this.interDate, LocalDate.now());
        int years = period.getYears();
        return baseSalary + years * 1000;
    }
}
