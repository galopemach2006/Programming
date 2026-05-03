package PracticeMachineProblem.MachineProblem1;

public class HonorStudent extends Student {
    private String award;

    public HonorStudent(String name, int[] grades, String award) {
        super(name, grades);
        this.award = award;
    }
    public String getAward() {
        return award;
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + "\n" + "Award: " + award;
    }
}