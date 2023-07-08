package Class.ClassStudent;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();

        //for class AccessModifier is Default or Public
//        student.name="RADOM";
//        student.gender="Male";
//        student.age=21;

        //for AccessModifier is Private;
        student.setName("RADOM KHOEM");
        student.setGender("Male");
        student.setAge(21);

        String result = student.toData();
        System.out.println(result);

        //test default value;
        System.out.println("char letter: "+student.letter);
    }
}
