import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee{
    ArrayList<Goal> goals = new ArrayList<>();

    public Manager(
            String fname,
            String lname,
            String address,
            String email,
            String pesel,
            LocalDate interDate
    ) {
        super(fname, lname, address, email, pesel, interDate);
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public float calculateSalary() {
        float salary = super.calculateSalary();
        for (Goal goal : goals) {
            if (goal.endTime.getMonth() == LocalDate.now().getMonth()) {
                salary += goal.bonus;
            }
        }
        return salary;
    }
}
