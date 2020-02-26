package lesson1_33.lesson15.homework;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }



    public User save(User user) {
        if (findUser(user) != null) return null;
        int i = findFirstNullInUsers();
        if (i == -1) return null;

        users[i] = user;
        return user;
    }

    public User update(User user) {

        int n = findUserId(user);
        if (n == -1) return null;
        users[n] = user;
        return user;
    }

    public void delete(long id) {
        int n = findIdUser(id);
        if (n == -1) return;
        users[n] = null;
    }

    public User findUser(User user) {
        if (user==null) return null;
        for (User u : users) {
            if (user.equals(u)) return u;
        }
        return null;
    }



    private int findUserId(User user) {
        int i = 0;
        if (user==null) return -1;
        for (User u : users) {
            if (u != null && u.getId() == user.getId()) return i;
            i++;
        }
        return -1;
    }

    private int findIdUser(long id) {
        int i = 0;
        for (User u : users) {
            if (u != null && u.getId() == id) return i;
            i++;
        }
        return -1;
    }

    private int findFirstNullInUsers() {
        int i = 0;
        for (User u : users) {
            if (u == null) return i;
            i++;
        }
        return -1;
    }



    public void vivod() {
        System.out.println("------------Vivod------------");
        for (User u : users) {
            if (u == null) {
                System.out.println(u);
                continue;
            }
            System.out.println(u.toString());
        }
        System.out.println("-----------End-Vivod------------");
    }

    public void Demo(User user1, User user2, User user3, User user4){
        System.out.println("Тестировка приватных методов класса UserResitory");

        System.out.println("----------------findUserId:");
        System.out.println(findUserId(user1));
        System.out.println(findUserId(user2));
        System.out.println(findUserId(user3));
        System.out.println(findUserId(new User(user1.getId(),user1.getName(),user1.getSessionId())));
        System.out.println(findUserId(users[1]));
        System.out.println(findUserId(user4));

        System.out.println("----------------findIdUser:");
        System.out.println(findIdUser(-6));
        System.out.println(findIdUser(0));
        System.out.println(findIdUser(1));
        System.out.println(findIdUser(15));
        System.out.println(findIdUser(60));

        System.out.println("----------------findFirstNullInUsers:");
        System.out.println(findFirstNullInUsers());

        System.out.println("Конец тестировки приватных методов класса UserResitory");

    }

}
