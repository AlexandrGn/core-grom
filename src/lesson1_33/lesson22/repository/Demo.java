package lesson1_33.lesson22.repository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        User user1 = new User(1001, "Daniil","32ds");
        UserRepository.save(user1);

        System.out.println(Arrays.deepToString(UserRepository.getUsers()));


        User user2 = new User(1002, "Andrey","32dsff");
        UserRepository.save(user2);

        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

        User user3 = new User(1001, "Test","32dsff");
        UserRepository.update(user3);

        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

    }

}
