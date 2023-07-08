package VarDemo;

class SuperHuman {
    String heroName;
    String ability;
    int age;
    String bread;
    public SuperHuman() {}
    public SuperHuman(String heroName, String ability, int age, String bread) {
        this.heroName = heroName;
        this.ability = ability;
        this.age = age;
        this.bread = bread;
    }
    @Override
    public String toString() {
        return "SuperHuman[" +
                "HeroName :" + heroName +
                ", Ability : " + ability +
                ", Age: " + age +
                ", Bread: " + bread +
                ']';
    }
}

public class Main {
    public static void main(String[] args) {
        var hero1 = new SuperHuman("Batman", "Rich and Smart", 12, "Earthling");
        hero1.age=10;
        System.out.println("Here is the info of hero1:");
        System.out.println(hero1);
    }
}
