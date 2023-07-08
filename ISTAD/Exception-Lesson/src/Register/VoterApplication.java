package Register;
import Register.Service.VoterService;

import java.io.IOException;
import java.time.LocalDate;

public class VoterApplication {
    public static void main(String[] args) throws IOException {
        Person person= new Person(1,"RADOM","Male", LocalDate.of(2001,7,5),"No100011771");

        VoterService voterService = new VoterService();
        try {
            voterService.register(person);
            voterService.displayVoters();
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Complete");
    }
}
