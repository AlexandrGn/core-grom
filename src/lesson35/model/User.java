package lesson35.model;

import lesson35.exceptions.InvalidInput;

public class User extends IdEntity {
    private String userName;
    private String password;
    private String country;
    private UserType userType;

    public User(String userName, String password, String country, UserType userType) {
        this.userName = userName;
        this.password = password;
        this.country = country;
        this.userType = userType;
    }

    public User(long id, String userName, String password, String country, UserType userType) {
        this(userName,password,country,userType);
        super.setId(id);

    }

    public String getUserName() {
        return userName;
    }

    public String getCountry() {
        return country;
    }

    public UserType getUserType() {
        return userType;
    }

    public String[] toArray() {
        return new String[]{Long.toString(getId()), userName, password, country, userType.toString()};
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                userName + "," +
                password + "," +
                country + "," +
                userType.toString();
    }
}
