package ExceptionHandling;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Programmer> programmerList = new ArrayList<>() {{
            add(new Programmer(101, "Enzo", "Male", 21, new ArrayList<>(Arrays.asList("C++", "C#")), 7500));
            add(new Programmer(201, "Enzo", "Male", 12, new ArrayList<>(Arrays.asList("HTML", "CSS")), 8000));
            add(new Programmer(111, "Sally", "female", 31, new ArrayList<>(Arrays.asList("ReactJS", "Next.JS")), 600));
            add(new Programmer(301, "Michiel", "Male", 18, new ArrayList<>(Arrays.asList("JAVA", "Spring")), 2500));
            add(new Programmer(171, "Somalin", "Female", 17, new ArrayList<>(Arrays.asList("Flutter", "Android")), 1300));
        }};
        int option;
        boolean IsRecordFound;
        do {
            Service.outputFrame("MENU");
            System.out.println("    1. Insert Programmer Information    ");
            System.out.println("    2. Edit   Programmer Information    ");
            System.out.println("    3. Show   Programmer Information    ");
            System.out.println("    4. Search Programmer Information    ");
            System.out.println("    5. Remove Programmer Information    ");
            System.out.println("    6. Exit.........................    ");
            option = Service.getInteger(scanner, ">>>>>Choose one option: ", null);
            switch (option) {
                case 1:
                    Service.outputFrame("Insert new programmer information");
                    programmerList.add(new Programmer().insertInformation(scanner, programmerList));
                    System.out.println("Successfully added new record!!");
                    break;
                case 2:
                    Service.outputFrame("Update Programmer Information");
                    if (programmerList.size() == 0) {
                        System.out.println("There is no records to edit...!");
                    } else {
                        IsRecordFound = false;
                        int editId = Service.getInteger(scanner, "Enter id to edit: ", null);
                        for (int i = 0; i < programmerList.size(); i++) {
                            if (editId == programmerList.get(i).getId()) {
                                System.out.println("Record with the id " + editId + " was found!");
                                programmerList.set(i, programmerList.get(i).updateInformation(scanner, programmerList));
                                IsRecordFound = true;
                            }
                        }
                        if (!IsRecordFound) {
                            System.out.println("Search not found!");
                        }
                    }
                    break;
                case 3:
                    int showOption;
                    do {
                        Service.outputFrame("Show Programmer Information");
                        System.out.println("1. Show Programmer ascending (By ID)");
                        System.out.println("2. Show Programmer By Gender (Male) ");
                        System.out.println("3. Show Programmer By Gender (FeMale) ");
                        System.out.println("4. Show Programmer descending (By Age)");
                        System.out.println("5. Show Programmer descending (By Salary)");
                        System.out.println("6. Exit");
                        showOption = Service.getInteger(scanner, ">>>Please a value valid menu: ", null);
                        switch (showOption) {
                            case 1:
                                Service.outputFrame("All Programmer Ascending (By Id)");
                                programmerList.stream().sorted(Comparator.comparing(Programmer::getId)).forEach(Programmer::showInformation);
                                break;
                            case 2:
                                Service.outputFrame("All Programmer Male");
                                programmerList.stream().filter(programmer -> programmer.getGender().equalsIgnoreCase("Male")).forEach(programmer -> programmer.showInformation());
                                break;
                            case 3:
                                Service.outputFrame("All Programmer Female");
                                programmerList.stream().filter(programmer -> programmer.getGender().equalsIgnoreCase("Female")).forEach(Programmer::showInformation);
                                break;
                            case 4:
                                Service.outputFrame("All Programmer Descending (By Age)");
                                programmerList.stream().sorted(Comparator.comparing(Programmer::getAge).reversed()).forEach(Programmer::showInformation);
                                break;
                            case 5:
                                Service.outputFrame("All Programmer Descending (By Salary)");
                                programmerList.stream().sorted(Comparator.comparing(Programmer::getSalary).reversed()).forEach(Programmer::showInformation);
                                break;
                            case 6:
                                System.out.println("Exit from the program...!!");
                                break;
                            default:
                                System.out.println("    Invalid Option!!    ");
                        }
                    } while (showOption != 6);
                    break;
                case 4:
                    Service.outputFrame("Search Programmer Information");
                    int searchOption;
                    do {
                        Service.outputFrame("MANU");
                        System.out.println("1. Search Programmer Information by ID");
                        System.out.println("2. Search Programmer Information by Name");
                        System.out.println("3. Exit ");
                        searchOption = Service.getInteger(scanner, ">>>>>Choose one option: ", null);
                        switch (searchOption) {
                            case 1:
                                Service.outputFrame("Search By ID");
                                int searchId = Service.getInteger(scanner, "Enter id to search: ", null);
                                int isFound = programmerList.stream().map(Programmer::getId).filter(s -> s == searchId).findFirst().orElse(-1);
                                if (isFound == -1) {
                                    System.out.println("Search not found!!");
                                } else {
                                    programmerList.stream().filter(programmer -> programmer.getId() == searchId).forEach(Programmer::showInformation);
                                }
                                break;
                            case 2:
                                Service.outputFrame("Search by Name");
                                scanner.nextLine();
                                String searchName = Service.getString(scanner, "Enter name you want to search: ");
                                String isRecordFound = programmerList.stream().map(Programmer::getName).filter(s -> s.equalsIgnoreCase(searchName)).findFirst().orElse(null);
                                if (isRecordFound == null) {
                                    System.out.println("Search not found!!");
                                } else {
                                    programmerList.stream().filter(programmer -> programmer.getName().equalsIgnoreCase(searchName)).forEach(Programmer::showInformation);
                                }
                                break;
                            case 3:
                                System.out.println("Exit from the program!!");
                                break;
                            default:
                                System.out.println("Invalid option!!");
                        }
                    } while (searchOption != 3);
                    break;
                case 5:
                    IsRecordFound = false;
                    Service.outputFrame("Remove Programmer Information");
                    if (programmerList.size() == 0) {
                        System.out.println("There is no records to remove....!");
                    } else {
                        int removeId = Service.getInteger(scanner, "Enter id you want to remove: ", null);
                        for (int i = 0; i < programmerList.size(); i++)
                            if (programmerList.get(i).getId() == removeId) {
                                System.out.println("Record with id " + removeId + " was found");
                                scanner.nextLine();
                                String IsDeleted = Service.getString(scanner, "Do you want to delete the information?(Yes/No): ");
                                if ("yes".equalsIgnoreCase(IsDeleted)) {
                                    programmerList.remove(programmerList.get(i));
                                    System.out.println("Successfully deleted old record!!");
                                } else {
                                    System.out.println("Delete Statement show successful delete, but does not delete record!!");
                                }
                                IsRecordFound = true;
                            }
                    }
                    if (!IsRecordFound) {
                        System.out.println("Search not found!!");
                    }
                    break;
                case 6:
                    System.out.println("Exit from the program...!");
                    break;
                default:
                    System.out.println("Error! Please input a value valid menu!!");
            }
        } while (option != 6);

    }
}