import java.util.*;

public class InputGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for(int i = 0; i < students.length; ++i)
        {
            CollegeCourse[] collegeCourses = new CollegeCourse[5];
            for(int j = 0; j < collegeCourses.length; ++j)
            {
                collegeCourses[j] = new CollegeCourse("CP240" + j, j + 1);
            }
            students[i] = new Student(i + 1, collegeCourses);
        }

        for (Student currentStudent : students) {
            System.out.println("Input grade for Student #" + currentStudent.GetStudentID());
            for (int j = 0; j < currentStudent.GetCollegeCourseNum(); ++j) {
                CollegeCourse collegeCourse = currentStudent.GetCollegeCourse(j);
                System.out.println("Class " + collegeCourse.GetCourseID() + ": ");
                char grade = scanner.nextLine().charAt(0);
                if (!collegeCourse.SetGrade(grade)) {
                    System.out.println("Please input grade again");
                    --j;
                }
            }
        }
    }
}