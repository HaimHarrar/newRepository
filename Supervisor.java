public class Supervisor extends Employee {
    private Employee[] arr;
    private int current;

    public Supervisor(String name, Employee[] arr, int current) {
        super(name);
        this.arr = arr;
        this.current = current;
    }
}
