package EmployeePractice;

public class EmployeeApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee("RolDope", Gender.MALE, 850, EmployeeType.FULL_TIME);
        Employee emp2 = new Employee("KHOEM", Gender.FEMALE, 200, EmployeeType.INTERNSHIP);
        Employee emp3 = new Employee("ROLDOPHE", Gender.MALE, 354, EmployeeType.INTERNSHIP);
        Employee emp4 = new Employee("RADOM", Gender.MALE, 753, EmployeeType.PART_TIME);
        Employee emp5 = new Employee("Enzo", Gender.FEMALE, 950, EmployeeType.INTERNSHIP);
        Employee[] employees = new Employee[]{emp1, emp2, emp3, emp4, emp5};

        EmployeeService employeeService = new EmployeeService();
        int totalFemale = employeeService.countEmployeeByGender(employees, Gender.FEMALE);
        int totalMale = employeeService.countEmployeeByGender(employees, Gender.MALE);
        System.out.println("Total Female: " + totalFemale);
        System.out.println("Total Male: " + totalMale);

        double bonusEmp1 = employeeService.calculateBonus(emp1);
        double bonusEmp2 = employeeService.calculateBonus(emp2);
        double bonusEmp3 = employeeService.calculateBonus(emp3);
        double bonusEmp4 = employeeService.calculateBonus(emp4);
        double bonusEmp5 = employeeService.calculateBonus(emp5);
        double paymentEmp1 = employeeService.calculateTotalPaymentOfEmployee(emp1);
        double paymentEmp2 = employeeService.calculateTotalPaymentOfEmployee(emp2);
        double paymentEmp3 = employeeService.calculateTotalPaymentOfEmployee(emp3);
        double paymentEmp4 = employeeService.calculateTotalPaymentOfEmployee(emp4);
        double paymentEmp5 = employeeService.calculateTotalPaymentOfEmployee(emp5);
        System.out.println("-------------Bonus-----------");
        System.out.println("    Bonus Employee1: "+bonusEmp1);
        System.out.println("    Bonus Employee2: "+bonusEmp2);
        System.out.println("    Bonus Employee3: "+bonusEmp3);
        System.out.println("    Bonus Employee4: "+bonusEmp4);
        System.out.println("    Bonus Employee5: "+bonusEmp5);

        System.out.println("-------------Payment----------");
        System.out.println("    Payment Employee1: "+paymentEmp1);
        System.out.println("    Payment Employee2: "+paymentEmp2);
        System.out.println("    Payment Employee3: "+paymentEmp3);
        System.out.println("    Payment Employee4: "+paymentEmp4);
        System.out.println("    ayment Employee5: "+paymentEmp5);

    }

}
