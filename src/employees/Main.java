package employees;

import java.util.Arrays;

public class Main {
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {


        employee[0] = new

                Employee(1, "Cavalera Massimiliano Antonio", 15_000);

        employee[1] = new

                Employee(2, "Welgemoed Shaun Morgan", 10_000);

        employee[2] = new

                Employee(3, "Ritchie John Simon", 12_000);

        employee[3] = new

                Employee(4, "Maynard James Keenan", 8_000);

        employee[4] = new

                Employee(5, "Cobain Kurt Donald", 23_000);
        System.out.println(Arrays.toString(employee));
        sumSalary();
        averageSalary();
        minSalary();
        maxSalary();
        empFullName();
    }

    public static void sumSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        System.out.println(sum);
    }

    public static void averageSalary() {
        double average;
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
                count++;
            }
        }
        average = sum / count;
        System.out.println(average);
    }

    public static void minSalary() {
        double minSalary = Double.MAX_VALUE;
        String min = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                min = employee[i].getFullName();
            }
        }
        System.out.println(min + minSalary);
    }

    public static void maxSalary() {
        double maxSalary = Double.MIN_VALUE;
        String employe = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                employe = employee[i].getFullName();
            }
        }
        System.out.println(employe + maxSalary);
    }

    public static void empFullName() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName());
            }
        }
    }
}


