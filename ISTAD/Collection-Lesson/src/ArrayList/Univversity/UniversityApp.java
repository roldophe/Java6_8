package ArrayList.Univversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<IFeature> records = new ArrayList<>();

//
//        ArrayList<Float> socres1 = new ArrayList<>(Arrays.asList(93f, 83f, 74f, 73f, 62f));
//        ArrayList<Float> socres2 = new ArrayList<>(Arrays.asList(23f, 83f, 76f, 73f, 62f));
//        ArrayList<Float> socres3 = new ArrayList<>(Arrays.asList(63f, 81f, 74f, 63f, 62f));
//        Student stu1 = new Student(101, "RADOM", "Male", 21, socres1);
//        Student stu2 = new Student(102, "LUOIZ", "Male", 22, socres2);
//        Student stu3 = new Student(103, "ENZO", "Male", 11, socres3);
//
//        // records.add(new University("RUPP",new Student(101,"RADOM","Male",23,socres)));
//        // records.add(new University().insert());
//
//
//        records.add(stu1);
//        records.add(stu2);
//        records.add(stu3);

        int n = InputUtils.getInt(scanner, "Please input number of Student: ");
        for (int i = 0; i < n; i++) {
            records.add(i, new University().insert());
        }
        for (IFeature feature : records) {
            System.out.println("-----------------------------------------");
            feature.display();
        }

    }
}
