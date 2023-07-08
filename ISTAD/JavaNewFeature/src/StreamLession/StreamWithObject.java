package StreamLession;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Worker {
    int id;
    String name;
    String gender;
    float salary;

    Worker() {
    }

    Worker(int id, String name, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class StreamWithObject {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>() {{
            add(new Worker(101, "Mr.Deth", "Male", 4000));
            add(new Worker(102, "Mrs.Green", "Male", 4000));
            add(new Worker(103, "Mr.Roldophe", "Male", 2000));
        }};
        List<Worker> workerList = workers.stream().filter(worker -> worker.gender.equalsIgnoreCase("male")).collect(Collectors.toList());
        System.out.println(workerList);

    }
}
