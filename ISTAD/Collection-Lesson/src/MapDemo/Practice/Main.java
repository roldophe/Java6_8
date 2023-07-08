package MapDemo.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, List<Employee>> employeeList = new TreeMap<>();

        employeeList.put("data", new ArrayList<>() {{
            add(new Employee(1, "RADOM", "M", 2300));
            add(new Employee(2, "ROLDPOHE", "M", 1500));
        }});
        System.out.println("All values is: ");
        System.out.println(employeeList);
    }
}
