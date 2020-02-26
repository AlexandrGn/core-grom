package lesson35.DAO;


import lesson35.exceptions.BadRequestException;
import lesson35.model.User;
import lesson35.model.UserNow;
import lesson35.model.UserType;

import java.util.HashSet;
import java.util.Set;


public class UserDAO extends DAO<User> {

    {
        String path = "D:\\JAVA\\файли до 35-36 уроків громкод\\UserDb.txt";
        setPath(path);
    }

    public void login(String userName, String password) throws Exception {
        for (User user : getAll()) {
            if (user.getUserName().equals(userName) && user.checkPassword(password)) {
                UserNow.login(user);
                return;
            }
        }

        throw new BadRequestException("No user name: " + userName + " and incoming password.");
    }

    public User registerUser(User user) throws Exception {
        validateRegisterUser(user);
        return add(user);
    }

    private void validateRegisterUser(User user) throws Exception {
        for (User u : getAll()) {
            if (u.getUserName().equals(user.getUserName())) {
                throw new BadRequestException("User with the same name already exists.");
            }
        }
    }

    @Override
    public User mapObject(String line) {
        String[] arrayData = line.split(",");
        return new User(Long.parseLong(arrayData[0]), arrayData[1], arrayData[2], arrayData[3], UserType.valueOf(arrayData[4]));
    }
}
