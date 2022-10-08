package employees;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee(1, "Cavalera", "Massimiliano", "Antonio", 15_000);
        employee[1] = new Employee(2, "Welgemoed", "Shaun", "Morgan", 10_000);
        employee[2] = new Employee(3, "Ritchie", "John", "Simon", 12_000);
        employee[3] = new Employee(4, "Maynard", "James", "Keenan", 8_000);
        employee[4] = new Employee(5, "Cobain", "Kurt", "Donald", 23_000);
        for (Employee employees : employee) {
            if (employees != null) {
                System.out.println(employees);
            }
        }
        Calculator calculator = new Calculator();
        double sum = calculator.sumSalary(employee);
        double average = calculator.averageSalary(employee);
        String min = calculator.minSalary(employee);
        String max = calculator.maxSalary(employee);
        System.out.println("Максимальная зарплата у " + max);
        System.out.println("Минимальная зарплата у " + min);
        System.out.println("Общая сумма зарплат: " + sum);
        System.out.println("Среднее значение зарплат: " + average);
    }
}


