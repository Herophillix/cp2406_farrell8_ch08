public class CollegeCourse {
    private String courseId;
    private int creditHour;
    private char grade;

    public CollegeCourse(String courseId, int creditHour)
    {
        this.courseId = courseId;
        this.creditHour = creditHour;
        this.grade = '-';
    }

    public String GetCourseID() { return courseId; }
    public int GetCreditHour() { return creditHour; }
    public char GetGrade() { return grade; }

    public void SetCourseID(String courseId) { this.courseId = courseId; }
    public void SetCreditHour(int creditHour) { this.creditHour = creditHour; }
    public boolean SetGrade(char grade)
    {
        if(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')
        {
            this.grade = grade;
            return true;
        }
        return false;
    }
}
