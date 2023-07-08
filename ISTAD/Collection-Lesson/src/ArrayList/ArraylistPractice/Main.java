package ArrayList.ArraylistPractice;

import java.util.ArrayList;
import java.util.List;

//Student
//Worker
//Programmer
public class Main {
    public static void main(String[] args) {
        int option, number;
//        Type[] anArray = ...
//        ArrayList<Type> aList = new ArrayList<Type>(Arrays.asList(anArray));
        List<Service> records = new ArrayList<>();
        do {
            System.out.println("1. Add New Record");
            System.out.println("2. Edit Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Show ALl Records!");
            System.out.println("5. Exit ");
            option = Utils.getInt("Please choose one option:");
            switch (option) {
                case 1 -> {
                    do {
                        System.out.println("Please choose the type of entry: ");
                        System.out.println("1...<<<<< Student >>>>>> ");
                        System.out.println("2...<<<< Programmer >>>>");
                        System.out.println("3...<<<<<< Worker >>>>>> ");
                        System.out.println("4...<<<<<<< Exit >>>>>>>");
                        number = Utils.getInt("Enter your option: ");
                        switch (number) {
                            case 1 -> records.add(new Student().insert());
                            case 2 -> records.add(new Programmer().insert());
                            case 3 -> records.add(new Worker().insert());
                            case 4 -> System.out.println("Exit program...!");
                            default -> System.out.println("Error! Please choose a value valid menu.");
                        }
                        //System.out.println("Successfully Added!");
                    } while (number != 4);
                }
                case 2 -> {
                    if (records.size() == 0) {
                        System.out.println("There is no records to edit...!");
                    } else {
                        int editId = Utils.getInt("Please input id to edit: ");
                        boolean isRecordFound = false;
                        String objectType = null;
                        for (int i = 0; i < records.size(); i++) {
                            objectType = records.get(i).getObjectType();
                            if (objectType.equalsIgnoreCase("Worker")) {
                                Worker worker = (Worker) records.get(i);
                                if (editId == worker.getId()) {
                                    System.out.println("Record with the id " + editId + " was found at class " + objectType);
                                    isRecordFound = true;
                                    records.set(i, worker.update());
                                }
                            } else if (objectType.equalsIgnoreCase("Programmer")) {
                                Programmer programmer = (Programmer) records.get(i);
                                if (editId == programmer.getId()) {
                                    System.out.println("Record with the id " + editId + " was found in class " + objectType);
                                    isRecordFound = true;
                                    records.set(i, programmer.update());
                                    ;
                                }
                            } else {
                                Student student = (Student) records.get(i);
                                if (editId == student.getId()) {
                                    System.out.println("Record with the id " + editId + " was found in class " + objectType);
                                    isRecordFound = true;
                                    records.set(i, student.update());
                                }
                            }
                        }
                        if (!isRecordFound) System.out.println("Record with the id " + editId + " doesn't exist!");
                        else System.out.println("Successfully Updated " + objectType + " Information!");
                    }
                }
                case 3 -> {//delete record
                    if (records.size() == 0) {
                        System.out.println("There is no records to delete!");
                    } else {
                        int deleteId = Utils.getInt("Please input id to delete: ");
                        boolean isRecordFound = false;
                        String objectType=null;
                        for (int i = 0; i < records.size(); i++) {
                            objectType = records.get(i).getObjectType();
                            if (objectType.equalsIgnoreCase("Worker")) {
                                System.out.println("Record with the id " + deleteId + " was found at class " + objectType);
                                isRecordFound = true;
                                Worker worker = (Worker) records.get(i);
                                if (deleteId == worker.getId()) {
                                    records.remove(worker);
                                }
                            } else {
                                System.out.println("Record with the id " + deleteId + " was found at class " + objectType);
                                isRecordFound = true;
                                Student student = (Student) records.get(i);
                                if (deleteId == student.getId()) {
                                    records.remove(student);
                                }
                            }
                        }
                        if (!isRecordFound)
                            System.out.println("Record with the id " + deleteId + " doesn't exist!");
                        else
                             System.out.println("Successfully Deleted " + objectType + " Information!");
                    }

                }
                case 4 -> {//show all records
                    if (records.size() == 0) {
                        System.out.println("There is no record to show!");
                    } else {
                        for (Service service : records) {
                            service.show();
                        }
                    }
                }
                case 5 -> System.out.println("Exit program...!");
                default -> System.out.println("Error! Please choose a value valid in menu.");
            }
        } while (option != 5);
    }
}

