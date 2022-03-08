package softwaredesign.projectManager;

import java.util.List;

public class ExternalEmployee extends Employee {
    private PaymentType paymentType;
    private double paymentSum;

    private enum PaymentType {
        HOURLY,
        LUMP_SUM
    }

    public ExternalEmployee(String name, double maxWorkHours, List<Skill> skills, PaymentType paymentType, double paymentSum) {
        super(name, maxWorkHours, skills);
        this.paymentType = paymentType;
        this.paymentSum = paymentSum;
    }

    public ExternalEmployee(String name) {
        super(name);
        this.paymentSum = 0;
        this.paymentType = PaymentType.LUMP_SUM;
    }

    public void setPaymentType(PaymentType type) {
        this.paymentType = type;
    }

    public PaymentType getPaymentType(PaymentType type) {
        return this.paymentType;
    }

    public void setPaymentSum(double sum) {
        this.paymentSum = sum;
    }

    public double getPaymentSum() {
        return this.paymentSum;
    }
}
