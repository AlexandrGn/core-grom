package lesson1_33.lesson30.Homework;

import java.util.Collection;
import java.util.HashSet;

public class DepartmentDAO {
    private static HashSet<Department> departments = new HashSet<>();

    public static void addAll(Collection<Department> collection) {
        departments.addAll(collection);
    }

    public static Department add(Department department) {
        departments.add(department);
        return department;
    }

    public static Department delete(Department department) {
        departments.remove(department);
        return department;
    }

    public static String toStringStatic() {
        return "EmployeeDAO{" +
                "departments=" + departments +
                '}';
    }
}
