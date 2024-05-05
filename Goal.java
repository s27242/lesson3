import java.time.LocalDate;

public class Goal {
    LocalDate endTime;
    String name;
    float bonus;

    public Goal(LocalDate endTime, String name, float bonus) {
        this.endTime = endTime;
        this.name = name;
        this.bonus = bonus;
    }
}
