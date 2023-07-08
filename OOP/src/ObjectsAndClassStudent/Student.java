package ObjectsAndClassStudent;

public class Student {
    int rollno;
    String name;
    void insertRecord(int addrRollno, String addrName){
        rollno=addrRollno;
        name=addrName;
    }
    void displayInformation(){
        System.out.println("RollNo: "+rollno);
        System.out.println("Name: "+name);
    }
}
