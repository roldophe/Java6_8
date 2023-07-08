package Class;

public class Worker {
    //State or Field(variables)
    //Always have default value
    int id;
    String name;
    String gender;
    float wage;
    float hour;

    //Method// or behavior
    float findSalary() {
        return hour * wage;
    }
    @Override
    public String toString() {
        return "Worker[" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", wage=$" + wage + ", hour=" + hour + ", Salary=$" + findSalary() + ']';
    }
}
