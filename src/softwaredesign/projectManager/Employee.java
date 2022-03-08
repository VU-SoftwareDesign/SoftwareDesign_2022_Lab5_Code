package softwaredesign.projectManager;
import java.util.*;
import java.util.UUID;
import java.util.ArrayList; // import the ArrayList class

public abstract class Employee {

    private String name;
    private UUID uuid;
    private double workedHours;
    private List<Skill> skills;
    protected EmployeeFactory.EmployeeType type;

    //Limit maxWorkHours to 40, add a boolean to ensure it does not top it.

    public Employee(EmployeeFactory.EmployeeType type, String name, double maxWorkHours, List<Skill> skills) {
        this.name = name;
        this.workedHours = maxWorkHours;
        this.skills = skills;
        this.uuid = UUID.randomUUID();
        this.type = type;
    }

    //Extra constructor
    public Employee(EmployeeFactory.EmployeeType type, String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.workedHours = 0D;
        this.skills = new ArrayList<>();
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public Double getHours() {
        return this.workedHours;
    }

    public List<Skill> getSkills() {
        return new ArrayList<>(this.skills);
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public Employee setName(String newName) {
        return EmployeeFactory.getEmployee(type, newName, workedHours, skills).copyAdditionalFields(this);
    }

    public Employee setHours(Double hours) {
        return EmployeeFactory.getEmployee(type, name, hours, skills).copyAdditionalFields(this);
    }

    public Employee setSkills(List<Skill> newSkills) {
        return EmployeeFactory.getEmployee(type, name, workedHours, new ArrayList<>(newSkills)).copyAdditionalFields(this);
    }

    public Employee removeSkill(Skill skill) {
        ArrayList<Skill> skillsCopy = new ArrayList<>(this.getSkills());
        skillsCopy.remove(skill);
        return EmployeeFactory.getEmployee(type, name, workedHours, skillsCopy).copyAdditionalFields(this);
    }

    public Employee addSkill(Skill skill) {
        ArrayList<Skill> skillsCopy = new ArrayList<>(this.getSkills());
        skillsCopy.add(skill);
        return EmployeeFactory.getEmployee(type, name, workedHours, skillsCopy).copyAdditionalFields(this);
    }

    protected abstract Employee copyAdditionalFields(Employee old);


    public String print () {
        String messageToBePrinted = "Employee name:" + this.name + "\nHours worked: " + this.workedHours + "\nSkills: ";
        System.out.print(messageToBePrinted);

        for (Skill currentSkill : this.skills) {
            System.out.print(currentSkill.getName() + " ");
        }
        System.out.println("\n");
        return messageToBePrinted;
    }
}

