import java.util.*;

public class StudentMarksManagementSystemUsingArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];
        int ind = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (ind >= n) {
                        System.out.println("Cannot add more students, array is full.");
                        break;
                    }
                    System.out.println("Enter the name of the student:");
                    String name = sc.nextLine();
                    System.out.println("Enter the marks of the student (1-100):");
                    int mark = sc.nextInt();
                    if (mark >= 1 && mark <= 100) {
                        names[ind] = name;
                        marks[ind] = mark;
                        ind++;
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Invalid marks. Student not added.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the name of student to remove:");
                    String removeName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < ind; i++) {
                        if (names[i].equals(removeName)) {
                            found = true;
                            for (int j = i; j < ind - 1; j++) {
                                names[j] = names[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            names[ind - 1] = null;
                            marks[ind - 1] = 0;
                            ind--;
                            System.out.println("Student removed successfully.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of student to update marks:");
                    String updateName = sc.nextLine();
                    boolean updated = false;
                    for (int i = 0; i < ind; i++) {
                        if (names[i].equals(updateName)) {
                            System.out.println("Enter the new marks (1-100):");
                            int newMarks = sc.nextInt();
                            if (newMarks >= 1 && newMarks <= 100) {
                                marks[i] = newMarks;
                                System.out.println("Marks updated successfully.");
                            } else {
                                System.out.println("Invalid marks. Update cancelled.");
                            }
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Displaying all students:");
                    if (ind == 0) {
                        System.out.println("No students to display.");
                    } else {
                        for (int i = 0; i < ind; i++) {
                            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }

        sc.close();
    }
}
