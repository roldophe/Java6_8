package Application;

import Model.Student;
import Repositiory.StudentRepository;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentApplication {

    static void renderTable(String title, List<String> options) {
        org.nocrala.tools.texttablefmt.CellStyle cellStyle =
                new org.nocrala.tools.texttablefmt.CellStyle(CellStyle.HorizontalAlign.center);
        org.nocrala.tools.texttablefmt.Table table =
                new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        table.setColumnWidth(0, 50, 60);

        table.addCell(title, cellStyle);
        if (options != null) {
            for (String option : options) {
                table.addCell(option, cellStyle);
            }
        }
        System.out.println(table.render());
    }

    static void readStudentData(List<Student> students) {
        org.nocrala.tools.texttablefmt.CellStyle cellStyle = new org.nocrala.tools.texttablefmt.CellStyle(CellStyle.HorizontalAlign.center);
        org.nocrala.tools.texttablefmt.Table table = new Table(6, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0, 5, 25);
        table.setColumnWidth(1, 20, 25);
        table.setColumnWidth(2, 7, 25);
        table.setColumnWidth(3, 5, 25);
        table.setColumnWidth(4, 10, 25);
        table.setColumnWidth(5, 10, 25);
        table.addCell("ID", cellStyle);
        table.addCell("Name", cellStyle);
        table.addCell("Gender", cellStyle);
        table.addCell("Age", cellStyle);
        table.addCell("ClassRoom", cellStyle);
        table.addCell("Average", cellStyle);
        if ((students != null) && !students.isEmpty() && (students.get(0).getId() > 0)) {
            for (Student student : students) {
                table.addCell(student.getId() + " ", cellStyle);
                table.addCell(student.getName(), cellStyle);
                table.addCell(student.getGender(), cellStyle);
                table.addCell(student.getAge() + " ", cellStyle);
                table.addCell(student.getClassroom(), cellStyle);
                table.addCell(student.getAverage() + " ", cellStyle);
            }
            table.addCell("Total student: ", 2);
            int size = students.size();
            table.addCell("   " + size + (size > 1 ? " students" : " student"), 4);
        } else {
            table.addCell("There are no students matching your search criteria", 6);
        }
        System.out.println(table.render());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> outerOptions = new ArrayList<>() {{
            add("1. Add New Student Information ");
            add("  2. Update Old Student Information");
            add("3. Show All Student Information");
            add("  4. Search Old Student Information");
            add("  5. Delete Old student Information");
            add("6. Quit the student application");
        }};
        int option;
        do {
            List<Student> allStudents = StudentRepository.getALlStudents();
            renderTable("Student Information System", outerOptions);
            System.out.print(">>>Choose one option (1-6): ");
            option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1 -> {
                    renderTable("Add New Student Information", null);
                    Student student = new Student();
                    StudentRepository.setInsertStudent(student.inputStudent(scanner));
                    System.out.println("Successfully Inserted New Student Information.");
                }
                case 2 -> {
                    renderTable("Update Student Information", null);
                    System.out.print("Enter id you want to update: ");
                    int updateId = scanner.nextInt();
                    assert allStudents != null;
                    Student updateStudent = allStudents.stream().filter(e -> e.getId() == updateId).findFirst().orElse(null);
                    if (updateStudent != null) {
                        StudentRepository.setUpdateStudent(updateId, new Student().inputStudent(scanner));
                        System.out.println("Successfully Updated Old Student Information.");
                    } else {
                        System.out.println("Student with id=" + updateId + " does not exist.");
                    }
                }
                case 3 -> {
                    List<String> showOptions = new ArrayList<>((List.of(
                            "1. Show Original Order ",
                            "2. Show Descending Order(ID)",
                            "3. Show Ascending Order (ID)",
                            "4. Show Descending Order (Average)",
                            "5. Show Ascending Order (By Name)",
                            "6. Exit From The Showing Application"
                    )));
                    int showOption;
                    do {
                        allStudents = StudentRepository.getALlStudents();
                        renderTable("Show all Student Information", showOptions);
                        System.out.print("Please choose one option>> ");
                        showOption = scanner.nextInt();
                        switch (showOption) {
                            case 1 -> {
                                renderTable("Show Original Order", null);
                                readStudentData(allStudents);
                            }
                            case 2 -> {
                                renderTable("Show Descending Order(By ID)", null);
                                assert allStudents != null;
                                readStudentData(allStudents.stream().sorted((a, b) -> b.getId() - a.getId()).toList());
                            }
                            case 3 -> {
                                renderTable("Show Ascending Order (By ID)", null);
                                assert allStudents != null;
                                readStudentData(allStudents.stream().sorted(Comparator.comparing(Student::getId)).toList());
                            }
                            case 4 -> {
                                renderTable("Show Descending Order (By Average)", null);
                                assert allStudents != null;
                                readStudentData(allStudents.stream().sorted(Comparator.comparing(Student::getAverage).reversed()).toList());
                            }
                            case 5 -> {
                                renderTable("Show Ascending Order (By Name)", null);
                                assert allStudents != null;
                                readStudentData(allStudents.stream().sorted(Comparator.comparing(Student::getName)).toList());
                            }
                            case 6 -> System.out.println("Exit from the showing application...!");
                            default -> System.out.println("Invalid option! try again...!!");
                        }
                    } while (showOption != 6);
                }
                case 4 -> {
                    List<String> searchOptions = new ArrayList<>((List.of(
                            "1. Search by ID",
                            "2. Search by Name",
                            "3. Search by ClassRoom",
                            "4. Search by Gender",
                            "5. Exit from the searching application."
                    )));
                    int searchOption;
                    do {
                        allStudents = StudentRepository.getALlStudents();
                        renderTable("Search Student Information", searchOptions);
                        System.out.println("Please choose one >>");
                        searchOption = scanner.nextInt();
                        switch (searchOption) {
                            case 1:
                                renderTable("Search Student by Id", null);
                                System.out.print("Enter id you want to search: ");
                                int searchId = scanner.nextInt();
                                assert allStudents != null;
                                List<Student> matchingStudents = allStudents.stream().filter(e -> e.getId() == searchId).toList();
                                System.out.println("Is Empty?: " + matchingStudents.isEmpty());
                                readStudentData(matchingStudents);
                                break;
                            case 2:
                                renderTable("Search Student by Name", null);
                                System.out.print("Enter name you want to search: ");
                                scanner.nextLine();
                                String desiredName = scanner.nextLine();
                                assert allStudents != null;
                                readStudentData(allStudents.stream().filter(e -> e.getName().startsWith(desiredName)).toList());
                                break;
                            case 3:
                                renderTable("Search Student by Classroom", null);
                                System.out.print("Enter classroom you want to search: ");
                                scanner.nextLine();
                                String desiredClassRoom = scanner.nextLine();
                                assert allStudents != null;
                                readStudentData(allStudents.stream().filter(e -> e.getClassroom().startsWith(desiredClassRoom)).toList());
                                break;
                            case 4:
                                renderTable("Search Student by Gender", null);
                                System.out.print("Enter gender you want to search: ");
                                scanner.nextLine();
                                String desiredGender = scanner.nextLine();
                                assert allStudents != null;
                                readStudentData(allStudents.stream().filter(e -> e.getGender().startsWith(desiredGender)).toList());
                                break;
                            case 5:
                                System.out.println("Exit from the searching application...!");
                            default:
                                System.out.println("Invalid option! Try again...!");
                        }
                    } while (searchOption != 5);
                }
                case 5 -> {
                    renderTable("Delete Student Information", null);
                    System.out.print("Enter id you want to delete: ");
                    int deleteId = scanner.nextInt();
                    assert allStudents != null;
                    Student deleteStudent = allStudents.stream().filter(
                            e -> e.getId() == deleteId).findFirst().orElse(null);
                    if (deleteStudent != null) {
                        StudentRepository.deleteStudent(deleteId);
                        System.out.println("Successfully Removed the student!!");
                    } else {
                        System.out.println("Student with id=" + deleteId + " does not exist.");
                    }
                }
                case 6 -> renderTable("Exit From The Student Application...!", null);
                default -> System.out.println("Invalid Option!");
            }
        } while (option != 6);
    }
}
