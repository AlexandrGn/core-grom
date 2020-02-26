package lesson1_33.lesson30.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {
    private static HashSet<Employee> employees = new HashSet<>();

    public static void addAll(Collection<Employee> collection) {
        employees.addAll(collection);
    }

    public static Employee add(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public static Employee delete(Employee employee) {
        employees.remove(employee);
        return employee;
    }

    public static ArrayList<Employee> employeesByProject(String projectName) {
        ArrayList<Employee> newEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            for (Project project : employee.getProjects())
                if (project.getName().equals(projectName)) {
                    newEmployees.add(employee);
                    break;
                }
        }

        return newEmployees;
    }

    public static ArrayList<Employee> EmployeesWithoutProject() {
        ArrayList<Employee> newEmployees = new ArrayList<>();

        for (Employee e : employees)
            if (e.getProjects().isEmpty())
                newEmployees.add(e);

        return newEmployees;
    }

    public static ArrayList<Employee> employeesByDepartmentWithoutProject(Department department) {
        ArrayList<Employee> newEmployees = new ArrayList<>();

        for (Employee employee : department.getEmployees())
            if (employee.getProjects().isEmpty())
                newEmployees.add(employee);

        return newEmployees;
    }

    public static Set<Employee> employeesByTeamLead(Employee lead) throws Exception {
        if (!lead.getPosition().equals(Position.TEAM_LEAD))
            throw new Exception("no lead");

        Set<Employee> newEmployees = new HashSet<>();
        for (Project pr : lead.getProjects())
            newEmployees.addAll(EmployeeDAO.employeesByProject(pr.getName()));

        newEmployees.remove(lead);
        return newEmployees;
    }

    public static Set<Employee> teamLeadsByEmployee(Employee employee) {

        //можливо сам employee и лидер групп
        Set<Employee> leads = new HashSet<>();

        for (Project project : employee.getProjects())
            for (Employee employee1 : EmployeeDAO.employeesByProject(project.getName()))
                if (employee1.getPosition().equals(Position.TEAM_LEAD)) {
                    leads.add(employee1);
                    break;
                }

        return leads;
    }

    public static Set<Employee> employeesByProjectEmployee(Employee employee) {
        Set<Employee> newEmployees = new HashSet<>();

        for (Project project : employee.getProjects())
            newEmployees.addAll(EmployeeDAO.employeesByProject(project.getName()));

        newEmployees.remove(employee);
        return newEmployees;
    }

    public static Set<Employee> employeesByCustomerProjects(Customer customer) {
        Set<Employee> newEmployees = new HashSet<>();

        for (Project project : ProjectDAO.projectsByCustomer(customer))
            newEmployees.addAll(EmployeeDAO.employeesByProject(project.getName()));

        return newEmployees;
    }

    public static String toStringStatic() {
        return "EmployeeDAO{" +
                "employees=" + employees +
                '}';
    }
}
