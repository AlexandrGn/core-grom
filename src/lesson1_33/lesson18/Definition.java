package lesson1_33.lesson18;

public class Definition {


    private void notifyUsers(String[] userEmails) {

        for (String email : userEmails) {

            try {

                System.out.println("Email" + email + "was sent");
            } catch (Exception e) {

                //что сделать если ошибка произошла
                System.out.println("Email" + email + "was not sent");
            }finally {

            }
        }
    }


}
