package DataTypes;

public class primitiveDataTypes {
    public static void main(String[] args) {
        //Primitive Data Types
        boolean isValid = false;
        char letter = 'A';
        int value = 123;
        long moreValue = 67;
        float testing = 3.14f;
        double demo = 98.9;

        System.out.println("isValid : " + isValid);
        System.out.println("letter: " + letter);
        System.out.println("value: " + value);
        System.out.println("moreValue: " + moreValue);
        System.out.println("testing: " + testing);
        System.out.println("demo: " + demo);

        System.out.println("-----------");
        //casting
        value = (int) testing;
        letter = 151;
        letter = (char) moreValue;

        System.out.println("Value: " + value);
        System.out.println("Char Test: " + letter);


        System.out.println("-------------------");
        //Wrapper class
        Character character;
        Boolean isAvailable;
        Float average;
        Double doubleValue;
        System.out.println(Integer.toBinaryString(9));
    }

}
