package employees;

public class Employee {
    String fullName;
    double salary;
    int dep;

    private static int counter = 1;


    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDep() {
        return dep;
    }

    private final int id;

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

    public static void allData(Employee[] employees) {
        String fullName;
        int dep;
        double sal;
        int id;
        for (Employee employee : employees) {
            if (employee != null) {
                fullName = employee.getFullName();
                dep = employee.getDep();
                sal = employee.getSalary();
                id = employee.getId();
                System.out.println(dep + "й отдел, id: " + id + " фио: " + fullName + " зарплата: " + sal + " рублей");
            }
        }
    }
    public static void fullName(Employee[] employees) {
        String fullName;
        for (Employee employee : employees) {
            if (employee != null) {
                fullName = employee.getFullName();
                System.out.println(fullName);
            }
        }
    }
}
