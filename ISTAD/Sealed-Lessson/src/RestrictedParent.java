public sealed class RestrictedParent permits ChildA, ChildB {
    String message;
    void restrictedMethod(){
        System.out.println("This is a method in inside restrict method!");
    }
}
