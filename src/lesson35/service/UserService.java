package lesson35.service;

import lesson35.DAO.UserDAO;
import lesson35.model.User;
import lesson35.model.UserNow;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void login(String userName, String password) throws Exception {
        userDAO.login(userName, password);
    }

    public void logout() {
        UserNow.logout();
    }

    public User registerUser(User user) throws Exception {
        return userDAO.registerUser(user);
    }
}
