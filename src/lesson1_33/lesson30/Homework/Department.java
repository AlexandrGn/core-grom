package lesson1_33.lesson30.Homework;

import java.util.HashSet;

public class Department {
    private DepartmentType type;
    private HashSet<Employee> employees;

    public Department(DepartmentType type, HashSet<Employee> employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        String ems = "[[";
        for (Employee e : employees)
            ems += e.getFirstName() + ", ";
        ems += "]]";

        return "Department{" +
                "type=" + type +
                ", employees=" + ems +
                '}';
    }
}
