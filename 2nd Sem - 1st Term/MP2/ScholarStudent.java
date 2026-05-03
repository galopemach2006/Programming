package MP2;

public class ScholarStudent extends Student implements Discountable{
    double discountRate;

    public ScholarStudent(final int StudentID, int tuitionFee, YearLevel year, String name, String course, double discountRate, int[] grade, String status) {
        super(StudentID, tuitionFee, year, name, course, grade, status);
        this.discountRate = discountRate;
    }

    public double averageGrade() {
        double sum = 0;
        for (int i: grade) {
            sum += i;
        }
        sum = sum / grade.length;
        return sum;
    }

    public double calculateTuition() {
        double payableamount = tuitionFee - (tuitionFee * (discountRate / 100));
        return payableamount;
    }

    public double applyScholarship(double percentage) {
        Discountable d = (g) -> calculateTuition();
        return d.applyScholarship(averageGrade());
    }
    
    public String displayInfo() {
        return super.displayInfo() + " | Year: " 
                                + year + "\nAverage Grade: " 
                                + averageGrade() + "\nStatus: " 
                                + status + " | Total Tuition: " 
                                +  calculateTuition() 
                                + " | Discounted Tuition: " 
                                + applyScholarship(averageGrade());
    }
}
