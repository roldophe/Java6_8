package StreamLession;

import StreamLession.Model.Student;
import Utils.Helper;

import java.util.*;

public class SystemManagement {
    static void outputFrame(String tittle) {
        System.out.println("**************<<<<<" + tittle + ">>>>>**************");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> allStudents = new ArrayList<>() {{
            add(new Student(121, "RADOM SMP", "Male", "Java", new ArrayList<>(Arrays.asList(79f, 75f, 84f, 89f))));
            add(new Student(102, "ROLDOPHE BPL", "Male", "Spring", new ArrayList<>(Arrays.asList(71f, 75f, 84f, 89f))));
            add(new Student(101, "RachNa TK", "Female", "C#", new ArrayList<>(Arrays.asList(86f, 75f, 54f, 69f))));
            add(new Student(104, "Mario BKK", "Female", "PHP", new ArrayList<>(Arrays.asList(79f, 75f, 84f, 89f))));
            add(new Student(107, "Liza Oscar", "Female", "Java", new ArrayList<>(Arrays.asList(85f, 77f, 67f, 81f))));
        }};
        int option;
        do {
            System.out.println("1.  Insert new Student");
            System.out.println("2.  Edit Student Information");
            System.out.println("3.  Show Student information");
            System.out.println("4.  Remove new Student ");
            System.out.println("5.  Search Student Information");
            System.out.println("6.  Exit");
            option = Helper.readInt(scanner, ">>>>>>>Choose your option: ", null);
            switch (option) {
                case 1: {
                    outputFrame("Insert new Student Information");
                    allStudents.add(new Student().insertStudent(scanner, allStudents));
                    System.out.println("Successfully added new record!!");
                }
                break;
                case 2: {
                    outputFrame("Update Student Information");
                }
                break;
                case 3: {
                    int searchOption;
                    do {
                        outputFrame("Show Student Information");
                        System.out.println("1. Show in insertion order");
                        System.out.println("2.  Show in ascending order(By Id)");
                        System.out.println("3.  Show in descending order(By Average)");
                        System.out.println("4.  Show top student(s) ");
                        System.out.println("5.  Exit");
                        System.out.println(">>>Choose your search option:: ");
                        searchOption = scanner.nextInt();
                        switch (searchOption) {

                            case 1:
                                outputFrame(" All Student Insertion Order ");
                                for (Student student : allStudents) {
                                    student.outputStudent();
                                }
                                //allStudents.forEach(student -> student.outputStudent());
                                break;
                            case 2:
                                outputFrame("All Student ascending order(By ID)");
                                allStudents.stream().sorted((s1, s2) -> s1.getId() - s2.getId()).forEach(e -> e.outputStudent());
                                //allStudents.stream().sorted(Comparator.comparingDouble(Student::getId)).forEach(e -> e.outputStudent());
                                break;
                            case 3:
                                outputFrame(" All student descending order (by Average)");
                                //allStudents.stream().sorted((s1,s2)->s2.findAverage()-s1.findAverage()).forEach(e->e.outputStudent());
                                allStudents.stream().sorted(Comparator.comparing(Student::findAverage).reversed()).forEach(e -> e.outputStudent());
                                break;
                            case 4:
                                outputFrame("Student(s) with Highest scores");
//                                Optional<Student> maxStudent = allStudents.stream().max(Comparator.comparingDouble(Student::findAverage));
//                                if (maxStudent.isPresent()) {
//                                    maxStudent.get().outputStudent();
//                                }
                                /*find max value */
                                float max = allStudents.stream().max(Comparator.comparingDouble(Student::findAverage)).map(Student::findAverage).orElse(0f);
                                allStudents.stream().filter(e -> e.findAverage() == max).forEach(e -> e.outputStudent());
                                break;
                            case 5:
                                System.out.println("Exit from the program...");
                                break;
                            default:
                                System.out.println("Please input a value valid menu...!");
                        }
                    } while (searchOption != 5);
                }
                break;
                case 4: {
                    outputFrame("Remove Student Information");
                    break;
                }
                case 5: {
                    int showOption;
                    do {
                        outputFrame("Search Student Information");
                        System.out.println("1. Search student by id : ");
                        System.out.println("2. Search student by name : ");
                        System.out.println("3. Search student by gender: ");
                        System.out.println("4. Search student by classname :");
                        System.out.println("5. Exit ");
                        System.out.print(">>>>>>>>>Choose your option from 1-5: ");
                        showOption = scanner.nextInt();
                        switch (showOption) {
                            case 1:
                                outputFrame("SEARCH  STUDENT BY ID");
                                System.out.println("Enter student id to search: ");
                                int searchID = scanner.nextInt();
                                Student resultStudent = allStudents.stream().filter(s -> s.getId() == searchID).findFirst().orElse(null);
                                if (resultStudent != null) {
                                    resultStudent.outputStudent();
                                } else {
                                    System.out.println("Student with id =" + searchID + " search not found!");
                                }
                                break;
                            case 2:
                                outputFrame("SEARCH  STUDENT BY NAME");
                                System.out.print("Enter name to search: ");
                                scanner.nextLine();
                                String SearchName = scanner.nextLine();
                                List<Student> students = allStudents.stream().filter((e) -> e.getName().toLowerCase().startsWith(SearchName.toLowerCase())).toList();
                                if (students.size() == 0) {
                                    System.out.println("There student record not found!");
                                } else {
                                    for (Student student : students) {
                                        student.outputStudent();
                                    }
                                }
                                break;
                            case 3:
                                outputFrame("SEARCH  STUDENT BY GENDER");
                                System.out.println("Enter gender to search: ");
                                scanner.nextLine();
                                String searchGender = scanner.nextLine();
                                List<Student> studentByGender = allStudents.stream().filter(e -> e.getGender().toLowerCase().startsWith(searchGender.toLowerCase())).toList();
                                if (studentByGender.size() == 0) {
                                    System.out.println("There is no student in record");
                                } else {
                                    studentByGender.forEach(Student::outputStudent);
                                }
                                break;
                            case 4:
                                outputFrame("SEARCH  STUDENT BY CLASSROOM");
                                System.out.println("Enter classroom to search: ");
                                scanner.nextLine();
                                String searchClass = scanner.nextLine();
                                List<Student> studentByClass = allStudents.stream().filter(s -> s.getClassroom().equalsIgnoreCase(searchClass)).toList();
                                if (studentByClass.size() == 0) {
                                    System.out.println("There is no student in class");
                                } else {
                                    studentByClass.forEach(Student::outputStudent);
                                }
                                break;
                            case 5:
                                System.out.println("Exit from the program...");
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    } while (showOption != 5);
                }
                break;
                case 6: {
                    outputFrame("Exit from the program....");
                }
                break;
                default:
                    System.out.println("Error! Please enter a value valid menu.");
            }
        } while (option != 6);
    }
}
