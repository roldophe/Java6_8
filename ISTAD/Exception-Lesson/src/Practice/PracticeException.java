package Practice;

import java.util.HashSet;
import java.util.Scanner;

class inputUtils {
    static int readInteger(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (Exception ex) {
                System.out.println("Error! value must be a number!");
                scanner.nextLine();
            }
        }
    }
}

class Worker {
    private int id;
    private String name;
    private String gender;
    private int wage;
    private HashSet<String> position = new HashSet<>();

    public Worker() {
    }

    private Worker(int id, String name, String gender, int wage, HashSet<String> position) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.wage = wage;
        this.position = position;
    }

    public void setId(int id) {
        if (id == 0) throw new ArithmeticException("b cannot be zero!! Infinite value");
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setPosition(HashSet<String> position) {
        this.position = position;
    }

    public void input(Scanner scanner) {
        id = inputUtils.readInteger(scanner, "Enter worker id:");
        System.out.print("Enter worker name: ");
        scanner.nextLine(); //for clearing buffer
        name = scanner.nextLine();
        System.out.print("Enter worker gender: ");
        gender = scanner.nextLine();
        wage = inputUtils.readInteger(scanner, "Enter worker wage:");
        int n =inputUtils.readInteger(scanner, "Enter number of position:");
        System.out.println("Enter your position title: ");
        scanner.nextLine(); // for clearing buffer
        for (int i = 0; i < n; i++) {
            System.out.print("Position[" + (i + 1) + "]:");
            position.add(scanner.nextLine());
        }
    }

    public void workerOutput() {
        System.out.println("------------------------------------");
        System.out.println("Practice.Worker ID: " + id);
        System.out.println("Practice.Worker Name: " + name);
        System.out.println("Practice.Worker gender: " + gender);
        System.out.println("Practice.Worker wage: " + wage);
        System.out.println("Practice.Worker position: " + position);
        System.out.println("------------------------------------");
    }
}

public class PracticeException {
    //ArrayList<Practice.Worker>
    //id,name,gender,wage, position[] unique
    //input->validation-handle exception
    //show -> worker

    //option
    //write all worker information to file.txt

    public static void main(String[] args) {
        //ArrayList<Practice.Worker> workers = new ArrayList<>();
//        workers.add(new Practice.Worker(0, "RADOM", "Male", 15, 30, new HashSet<>(Arrays.asList("FARMER", "CO", "ADMIN", "MANAGER", "ADMIN"))));
//        System.out.println("Workers: "+workers);

        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();
        worker.input(scanner);
        worker.workerOutput();
    }

}
