public class Main {
    public boolean addPayment(int day, String num, String name, int fuel) {
        boolean ifSucceeded = false;

        if(worked(name, day) && existCar(num) && existDriver(name)) {
            Node<Payment>[] newPayments = new Node<Payment>[this.paymeents.length + 1];

            for (int i = 0; i < this.payments.length; i++) {
                newPayments[i] = this.payments[i];
            }

            Node<Payment> payment = new Node<Payment>(day, num, name, fuel);
            newPayments[newPayments.length - 1] = payment;

            ifSucceeded = true;
            this.payments = newPayments;
        }

        return ifSucceeded;
    }
}
