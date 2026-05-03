public class Ventilator extends HospitalEntity {
    Integer oxygenPressure;

    public Ventilator(String id, Health_Status status, String n, Integer oxygenPressure) {
        super(id, status, n);
        this.oxygenPressure = oxygenPressure;
        
    }

    public String reportVitals() {
        return "[Vitals]: Oxygen Pressure is " + oxygenPressure + " PSI";
    }

    public String getDetails() {
        return super.getDetails() + "\n" + reportVitals();
    }
}