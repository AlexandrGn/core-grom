package lesson1_33.lesson13;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    private int countCompletedUserInUser() {
        int i = 0;
        for (User u : users) {
            if (u != null) {
                i++;
            }
        }
        return i;
    }

    public String[] getUserNames() {
        String UserNames[] = new String[countCompletedUserInUser()];
        int i = 0;
        for (User u : users) {
            if (u != null) {
                UserNames[i++] = u.getName();
            }
        }

        return UserNames;
    }

    public long[] getUserIds() {
        long UserIds[] = new long[countCompletedUserInUser()];
        int i = 0;
        for (User u : users) {
            if (u != null) {
                UserIds[i++] = u.getId();
            }
        }
        return UserIds;
    }

    public String getUserNameById(long id) {
        for (User u : users) {
            if (u != null && u.getId() == id) {
                return u.getName();
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for (User u : users) {
            if (u != null && u.getName() == name) {
                return u;
            }
        }
        return null;
    }

    public User getUserById(long id) {
        for (User u : users) {
            if (u != null && u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User u : users) {
            if (u != null && u.getSessionId() == sessionId) {
                return u;
            }
        }
        return null;
    }

    private User findById(long id) {
        return this.getUserById(id);
    }

    public User save(User user) {
        if (findById(user.getId()) != null) {
            return null;
        }
        int i = 0;
        for (User u : users) {
            if (u == null) {
                users[i] = user;
                return user;
            }
            i++;
        }
        return null;
    }

    public User update(User user) {
        User u = findById(user.getId());
        if (u == null) {
            return null;
        }
        users[numberUserInUsers(u)] = user;
        return user;
    }

    private int numberUserInUsers(User user) {
        if (user == null) {
            return -1;
        }
        int i = 0;
        for (User u : users) {
            if (u == user) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public void delete(long id) {
        int n = numberUserInUsers(findById(id));
        if (n == -1) {
            return;
        }
        users[n] = null;
    }

}
