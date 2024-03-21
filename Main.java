
import java.util.Scanner;

/**
 *
 * @author Abdul Rahman Jainun
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Student details
        System.out.println("masukan Nama Anda:");
        String studentName = scanner.nextLine();
        System.out.println("Masukan Alamat Siswa:");
        String studentAddress = scanner.nextLine();

        Student student = new Student(studentName, studentAddress);

        // Input Teacher details
        System.out.println("Masukan Nama Guru:");
        String teacherName = scanner.nextLine();
        System.out.println("Masukan Alamat Guru:");
        String teacherAddress = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAddress);

        // Simulate adding courses for student and teacher
        System.out.println("Masukkan jumlah mata kuliah untuk siswa:");
        int numStudentCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numStudentCourses; i++) {
            System.out.println("Masukkan Mata Kuliah " + (i + 1) + " Untuk Mahasiswa:");
            String studentCourse = scanner.nextLine();
            student.addCourse(studentCourse);
        }

        System.out.println("Masukkan jumlah kursus untuk guru:");
        int numTeacherCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numTeacherCourses; i++) {
            System.out.println("Masuk mata kuliah " + (i + 1) + " Untuk Guru:");
            String teacherCourse = scanner.nextLine();
            teacher.addCourse(teacherCourse);
        }

        // Simulate adding grades for teacher
        for (String course : teacher.courses) {
            System.out.println("Masukkan nilai untuk kursus " + course + ":");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            teacher.addCourseGrade(course, grade);
        }

        // Output student and teacher details
        System.out.println("Detail siswa:");
        System.out.println(student);

        System.out.println("Detail Guru:");
        System.out.println(teacher);

        // Output average grade for teacher
        System.out.println("Nilai Rata-Rata untuk Guru: " + teacher.getAverageGrade());

        scanner.close();
    }
}
