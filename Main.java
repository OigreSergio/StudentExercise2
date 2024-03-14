import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sergio",22));
        students.add(new Student("Giuseppe",32));
        students.add(new Student("Marco",23));
        students.add(new Student("Lorenzo",24));
        students.add(new Student("Andrea",25));
        students.add(new Student("Francesco",16));
        students.add(new Student("Franco",26));
        students.add(new Student("Michele",35));
        students.add(new Student("Alessandro",44));
        students.add(new Student("GianMarco",12));
        students.add(new Student("Sergiu",33));
        students.add(new Student("Alessio",11));


        Collections.sort(students, Comparator.comparingInt(Student::getAge));

        System.out.println("\nArrayList tidy by age : ");
        printStudents(students);
    }
    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}



