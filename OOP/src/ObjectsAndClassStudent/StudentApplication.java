package ObjectsAndClassStudent;

public class StudentApplication {
    public static void main(String[] args) {
        Student student0 = new Student(),
                student1 = new Student(),
                student2 = new Student();
        student0.insertRecord(101, "RADOM");
        student1.insertRecord(102, "ROLDOPHE");
        student2.insertRecord(103, "KHOEM");
        student0.displayInformation();
        student1.displayInformation();
        student2.displayInformation();

    }
}
