public class Doctor extends Employee{
    private String specialization;

    public Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }
}
