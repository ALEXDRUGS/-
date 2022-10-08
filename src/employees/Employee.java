package employees;

public class Employee {
    String surname;
    String name;
    String patronymic;
    String fullName;
    double salary;
    int dep;

    private static int counter = 1;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
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

    private final int id;

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public Employee(int dep, String surname, String name, String patronymic,
                    double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.fullName = surname + " " + name + " " + patronymic;
        this.salary = salary;
        this.dep = dep;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "отдел: " + dep + ", Ф.И.О.: " + surname + " " + name + " " + patronymic
                + ", зарплата: " + salary + ", id: " + id + "\n";
    }
}
