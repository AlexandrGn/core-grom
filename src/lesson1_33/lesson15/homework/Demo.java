package lesson1_33.lesson15.homework;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
//        User[] users= new User[50];
//        users[1]=new User(1,"Ann","as20");
//        users[2]=new User(2,"Ann","as20");
//        users[8]=new User(4,"Ann","as20");
//        users[9]=new User(8,"Ann","as20");
//        users[10]=new User(9,"Ann","as20");
//        users[13]=new User(10,"Ann","as20");
//        users[14]=new User(13,"Ann","as20");
//        users[17]=new User(18,"Ann","as20");



        
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

        userRepository1.vivod();
        userRepository2.vivod();

        //Тестировка приватных методов класса UserResitory
        userRepository1.Demo(user1, user2, user3, users[3]);

        System.out.println("Тестировка публичных методов класса UserResitory");

        System.out.println("-----------------------save");
        System.out.println(userRepository1.save(user1));
        System.out.println(userRepository1.save(user2));
        System.out.println(userRepository1.save(user3));
        System.out.println(userRepository2.save(user1));
        System.out.println(userRepository2.save(user2));
        System.out.println(userRepository2.save(user3));

        userRepository1.vivod();
        userRepository2.vivod();

        System.out.println("-----------------------update");
        System.out.println(userRepository1.update(user1));
        System.out.println(userRepository1.update(user2));
        System.out.println(userRepository1.update(new User(1000, "no", null)));
        System.out.println(userRepository1.update(user3));
        User newUser = new User(11, "newName", "newSession");
        System.out.println(userRepository1.update(newUser));
        System.out.println(userRepository2.update(newUser));

        userRepository1.vivod();
        userRepository2.vivod();

        System.out.println("-----------------------delete");
        userRepository1.delete(15);
        userRepository1.delete(1000);
        userRepository2.delete(15);

        userRepository1.vivod();
        userRepository2.vivod();


    }

}
