package EmployeePractice;

public class EmployeeService {
    Employee createEmployee() {

        return null;
    }

    Employee createEmployees(int numberOfEmployee) {
        Employee[] employees = new Employee[numberOfEmployee];
        return null;
    }

    public int countEmployeeByGender(Employee[] employees, Gender gender) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee.getGender().equals(gender))
                total++;
        }
        return total;
    }

    public double calculateBonus(Employee employee) {
        double bonus = 0.0;
        switch (employee.getEmployeeType()) {
            case FULL_TIME -> bonus = employee.getSalary() * 0.05;
            case PART_TIME -> bonus = employee.getSalary() * 0.03;
            case INTERNSHIP -> bonus = employee.getSalary() * 0.02;
        }
        return bonus;
    }

    public double calculateTotalPaymentOfEmployee(Employee employee) {
        return employee.getSalary() + calculateBonus(employee);
    }


}
