package lesson1_33.lesson30.Homework;

import java.util.Date;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) throws Exception {

        Customer customer1 = new Customer("nameCos1", "ad", 1000);
        Customer customer2 = new Customer("nameCos1", "ad", 1000);
        Customer customer3 = new Customer("nameCos3", "ad", 1000);
        Customer customer4 = new Customer("nameCos4", "ad", 1000);
        Customer customer5 = new Customer("nameCos5", "ad", 1000);
        Customer customer6 = new Customer("nameCos6", "ad", 1000);
        CustomerDAO.add(customer1);
        CustomerDAO.add(customer2);
        CustomerDAO.add(customer3);
        CustomerDAO.add(customer4);
        CustomerDAO.add(customer5);
        CustomerDAO.add(customer6);

        Project project1 = new Project("Project1", customer1);
        Project project2 = new Project("Project2", customer1);
        Project project3 = new Project("Project3", customer2);
        Project project4 = new Project("Project4", customer3);
        Project project5 = new Project("Project5", customer4);
        Project project6 = new Project("Project6", customer4);
        Project project7 = new Project("Project7", customer5);
        Project project8 = new Project("Project8", customer5);
        Project project9 = new Project("Project9", customer1);
        Project project10 = new Project("Project10", customer5);
        ProjectDAO.add(project1);
        ProjectDAO.add(project2);
        ProjectDAO.add(project3);
        ProjectDAO.add(project4);
        ProjectDAO.add(project5);
        ProjectDAO.add(project6);
        ProjectDAO.add(project7);
        ProjectDAO.add(project8);
        ProjectDAO.add(project9);
        ProjectDAO.add(project10);

        HashSet<Employee> dep1 = new HashSet<>();
        HashSet<Employee> dep2 = new HashSet<>();
        HashSet<Employee> dep3 = new HashSet<>();

        Department department1 = new Department(DepartmentType.TYPE1, dep1);
        Department department2 = new Department(DepartmentType.TYPE2, dep2);
        Department department3 = new Department(DepartmentType.TYPE3, dep3);
        DepartmentDAO.add(department1);
        DepartmentDAO.add(department2);
        DepartmentDAO.add(department3);

        HashSet<Project> projects1 = new HashSet<>();
        projects1.add(project1);
        projects1.add(project2);

        HashSet<Project> projects2 = new HashSet<>();
        projects2.add(project1);
        projects2.add(project2);
        projects2.add(project3);
        projects2.add(project4);
        projects2.add(project5);


        HashSet<Project> projects3 = new HashSet<>();
        projects3.add(project3);
        projects3.add(project1);

        HashSet<Project> projects4 = new HashSet<>();
        projects4.add(project8);
        projects4.add(project10);

        HashSet<Project> projects5 = new HashSet<>();
        projects5.add(project6);
        projects5.add(project4);

        HashSet<Project> projects6 = new HashSet<>();
        projects6.add(project6);
        projects6.add(project2);

        HashSet<Project> projects9 = new HashSet<>();
        projects9.add(project1);
        projects9.add(project2);

        HashSet<Project> projects10 = new HashSet<>();
        projects10.add(project1);
        projects10.add(project2);

        HashSet<Project> projects12 = new HashSet<>();
        projects12.add(project6);
        projects12.add(project7);
        projects12.add(project8);
        projects12.add(project9);
        projects12.add(project10);

        HashSet<Project> projects0 = new HashSet<>();

        Employee employee1 = new Employee("name1", "Name1", new Date(), Position.ANALYST, department1, projects1);
        Employee employee2 = new Employee("name2", "Name2", new Date(), Position.TEAM_LEAD, department2, projects2);
        Employee employee3 = new Employee("name3", "Name3", new Date(), Position.ANALYST, department3, projects3);
        Employee employee4 = new Employee("name4", "Name4", new Date(), Position.ANALYST, department1, projects4);
        Employee employee5 = new Employee("name5", "Name5", new Date(), Position.ANALYST, department2, projects5);
        Employee employee6 = new Employee("name6", "Name6", new Date(), Position.ANALYST, department3, projects6);
        Employee employee7 = new Employee("name7", "Name7", new Date(), Position.ANALYST, department1, projects0);
        Employee employee8 = new Employee("name8", "Name8", new Date(), Position.ANALYST, department2, projects0);
        Employee employee9 = new Employee("name9", "Name9", new Date(), Position.ANALYST, department3, projects9);
        Employee employee10 = new Employee("name10", "Name10", new Date(), Position.ANALYST, department1, projects10);
        Employee employee11 = new Employee("name11", "Name11", new Date(), Position.ANALYST, department2, projects0);
        Employee employee12 = new Employee("name12", "Name12", new Date(), Position.TEAM_LEAD, department3, projects12);
        Employee employee13 = new Employee("name13", "Name13", new Date(), Position.ANALYST, department1, projects0);
        EmployeeDAO.add(employee1);
        EmployeeDAO.add(employee2);
        EmployeeDAO.add(employee3);
        EmployeeDAO.add(employee4);
        EmployeeDAO.add(employee5);
        EmployeeDAO.add(employee6);
        EmployeeDAO.add(employee7);
        EmployeeDAO.add(employee8);
        EmployeeDAO.add(employee9);
        EmployeeDAO.add(employee10);
        EmployeeDAO.add(employee11);
        EmployeeDAO.add(employee12);
        EmployeeDAO.add(employee13);

        dep1.add(employee1);
        dep1.add(employee4);
        dep1.add(employee7);
        dep1.add(employee10);
        dep1.add(employee13);
        dep2.add(employee2);
        dep2.add(employee5);
        dep2.add(employee8);
        dep2.add(employee11);
        dep3.add(employee3);
        dep3.add(employee6);
        dep3.add(employee9);
        dep3.add(employee12);

        System.out.println(ProjectDAO.toStringStatic());
        System.out.println(CustomerDAO.toStringStatic());
        System.out.println(EmployeeDAO.toStringStatic());
        System.out.println(ProjectDAO.toStringStatic());

        System.out.println(Controller.projectsByEmployee(employee1));
        System.out.println(Controller.projectsByEmployee(employee2));
        System.out.println(Controller.projectsByEmployee(employee3));
        System.out.println(Controller.projectsByEmployee(employee4));
        System.out.println(Controller.projectsByEmployee(employee13));

        System.out.println(Controller.employeesByDepartmentWithoutProject(department1));
        System.out.println(Controller.employeesByDepartmentWithoutProject(department2));
        System.out.println(Controller.employeesByDepartmentWithoutProject(department3));

        System.out.println(Controller.employeesWithoutProject());
        System.out.println(Controller.employeesByProject("Project7"));

        System.out.println(Controller.employeesByTeamLead(employee2));

        System.out.println(Controller.teamLeadsByEmployee(employee1));
        System.out.println(Controller.teamLeadsByEmployee(employee2));
        System.out.println(Controller.teamLeadsByEmployee(employee5));
        System.out.println(Controller.teamLeadsByEmployee(employee8));

        System.out.println(Controller.employeesByProjectEmployee(employee8));

        System.out.println(Controller.projectsByCustomer(customer1));

        System.out.println(Controller.employeesByCustomerProjects(customer6));


    }

}
