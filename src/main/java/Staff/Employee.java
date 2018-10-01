package Staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    protected double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if (raise > 0) {
            salary += raise;
        }
    }

    public double paybonus(){
        return salary * 0.01;
    }
}
