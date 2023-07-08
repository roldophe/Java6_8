package InstanceMethod;
/*
1. reference to static method
2.reference to instance method
3.  reference to constructor
 */

interface IMockUp {
    void dateSource();
}

class DataSource {
    void allUserData() {
        System.out.println("Getting all user data!");
    }

    void category() {
        System.out.println("Getting all categories data!");
    }
}

public class Main {
    public static void main(String[] args) {
//        IMockUp obj = ()-> System.out.println("Getting data from mockup");
//        obj.dateSource();

        //reference to instance method
        DataSource dataSource = new DataSource();
//        dataSource.allUserData();
//        dataSource.category();

        IMockUp obj = dataSource::allUserData;
        obj.dateSource();
        IMockUp obj2 = dataSource::category;
        obj2.dateSource();
        System.out.println("-------------------------------------");
        //reference to instance method
        IMockUp obj3 = new DataSource()::category;
        IMockUp obj4 = new DataSource()::allUserData;
        obj3.dateSource();
        obj4.dateSource();
        System.out.println("-------------------------------------");

        String message = " " +
                "hello there" +
                "i am happy to tell you that" +
                "i am happy!";
        //textblock
        String newMessage = """
                 hello there
                 i am happy to tell you that
                 i am happy!"
                """;

        System.out.println("-----------------------------");
        System.out.println(message);
        System.out.println(newMessage);
    }
}
