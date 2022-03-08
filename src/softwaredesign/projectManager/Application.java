package softwaredesign.projectManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application implements Iterable<Project> {
    private final List<Project> projects;

    public Application() {
        projects = new ArrayList<>();
    }

    public Application(List<Project> projects) {
        this.projects = new ArrayList<>(projects);
    }

    public void addProject(Project proj) {
        projects.add(proj);
    }

    public void removeProject(Project proj) {
        projects.remove(proj);
    }

    @Override
    public Iterator<Project> iterator() {
        return projects.iterator();
    }
}
