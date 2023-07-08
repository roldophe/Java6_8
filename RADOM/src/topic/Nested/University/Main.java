package topic.Nested.University;

import topic.Nested.University.University.Student;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

class University {
    private String universityName;
    University(String universityName) {
        this.universityName = universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getUniversityName() {
        return universityName;
    }
    public static class Student {
        private String name;
        private int age;
        private String major;

        public Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", major='" + major + '\'' +
                    '}';
        }
    }
    public static class course {
        private String name;
        private int creditHours;
        private List<Student> enrolledStudents;

        public course(String name, int creditHours, List<Student> enrolledStudents) {
            this.name = name;
            this.creditHours = creditHours;
            this.enrolledStudents = enrolledStudents;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCreditHours(int creditHours) {
            this.creditHours = creditHours;
        }

        public void setEnrolledStudents(List<Student> enrolledStudents) {
            this.enrolledStudents = enrolledStudents;
        }

        public String getName() {
            return name;
        }

        public int getCreditHours() {
            return creditHours;
        }

        public List<Student> getEnrolledStudents() {
            return enrolledStudents;
        }

        @Override
        public String toString() {
            return "course{" +
                    "name='" + name + '\'' +
                    ", creditHours=" + creditHours +
                    ", enrolledStudents=" + enrolledStudents +
                    '}';
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj = new University.Student("RADOM",21,"CS");
        System.out.println(obj);
        ArrayList<Student> enrolledStudents = new ArrayList<>();
        enrolledStudents.add(obj);
        University.course course = new University.course("JAVA", 45,enrolledStudents );
        System.out.println(course);
    }
}
