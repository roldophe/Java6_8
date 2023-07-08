package Interface.PracticeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ClientFeatures> records = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("---------------------<< Data Entry System >>-----------------------");
            System.out.println(" 1.  Add Record");
            System.out.println(" 2.  Edit Record");
            System.out.println(" 3.  Delete Record");
            System.out.println(" 4.  Show All Record");
            System.out.println(" 5.  Exit");
            System.out.print(">>> Choose your option (1-5): ");
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    int entryType;
                    System.out.println("Please choose the type of entry: ");
                    System.out.println(" 1>..Worker");
                    System.out.println(" 2>..Athlete");
                    System.out.println(" >>> Enter your option: ");
                    entryType = scanner.nextInt();
                    if (entryType == 1) {
                        //entry worker data
                        //list<Client>
                        records.add(new Worker().addRecord());
                    } else {
                        records.add(new Athlete().addRecord());
                    }
                    System.out.println("Successfully Added!");
                }
                break;
                case 2: {
                    if (records.size() == 0) {
                        System.out.println("There is no record to edit!");
                    } else {
                        int editID;
                        System.out.println("Enter id to update: ");
                        editID = scanner.nextInt();
                        boolean isRecordFound = false;
                        for (int i = 0; i < records.size(); i++) {
                            String objectType = records.get(i).getObjectType();
                            if (objectType.equalsIgnoreCase("Worker")) {
                                //edit worker information
                                Worker editWorker = (Worker) records.get(i);
                                if (editID == editWorker.getWorkerID()) {
                                    //update here
                                    isRecordFound = true;
                                    records.set(i, editWorker.updateRecord());
                                    System.out.println("Successfully Update Worker Information!");
                                }
                            } else {
                                Athlete editAthlete = (Athlete) records.get(i);

                                if (editID == editAthlete.getId()) {
                                    //edit athlete information
                                    isRecordFound = true;
                                    records.set(i, editAthlete.updateRecord());
                                    System.out.println("Successfully Update Athlete Information!");
                                }
                            }
                        }
                        if (!isRecordFound) {
                            System.out.println("Record with the id: " + editID + "doesn't exist!");
                        }
                    }
                }
                break;
                case 3: {

                }
                break;
                case 4: {
                    if (records.size() == 0) {
                        System.out.println("There is no records to show!");
                    } else {
                        for (ClientFeatures clientFeatures : records) {
                            clientFeatures.ShowRecord();
                        }
                    }
                }
                break;
                case 5: {
                    System.out.println("Exit program...");
                }
                break;
                default:
                    System.out.println("Error! Please choose a value valid manu.");
            }
        } while (option != 5);

    }
}
