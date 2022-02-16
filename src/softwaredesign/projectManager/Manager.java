package softwaredesign.projectManager;

import java.util.List;

public class Manager extends Employee{
    private List<Employee> subordinates;

    public Manager(String name, double maxWorkHours, List<Skill> skills) {
        super(name, maxWorkHours, skills);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Manager [subordinates=" + subordinates + ", details=" + super.toString() + "]";
    }
}
