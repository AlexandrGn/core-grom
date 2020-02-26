package lesson1_33.lesson9;

import lesson1_33.lesson9.homework.User;
import lesson1_33.lesson9.homework.UserRepository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Demo.Inner inner = new Demo().new Inner();
        User[] users = new User[35];
        User user1 = null, user2 = new User(125, "Nemo", "session"), user3 = null;

        for (int i = 0; i < 30; i++) {
            if (i == 2 || i == 5 || i % 10 == 0) {
                users[i] = null;
                continue;
            } else if (i == 21) users[i] = new User(121, null, "dff");
            else if (i == 22) users[i] = new User(122, null, null);
            else if (i == 23) users[i] = new User(123, "D", null);
            if (i == 21 || i == 22 || i == 23) continue;
            User user = new User(i, "A" + i, "B" + i);
            users[i] = user;
            if (i == 13) user1 = user;
        }

        UserRepository userRepository1 = new UserRepository(users);
        UserRepository userRepository2 = new UserRepository(new User[]{});

        inner.Vivod(users);


        //Тестировка приватных методов класса UserResitory
        userRepository1.Demo(user1, user2, user3, users[3]);

        System.out.println("Тестировка публичных методов класса UserResitory");

        System.out.println("-----------------------getUserNames");
        System.out.println(Arrays.toString(userRepository1.getUserNames()));
        System.out.println(Arrays.toString(userRepository2.getUserNames()));

        System.out.println("-----------------------getUserIds");
        System.out.println(Arrays.toString(userRepository1.getUserIds()));
        System.out.println(Arrays.toString(userRepository2.getUserIds()));

        System.out.println("-----------------------getUserNameById");
        System.out.println(userRepository1.getUserNameById(0));
        System.out.println(userRepository1.getUserNameById(50));
        System.out.println(userRepository1.getUserNameById(18));
        System.out.println(userRepository1.getUserNameById(-50));
        System.out.println(userRepository2.getUserNameById(0));
        System.out.println(userRepository2.getUserNameById(50));
        System.out.println(userRepository2.getUserNameById(18));
        System.out.println(userRepository2.getUserNameById(-50));


        System.out.println("-----------------------getUserByName");
        inner.metodVivodaUser(userRepository1.getUserByName("A7"));
        inner.metodVivodaUser(userRepository1.getUserByName(null));
        inner.metodVivodaUser(userRepository1.getUserByName("NoName"));
        inner.metodVivodaUser(userRepository2.getUserByName("A1"));
        inner.metodVivodaUser(userRepository2.getUserByName(null));
        inner.metodVivodaUser(userRepository2.getUserByName("NoName"));

        System.out.println("-----------------------getUserById");
        inner.metodVivodaUser(userRepository1.getUserById(50));
        inner.metodVivodaUser(userRepository1.getUserById(11));
        inner.metodVivodaUser(userRepository2.getUserById(50));
        inner.metodVivodaUser(userRepository2.getUserById(11));

        System.out.println("-----------------------getUserBySessionId");
        inner.metodVivodaUser(userRepository1.getUserBySessionId("B8"));
        inner.metodVivodaUser(userRepository1.getUserBySessionId(null));
        inner.metodVivodaUser(userRepository1.getUserBySessionId("NoName"));
        inner.metodVivodaUser(userRepository2.getUserBySessionId("A1"));
        inner.metodVivodaUser(userRepository2.getUserBySessionId(null));
        inner.metodVivodaUser(userRepository2.getUserBySessionId("NoName"));

        System.out.println("-----------------------save");
        inner.metodVivodaUser(userRepository1.save(user1));
        inner.metodVivodaUser(userRepository1.save(user2));
        inner.metodVivodaUser(userRepository1.save(user3));
        inner.metodVivodaUser(userRepository2.save(user1));
        inner.metodVivodaUser(userRepository2.save(user2));
        inner.metodVivodaUser(userRepository2.save(user3));

        inner.Vivod(users);

        System.out.println("-----------------------update");
        inner.metodVivodaUser(userRepository1.update(user1));
        inner.metodVivodaUser(userRepository1.update(user2));
        inner.metodVivodaUser(userRepository1.update(new User(1000, "no", null)));
        inner.metodVivodaUser(userRepository1.update(user3));
        User newUser = new User(11, "newName", "newSession");
        inner.metodVivodaUser(userRepository1.update(newUser));
        inner.metodVivodaUser(userRepository2.update(newUser));

        inner.Vivod(users);

        System.out.println("-----------------------delete");
        userRepository1.delete(15);
        userRepository1.delete(1000);
        userRepository2.delete(15);

        inner.Vivod(users);


    }

    class Inner {
        public void Vivod(User[] users) {
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

        public void metodVivodaUser(User user0) {

            if (user0 != null)
                System.out.println(user0.toString());
            else System.out.println(user0);
        }
    }

}
