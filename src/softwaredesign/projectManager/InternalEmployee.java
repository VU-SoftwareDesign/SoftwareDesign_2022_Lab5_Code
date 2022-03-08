package softwaredesign.projectManager;

import java.util.List;

public class InternalEmployee extends Employee{

    public InternalEmployee(String name, double maxWorkHours, List<Skill> skills) {
        super(name, maxWorkHours, skills);
    }

    public InternalEmployee(String name) {
        super(name);
    }
}
