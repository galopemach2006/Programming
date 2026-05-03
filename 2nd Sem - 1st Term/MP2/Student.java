package MP2;

public abstract class Student {
    final int StudentID;
    double tuitionFee;
    YearLevel year;
    String name, course;
    int[] grade;
    String status;
 
    public Student(final int StudentID, double tuitionFee, YearLevel year, String name, String course, int [] grade, String status) {
        this.StudentID = StudentID;
        this.tuitionFee = tuitionFee;
        this.year = year;
        this.name = name;
        this.course = course; 
        this.grade = grade;
        this.status = status;
    }

    abstract double calculateTuition();

    public String displayInfo() {
        return "[STUDENT RECORD]" + " | ID: " + StudentID +  " | Name: " + name + "| Course: " + course;
    }

}
