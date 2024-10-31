import java.util.ArrayList;

public class Courses {
    private ArrayList<String> courses = new ArrayList<>();

    // Adds a course to the list
    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course " + course + " added successfully.");
    }

    // Deletes a course from the list
    public boolean deleteCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("Course " + course + " deleted successfully.");
            return true;
        } else {
            System.out.println("Course " + course + " not found.");
            return false;
        }
    }

    // Displays all courses in the list
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Current Courses:");
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i));
            }
        }
    }
}
