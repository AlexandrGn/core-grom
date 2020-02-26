package lesson1_33.lesson30.Homework;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Employee {
    private String firstName;
    private String lastName;
    private Date dateHired;
    private Position position;
    private Department department;
    private HashSet<Project> projects;

    public Employee(String firstName, String lastName, Date dateHired, Position position, Department department, HashSet<Project> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateHired = dateHired;
        this.position = position;
        this.department = department;
        this.projects = projects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public HashSet<Project> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        String prs = "[[";
        for (Project pr : projects)
            prs += pr.getName() + ", ";
        prs += "]]";

        return '\n' + "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateHired=" + dateHired +
                ", position=" + position +
                ", department=" + department.getType() +
                ", projects=" + prs +
                '}';
    }
}
