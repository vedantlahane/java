import java.util.*;

public class StudentMarksManagementSystemUsingArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];

        System.out.println("Enter the operation you have to do:");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Update Marks");
        System.out.println("4. Display Students");
        System.out.println("5. Exit");

        int ind = 0;
        boolean flag = true;
        while (flag) {
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the name of the student:");
                    sc.nextLine(); // Consume the newline character
                    String name = sc.nextLine();
                    System.out.println("Enter the marks of the student:");
                    int mark = sc.nextInt();
                    if (mark > 0 && mark <= 100) {

                        if (ind < n) {
                            names[ind] = name;
                            marks[ind] = mark;
                            ind++;
                            System.out.println("Student added successfully.");
                        } else {
                            System.out.println("Cannot add more students, array is full.");
                        }
                    } else {
                        System.out.println("Marks should be between 1 and 100.");
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of student to remove:");
                    sc.nextLine(); // Consume the newline character
                    String removeName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < ind; i++) {
                        if (names[i].equals(removeName)) {
                            found = true;
                            for (int j = i; j < ind - 1; j++) {
                                names[j] = names[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            names[ind - 1] = null; // Clear the last element
                            marks[ind - 1] = 0; // Reset the marks
                            ind--;
                            System.out.println("Student removed successfully.");

                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 3:
                    System.out.println("Enter the name of student to update marks:");
                    sc.nextLine(); // Consume the newline character
                    String updateName = sc.nextLine();
                    boolean updated = false;
                    for (int i = 0; i < ind; i++) {
                        if (names[i].equals(updateName)) {
                            System.out.println("Enter the new marks:");
                            marks[i] = sc.nextInt();
                            updated = true;
                            System.out.println("Marks updated successfully.");

                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:
                    System.out.println("Displaying all students:");
                    for (int i = 0; i < ind; i++) {
                        if (names[i] != null) {
                            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    flag = false;

                default:
                    System.out.println("Invalid operation. Please try again.");

            }
        }
    }
}
