package employees;

public class Calculator {
    public double sumSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double averageSalary(Employee[] employees) {
        double average;
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        average = sum / count;
        return average;
    }

    public String minSalary(Employee[] employees) {
        double minSalary = Double.MAX_VALUE;
        String min = null;
        for (Employee employee : employees) {
            if (employee != null && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                min = employee.getFullName();
            }
        }
        return min + " равна " + minSalary;
    }

    public String maxSalary(Employee[] employees) {
        double maxSalary = Double.MIN_VALUE;
        String employe = null;
        for (Employee employee : employees) {
            if (employee != null && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employe = employee.getFullName();
            }
        }
        return employe + " равна " + maxSalary;
    }


}
