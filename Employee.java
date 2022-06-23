public abstract class Employee {
    private static int lastEmp = 0;

    private int num;
    private String name;

    public Employee(String name) {
        this.num = ++lastEmp;
        this.name = name;
    }
}
