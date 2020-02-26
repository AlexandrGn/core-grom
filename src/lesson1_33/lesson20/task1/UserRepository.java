package lesson1_33.lesson20.task1;

import lesson1_33.lesson20.task1.exception.BadRequestException;

import lesson1_33.lesson20.task1.exception.InternalServelException;
import lesson1_33.lesson20.task1.exception.UserNotFoundException;
import lesson1_33.lesson9.homework.User;

public class UserRepository {

    private User[] users;

//    public UserRepository(User[] users) {
//        this.users = users;
//    }
//
//    public User[] getUsers() {
//        return users;
//    }
//
//    private int countCompletedUserInUser() {
//        int i = 0;
//        for (User u : users) {
//            if (u != null) {
//                i++;
//            }
//        }
//        return i;
//    }
//
//    public String[] getUserNames() {
//        String UserNames[] = new String[countCompletedUserInUser()];
//        int i = 0;
//        for (User u : users) {
//            if (u != null) {
//                UserNames[i++] = u.getName();
//            }
//        }
//
//        return UserNames;
//    }
//
//    public long[] getUserIds() {
//        long UserIds[] = new long[countCompletedUserInUser()];
//        int i = 0;
//        for (User u : users) {
//            if (u != null) {
//                UserIds[i++] = u.getId();
//            }
//        }
//        return UserIds;
//    }
//
//    public String getUserNameById(long id) {
//        for (User u : users) {
//            if (u != null && u.getId() == id) {
//                return u.getName();
//            }
//        }
//        return null;
//    }
//
//    public User getUserByName(String name) {
//        for (User u : users) {
//            if (u != null && u.getName() != null && name != null && u.getName().equals(name)) {
//                return u;
//            }
//        }
//        return null;
//    }
//
//
//    public User getUserBySessionId(String sessionId) {
//        for (User u : users) {
//            if (u != null && u.getSessionId() != null && sessionId != null && u.getSessionId().equals(sessionId)) {
//                return u;
//            }
//        }
//        return null;
//    }

    private int numberUserInUsers(long id) throws UserNotFoundException {
        int i = 0;
        for (User u : users) {
            if (u != null && u.getId() == id)
                return i;
            i++;
        }

        throw new UserNotFoundException("User with id " + id + " not found");
    }


    public User findById(long id) throws UserNotFoundException {
        for (User u : users)
            if (u != null && u.getId() == id)
                return u;

        throw new UserNotFoundException("User with id " + id + " not found");
    }

    public User save(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("Can't save null user");

        try {
            findById(user.getId());
            throw new BadRequestException("User with id: " + user.getId() + " already exist");
        } catch (UserNotFoundException e) {
            System.out.println("User with id: " + user.getId() + " not found. Will be saved");
        }

        int i = 0;
        for (User u : users) {
            if (u == null) {
                users[i] = user;
                return users[i];
            }
            i++;
        }

        throw new InternalServelException("Not enought space to save user with id: " + user.getId());
    }

    public User update(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("Can't update null user");

        int index=numberUserInUsers(user.getId());

        users[index] = user;
        return users[index];
    }

    public void delete(long id) throws Exception{
        int index = numberUserInUsers(id);
        users[index] = null;
    }


//    public void Demo(User user1, User user2, User user3, User user4) {
//        System.out.println("Тестировка приватных методов класса UserResitory");
//
//        System.out.println("----------------countCompletedUserInUser:");
//        System.out.println(countCompletedUserInUser());
//
//        System.out.println("----------------numberUserInUsers:");
//        System.out.println(numberUserInUsers(user1));
//        System.out.println(numberUserInUsers(user2));
//        System.out.println(numberUserInUsers(user3));
//        System.out.println(numberUserInUsers(new User(user1.getId(), user1.getName(), user1.getSessionId())));
//        System.out.println(numberUserInUsers(users[1]));
//        System.out.println(numberUserInUsers(user4));
//
//        System.out.println("Конец тестировки приватных методов класса UserResitory");
//
//    }

}
