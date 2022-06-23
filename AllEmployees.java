public class AllEmployees {
    private Employee[] arr;
    private int current;

    public AllEmployees(Employee[] arr, int current) {
        this.arr = arr;
        this.current = current;
    }

    public int numSupervisor() {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            Employee currEmp = arr[i];

            if(currEmp instanceof Supervisor) {
                count++;
            }
        }

        return count;
    }

    public Employee getNewNurse(String nurseType) {
        int nurseNum = 0;
        Employee newNurse = null;

        for (int i = 0; i < arr.length; i++) {
            Employee currEmp = arr[i];

            if (currEmp instanceof Nurse && currEmp.getNum() > nurseNum) {
                nurseNum = currEmp.getNum();
                newNurse = currEmp;
            }
        }

        return newNurse;
    }
}
