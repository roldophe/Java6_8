package Inheritance.Animal;

public class Dog extends Animal{

    void showInfo(){
        System.out.println("This is a dog.");
    }
    void display(){
        System.out.println("Dog name is: "+name);
        System.out.println("Dog age is: "+age);
    }

    protected void eat(){
        System.out.println("Dog eat dog's food.");
    }

    @Override
    void showName() {
        System.out.println("This dog is name:"+name);
    }

    void setName(String name){
        this.name=name+"(from dog class)";
    }
    void eatAll(){
        super.eat();
        System.out.println("Eat called from super call.");
    }
}
