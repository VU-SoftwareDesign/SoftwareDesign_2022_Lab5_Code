package softwaredesign.projectManager;

import java.util.ArrayList;
import java.util.List;

public class ExternalEmployee extends Employee {
    private PaymentType paymentType;
    private double paymentSum;

    public enum PaymentType {
        HOURLY,
        LUMP_SUM
    }

    public ExternalEmployee(String name, double maxWorkHours, List<Skill> skills, PaymentType paymentType, double paymentSum) {
        super(EmployeeFactory.EmployeeType.External,name, maxWorkHours, skills);
        this.paymentType = paymentType;
        this.paymentSum = paymentSum;
    }

    public ExternalEmployee(String name, double maxWorkHours, List<Skill> skills) {
        super(EmployeeFactory.EmployeeType.External,name, maxWorkHours, skills);
        this.paymentType = PaymentType.LUMP_SUM;
        this.paymentSum = 0;
    }

    public ExternalEmployee(String name) {
        super(EmployeeFactory.EmployeeType.External, name);
        this.paymentSum = 0;
        this.paymentType = PaymentType.LUMP_SUM;
    }

    public Employee setPaymentType(PaymentType type) {
        return new ExternalEmployee(getName(), getHours(), getSkills(), type, paymentSum);
    }

    public PaymentType getPaymentType(PaymentType type) {
        return this.paymentType;
    }

    public Employee setPaymentSum(double sum) {
        return new ExternalEmployee(getName(), getHours(), getSkills(), paymentType, sum);
    }

    public double getPaymentSum() {
        return this.paymentSum;
    }
}
