package softwaredesign.projectManager;
import java.util.*;
import java.util.UUID;
import java.util.ArrayList; // import the ArrayList class

public abstract class Employee {

    private String name;
    private UUID uuid;
    private double workedHours;
    private List<Skill> skills;

    //Limit maxWorkHours to 40, add a boolean to ensure it does not top it.

    public Employee(String name, double maxWorkHours, List<Skill> skills) {
        this.name = name;
        this.workedHours = maxWorkHours;
        this.skills = skills;
        this.uuid = UUID.randomUUID();
    }

    //Extra constructor
    public Employee(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.workedHours = 0D;
        this.skills = new ArrayList<>();
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setHours(Double hours) {
        this.workedHours = hours;
    }

    public Double getHours() {
        return this.workedHours;
    }

    public void setSkills(List<Skill> newSkills) {
        this.skills = new ArrayList<>(newSkills);
    }

    public List<Skill> getSkills() {
        return new ArrayList<>(this.skills);
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public void removeSkill(Skill skill) {
        if (this.skills.contains(skill)) {
            this.skills.remove(skill);
        }
        else {
            System.out.println("Skill not found");
        }
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

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

