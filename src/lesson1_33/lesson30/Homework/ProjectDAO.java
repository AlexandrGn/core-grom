package lesson1_33.lesson30.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ProjectDAO {
    private static HashSet<Project> projects = new HashSet<>();

    public static void addAll(Collection<Project> collection) {
        projects.addAll(collection);
    }

    public static Project add(Project project) {
        projects.add(project);
        return project;
    }

    public static Project delete(Project project) {
        projects.remove(project);
        return project;
    }


    public static ArrayList<Project> projectsByCustomer(Customer customer) {
        ArrayList<Project> newProjects = new ArrayList<>();

        for (Project project : projects)
            if (project.getCustomer().equals(customer))
                newProjects.add(project);

        return newProjects;
    }

    public static HashSet<Project> projectsByEmployee(Employee employee) {
        return employee.getProjects();
    }

    public static String toStringStatic() {
        return "EmployeeDAO{" +
                "projects=" + projects +
                '}';
    }
}
