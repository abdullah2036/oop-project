import java.util.ArrayList;

public class Supervisor {
    private ArrayList<String> subjects = new ArrayList<>();

    public Supervisor() {
        // Initialize with some existing subjects
        subjects.add("DS230 OOP");
        subjects.add("DS231 Intro to Programming");
        subjects.add("MATH150 ");
    }

    // Displays all subjects for the instructor
    public void displaySubjects() {
        System.out.println("Available Subjects for Supervisor:");
        for (String subject : subjects) {
            System.out.println("- " + subject);
        }
    }
}
