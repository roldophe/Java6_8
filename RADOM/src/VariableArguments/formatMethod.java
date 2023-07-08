package VariableArguments;

public class formatMethod {
    public static void main(String[] args) {
        String siteName="Programiz.com";
        int empCount =6;
        String type = "tutorial website";
        System.out.println(String.format("Site Name: %s, Emp Count: %d Type: %s",siteName,empCount,type));

        //Cleanup code
        System.out.printf("Site Name: %s, Emp Count: %d Type: %s%n",siteName,empCount,type);
    }
}
