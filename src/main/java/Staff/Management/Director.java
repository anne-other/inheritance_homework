package Staff.Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nINumber, double salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double paybonus(){
        return salary * 0.02;
    }
}
