public class Patient extends HospitalEntity {
    double heartrate;
    
    public Patient(String id,  Health_Status status, String n, double heartrate) {
        this.heartrate = heartrate;
        super(id, status, n);
    }

    public String reportVitals() {
        return "[Vitals]: Heart Rate is " + heartrate;
    }

    public String getDetails() {
        return super.getDetails() + "\n" + reportVitals();
    }
}