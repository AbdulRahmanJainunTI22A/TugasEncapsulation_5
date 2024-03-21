
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADVAN
 */
class Student extends Person {
    private int numCourses;
    private final ArrayList<String> courses;

    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            numCourses++;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            numCourses--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

    

