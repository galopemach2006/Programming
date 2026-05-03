public abstract class HospitalEntity implements Monitorable{
    String id;
    Health_Status status;
    String n;

    public HospitalEntity(String id, Health_Status status, String n) {
        assert id.startsWith("HOS-");
        this.id = id;
        this.status = status;
        this.n = n;
    }

    public String getDetails() {
        return "Entity: Patient " + n + " | " + "Status: " + status;
    }
}