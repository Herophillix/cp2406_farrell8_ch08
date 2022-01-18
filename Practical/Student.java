public class Student {
    private int id;
    private CollegeCourse[] collegeCourses;

    public Student(int id, CollegeCourse[] collegeCourses)
    {
        this.id = id;
        this.collegeCourses = collegeCourses;
    }

    public int GetStudentID() { return id; }
    public CollegeCourse GetCollegeCourse(int index)
    {
        if(index >= 0 && index < collegeCourses.length)
            return collegeCourses[index];
        return null;
    }

    public void SetStudentID(int id) { this.id = id; }
    public void SetCollegeCourse(CollegeCourse collegeCourse, int index)
    {
        if(index >= 0 && index < collegeCourses.length)
            collegeCourses[index] = collegeCourse;
    }

    public int GetCollegeCourseNum() { return collegeCourses.length; }
}
