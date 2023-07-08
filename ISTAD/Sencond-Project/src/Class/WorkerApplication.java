package Class;

public class WorkerApplication {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.id=101;
        worker.name="RADOM KHOEM";
        worker.gender="Male";
        worker.wage=15;
        worker.hour=30;
        worker.findSalary();
        System.out.println(worker);


        System.out.println("=============test2=============");
        Worker worker1 = new Worker();
        worker1.name = "ROLDOPHE";
        worker1.gender="Male";
        System.out.println(worker1.name+" "+worker1.gender);
    }
}
