package lesson35.model;

public class UserNow {
    // TODO: 3
    //насколько хороший способ хранить залогиненного юзера?
    private static User userNow = null;

    public static void logout() {
        userNow = null;
    }

    public static void login(User user) {
        userNow = user;
    }

    public static User getUserNow() {
        return userNow;
    }

    public static boolean statusLogin() {
        return userNow != null;
    }
}
