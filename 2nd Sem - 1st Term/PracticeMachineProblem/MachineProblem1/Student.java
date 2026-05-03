package PracticeMachineProblem.MachineProblem1;


public class Student {
    private String name;
    private int[] grades;

    public Student(String  name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public int [] getGrades(){
        return grades;
    }

    public int getAverage() {
        int sum = 0;
        for (int i: grades) {
            sum += i;
        }
        sum = sum / grades.length;
        return sum;
    }
    public String displayInfo() {
        return "Name: " + this.name;
    }
}


