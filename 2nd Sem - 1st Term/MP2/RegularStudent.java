package MP2;

public class RegularStudent extends Student{

    public RegularStudent(final int StudentID, int tuitionFee, YearLevel year, String name, String course, int[] grade, String status) {
        super(StudentID, tuitionFee, year, name, course, grade, status);
    }

    public double averageGrade() {
        int sum = 0;
        for (int i: grade) {
            sum += i;
        }
        sum = sum / grade.length;
        return sum;
    }

    public double calculateTuition() {
        return tuitionFee;
    }

    public String displayInfo() {
        return super.displayInfo() + " | Year: " + year + "\nAverage Grade: " + averageGrade() + "\nStatus: " + status + " | Total Tuition: " +  calculateTuition();
    }

}
