package Interface.PracticeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Athlete implements ClientFeatures {
    private int id;
    private String name;
    private String gender;
    private List<String> sports = new ArrayList<>();

    public Athlete(){}
    public Athlete(int id,String name, String gender, List<String> sports){
        this.id=id;
        this.name= name;
        this.gender = gender;
        this.sports=sports;
    }
    @Override
    public Athlete addRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input id: ");
        id = scanner.nextInt();
        System.out.print("Please input name: ");
        scanner.nextLine();
        name= scanner.nextLine();
        System.out.print("Please input gender: ");
        gender = scanner.nextLine();
        int n;
        System.out.println("Please input number of sports you want to play: ");
        n=scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<n; i++){
            sports.add(scanner.nextLine());
        }
        return this;
    }
    @Override
    public Athlete updateRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input name: ");
        scanner.nextLine();
        name= scanner.nextLine();
        System.out.print("Please input gender: ");
        gender = scanner.nextLine();
        int n;
        System.out.println("Please input number of sports you want to play: ");
        n=scanner.nextInt();
        scanner.nextLine();
        sports.clear();
     //   sports = new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.print("Enter the sport: ");
            sports.add(scanner.nextLine());
        }
        return this;
    }
    @Override
    public void ShowRecord() {
        System.out.println("Athlete ID: "+id);
        System.out.println("Athlete Name: "+name);
        System.out.println("Athlete Gender: "+gender);
        System.out.println("Athlete Sports: "+sports);
        System.out.println("-----------------------------");
    }

    @Override
    public String getObjectType() {
        return this.getClass().getSimpleName();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<String> getSports() {
        return sports;
    }
    public void setSports(List<String> sports) {
        this.sports = sports;
    }
}
