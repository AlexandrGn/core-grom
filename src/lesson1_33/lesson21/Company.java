package lesson1_33.lesson21;

public class Company {
    private int numberOfEmployees;
    private String name;

    private static String licence;

    public Company(int numberOfEmployees, String name) {

        this.numberOfEmployees = numberOfEmployees;
        this.name = name;
    }

    public void setLicence(String licence) {
        Company.licence = licence;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public String getLicence() {
        return licence;
    }

}
