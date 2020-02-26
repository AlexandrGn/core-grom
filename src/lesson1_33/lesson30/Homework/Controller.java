package lesson1_33.lesson30.Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Controller {

    public static ArrayList<Employee> employeesByProject(String projectName) {
        System.out.println("-------------------employeesByProject(String projectName)");

        return EmployeeDAO.employeesByProject(projectName);
    }

    public static HashSet<Project> projectsByEmployee(Employee employee) {
        System.out.println("-------------------projectsByEmployee(Employee employee)");

        return ProjectDAO.projectsByEmployee(employee);
    }

    public static ArrayList<Employee> employeesByDepartmentWithoutProject(Department department) {
        System.out.println("-------------------employeesByDepartmentWithoutProject(Department department)");

        return EmployeeDAO.employeesByDepartmentWithoutProject(department);
    }

    public static ArrayList<Employee> employeesWithoutProject() {
        System.out.println("-------------------employeesWithoutProject()");

        return EmployeeDAO.EmployeesWithoutProject();
    }

    public static Set<Employee> employeesByTeamLead(Employee lead) throws Exception {
        System.out.println("-------------------employeesByTeamLead(Employee lead)");

        return EmployeeDAO.employeesByTeamLead(lead);
    }

    public static Set<Employee> teamLeadsByEmployee(Employee employee) {
        System.out.println("-------------------teamLeadsByEmployee(Employee employee)");

        return EmployeeDAO.teamLeadsByEmployee(employee);
    }

    public static Set<Employee> employeesByProjectEmployee(Employee employee) {
        System.out.println("-------------------employeesByProjectEmployee(Employee employee)");

        return EmployeeDAO.employeesByProjectEmployee(employee);
    }

    public static ArrayList<Project> projectsByCustomer(Customer customer) {
        System.out.println("-------------------projectsByCustomer(Customer customer)");

        return ProjectDAO.projectsByCustomer(customer);
    }

    public static Set<Employee> employeesByCustomerProjects(Customer customer) {
        System.out.println("-------------------employeesByCustomerProjects(Customer customer)");

        return EmployeeDAO.employeesByCustomerProjects(customer);
    }


}
