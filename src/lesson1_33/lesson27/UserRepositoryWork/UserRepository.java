package lesson1_33.lesson27.UserRepositoryWork;

import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> users = new ArrayList<>();

    public User save(User user) {
        users.add(user);
        return user;
    }

    public User update(User user) throws Exception {

        int index = users.indexOf(user);
        users.set(index, user);

        return users.get(index);
    }

    public void delete(long id) throws Exception {
        users.remove(findById(id));
    }

    public User findById(long id) throws Exception {
        for (User user : users)
            if (user.getId() == id)
                return user;

        throw new Exception("no IdEntity user " + id);
    }

}
