package lesson1_33.lesson23;

public class Demo {
    public static void main(String[] args) {
        Validator validator= new Validator("user");
        System.out.println(validator.getCheckCount());

        Validator validator2= new Validator("user1");
        System.out.println(validator2.getCheckCount());

    }
}
