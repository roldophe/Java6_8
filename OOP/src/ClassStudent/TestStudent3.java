package ClassStudent;

public class TestStudent3 {
    public static void main(String[] args) {
        //Creating objects
        Student student1 =  new Student();
        Student student2 =  new Student();
        //Initializing objects
        student1.id = 1001;
        student1.name="RADOM";
        student2.id= 1002;
        student2.name="KHOEM";

        //Printing data
        System.out.println("Student 1: ");
        System.out.println(student1.id+" "+student1.name);
        System.out.println("Student 2: ");
        System.out.println(student2.id+" "+student2.name);

    }
}
