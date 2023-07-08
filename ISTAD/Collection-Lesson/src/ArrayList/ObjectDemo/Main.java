package ArrayList.ObjectDemo;

import java.util.ArrayList;
import java.util.List;

class Gamer {
    String name;
    String gender;
    String typeOfGame;

    Gamer(String name, String gender, String typeOfGame) {
        this.name = name;
        this.gender = gender;
        this.typeOfGame = typeOfGame;
    }
    static int count=0;
    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", typeOfGame='" + typeOfGame + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Gamer> gamers = new ArrayList<>() {
            {
                add(new Gamer("ROLDOPHE", "male", "Jx2"));
                add(new Gamer("Enzo", "male", "Mobile"));
                add(new Gamer("Louiz", "female", "Mobile"));
            }
        };

        gamers.add(new Gamer("RADOM","male","AK"));
        System.out.println("All gamers: " + gamers);


    }
}
