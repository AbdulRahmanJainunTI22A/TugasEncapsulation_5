
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Abdul Rahman Jainun
 */
class Teacher extends Person {
    private int numCourses;
    ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public boolean addCourseGrade(String course, int grade) {
        if (courses.contains(course)) {
            int index = courses.indexOf(course);
            grades.set(index, grade);
            return true;
        }
        return false;
    }

    public void printGrades() {
        System.out.println(Arrays.toString(grades.toArray()));
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;

        int sum = 0;
        sum = grades.stream().map((grade) -> grade).reduce(sum, Integer::sum);
        return (double) sum / grades.size();
    }

    public boolean addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            grades.add(0); // Initialize grade to 0
            numCourses++;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            int index = courses.indexOf(course);
            courses.remove(index);
            grades.remove(index);
            numCourses--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
    
}
