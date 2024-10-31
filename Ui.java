import java.util.Scanner;

public class Ui {
    private Courses courses = new Courses();
    private Instructor instructor = new Instructor();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to SEU University!");
        System.out.println("\r\n" + //
                        "                 \r\n" + //
                        "                 \r\n" + //
                        "  ___  ___ _   _ \r\n" + //
                        " / __|/ _ \\ | | |\r\n" + //
                        " \\__ \\  __/ |_| |\r\n" + //
                        " |___/\\___|\\__,_|\r\n" + //
                        "                 \r\n" + //
                        "                 \r\n" + //
                        "");

        while (true) {
            System.out.println("\nAre you a (1) Student or (2) Instructor? Type 'exit' to quit.");
            String userType = scanner.nextLine();

            if (userType.equals("1")) {
                studentMenu();
            } else if (userType.equals("2")) {
                instructorMenu();
            } else if (userType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void studentMenu() {
        while (true) {
            System.out.println("\nStudent Menu - Choose an action: add, delete, display, or back");
            String action = scanner.nextLine();

            if (action.equals("add")) {
                System.out.print("Enter course name to add: ");
                String course = scanner.nextLine();
                courses.addCourse(course);

            } else if (action.equals("delete")) {
                System.out.print("Enter course name to delete: ");
                String course = scanner.nextLine();
                courses.deleteCourse(course);

            } else if (action.equals("display")) {
                courses.displayCourses();

            } else if (action.equals("back")) {
                break;
            } else {
                System.out.println("Invalid action. Try again.");
            }
        }
    }

    private void instructorMenu() {
        while (true) {
            System.out.println("\nInstructor Menu - Choose an action: add, delete, display, view subjects, or back");
            String action = scanner.nextLine();

            if (action.equals("add")) {
                System.out.print("Enter course name to add: ");
                String course = scanner.nextLine();
                courses.addCourse(course);

            } else if (action.equals("delete")) {
                System.out.print("Enter course name to delete: ");
                String course = scanner.nextLine();
                courses.deleteCourse(course);

            } else if (action.equals("display")) {
                courses.displayCourses();

            } else if (action.equals("view subjects")) {
                instructor.displaySubjects();

            } else if (action.equals("back")) {
                break;
            } else {
                System.out.println("Invalid action. Try again.");
            }
        }
    }
}
