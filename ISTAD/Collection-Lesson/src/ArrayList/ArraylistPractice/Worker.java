package ArrayList.ArraylistPractice;

public class Worker implements Service{
    private int id;
    private String name;
    private String gender;
    private int age;
    private float wage;
    private float hours;
    Worker(){}
    public Worker(int id, String name, String gender, int age, float wage, float hours){

        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.wage=wage;
        this.hours=hours;
    }

    public int getId() {
        return id;
    }

    public float tax(){
        float salary = income();
        return ((salary >= 1000) ? getGender().equalsIgnoreCase("female") ? salary * 0.03f : salary * 0.05f: salary);
    }
    public float income(){
        return wage*hours;
    }
    public String getGender() {
        return this.gender;
    }
    @Override
    public Worker insert() {
        System.out.println("======<<<<Please insert Worker Information>>>>======");
        id= Utils.getInt("\tInput id: ");
        name=Utils.getString("\tInput name: ");
        gender=Utils.getString("\tInput gender: ");
        age=Utils.getInt("\tInput age: ");
        wage = Utils.getFloat("\tInput wage: ");
        hours = Utils.getFloat("\tInput hours:");
        return this;
    }
    @Override
    public Worker update() {
        name=Utils.getString("\tInput name: ");
        gender=Utils.getString("\tInput gender: ");
        age=Utils.getInt("\tInput age: ");
        wage = Utils.getFloat("\tInput wage: ");
        hours = Utils.getFloat("\tInput hours:");
        return this;
    }
    @Override
    public void show() {
        System.out.println("=========<<<<Worker Information>>>>=======");
        System.out.println("\t\tID: "+id);
        System.out.println("\t\tName: "+name);
        System.out.println("\t\tGender: "+gender);
        System.out.println("\t\tAge: "+age);
        System.out.println("\t\tWage: "+wage);
        System.out.println("\t\tHour: "+hours+((hours>10)? "hours":"hour"));
        if (income()<1000){
            System.out.println("\t\tSalary: "+income()+"$ (Tax:0%)");
        }
        else {
            System.out.println("\t\tIncome: "+income()+"$");
            System.out.println("\t\tTax "+(getGender().equalsIgnoreCase("female")?"(3%):":"(5%):")+tax()+"$");
            System.out.println("\t\tSalary: $"+(income()-tax()));
        }
    }
    @Override
    public String getObjectType() {
        return this.getClass().getSimpleName();
    }
}
