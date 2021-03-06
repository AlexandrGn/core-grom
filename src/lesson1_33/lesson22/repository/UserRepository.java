package lesson1_33.lesson22.repository;

public class UserRepository {
    private static User[] users=new User[10];

    public static User[] getUsers() {
        return users;
    }

    private static int countCompletedUserInUser() {
        int i = 0;
        for (User u : users) {
            if (u != null) {
                i++;
            }
        }
        return i;
    }

    public static String[] getUserNames() {
        String UserNames[] = new String[countCompletedUserInUser()];
        int i = 0;
        for (User u : users) {
            if (u != null) {
                UserNames[i++] = u.getName();
            }
        }

        return UserNames;
    }

    public static long[] getUserIds() {
        long UserIds[] = new long[countCompletedUserInUser()];
        int i = 0;
        for (User u : users) {
            if (u != null) {
                UserIds[i++] = u.getId();
            }
        }
        return UserIds;
    }

    public static String getUserNameById(long id) {
        for (User u : users) {
            if (u != null && u.getId() == id) {
                return u.getName();
            }
        }
        return null;
    }

    public static User getUserByName(String name) {
        for (User u : users) {
            if (u != null && u.getName()!=null && name!=null && u.getName().equals(name)) {
                return u;
            }
        }
        return null;
    }

    public static User getUserById(long id) {
        for (User u : users) {
            if (u != null && u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public static User getUserBySessionId(String sessionId) {
        for (User u : users) {
            if (u != null && u.getSessionId()!=null && sessionId!=null && u.getSessionId().equals(sessionId)) {
                return u;
            }
        }
        return null;
    }

    private static User findById(long id) {
        return getUserById(id);
    }

    public static User save(User user) {
        if (user!=null && findById(user.getId()) != null) {
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

    public static User update(User user) {
        if (user==null) return null;
        User u = findById(user.getId());
        if (u == null) {
            return null;
        }
        users[numberUserInUsers(u)] = user;
        return user;
    }

    private static int numberUserInUsers(User user) {
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

    public static void delete(long id) {
        int n = numberUserInUsers(findById(id));
        if (n == -1) {
            return;
        }
        users[n] = null;
    }



    public static void Demo(User user1, User user2, User user3, User user4){
        System.out.println("Тестировка приватных методов класса UserResitory");

        System.out.println("----------------countCompletedUserInUser:");
        System.out.println(countCompletedUserInUser());

        System.out.println("----------------numberUserInUsers:");
        System.out.println(numberUserInUsers(user1));
        System.out.println(numberUserInUsers(user2));
        System.out.println(numberUserInUsers(user3));
        System.out.println(numberUserInUsers(new User(user1.getId(),user1.getName(),user1.getSessionId())));
        System.out.println(numberUserInUsers(users[1]));
        System.out.println(numberUserInUsers(user4));

        System.out.println("Конец тестировки приватных методов класса UserResitory");

    }

}
