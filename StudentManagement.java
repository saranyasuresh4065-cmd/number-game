import java.util.ArrayList;
import java.util.Scanner;
class Student {
    String name;
    int roll;
    String grade;
    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n.... Student Management System .....");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    if (name.equals("") || grade.equals("")) {
                        System.out.println("Error: Fields cannot be empty!");
                        break;
                    }
                    list.add(new Student(name, roll, grade));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        for (Student s : list) {
                            s.display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : list) {
                        if (s.roll == searchRoll) {
                            s.display();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll No to remove: ");
                    int removeRoll = sc.nextInt();
                    boolean removed = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).roll == removeRoll) {
                            list.remove(i);
                            System.out.println("Student removed successfully!");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}