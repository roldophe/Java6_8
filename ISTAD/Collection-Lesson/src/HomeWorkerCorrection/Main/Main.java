package HomeWorkerCorrection.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Role {
    int id;
    String role;
    Role() {
    }
    Role(int id, String role) {
        this.id = id;
        this.role = role;
    }
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Role> roles = new ArrayList<>() {{
            add(new Role(1, "ADMIN"));
            add(new Role(2, "FARMER"));
            add(new Role(1, "ADMIN"));
            add(new Role(4, "HR"));
        }};
        //print value
        TreeSet<String> unique = new TreeSet<>();
        for (Role role : roles) {
            unique.add(role.role);
        }
//
//        System.out.println("Unique id: "+unique);
//        HashSet<Integer> unique1 = new HashSet<>();
//        for (Role role : roles){
//            unique1.add(role.id);
//        }
//        System.out.println("Unique id: "+unique1);\
        List<Role> userRole = new ArrayList<>();
        int counter = 0;
        for (String roleString : unique) {
            for (Role role : roles) {
                if (roleString.contains(role.role)) {
                    if (counter == role.id) continue;
                    counter = role.id;
                    userRole.add(new Role(role.id, role.role));
                }
            }
        }

        System.out.println("User unique roles is: " + userRole);
        List<Role> testingRole = new ArrayList<>();
        Role firstRole = roles.get(0);
        for (int i = 1; i < roles.size(); i++) {
            if (firstRole != roles.get(i)) {
                testingRole.add(roles.get(i));
            }
        }
        System.out.println("Testing roles: " + testingRole);
    }
}
