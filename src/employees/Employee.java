package employees;

public class Employee {
    private String fullName;
    private double salary;
    private int dep;

    private static int counter = 1;
    private int id;

    public Employee() {
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDep() {
        return dep;
    }

    public int getId() {
        return id;
    }


    public void setDep(int dep) {
        this.dep = dep;
    }

    Employee(int dep, String fullName,
             double salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.dep = dep;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", dep=" + dep +
                ", id=" + id +
                '}';
    }
}
