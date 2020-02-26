package lesson1_33.lesson23;

public class Validator {

    private String name;
    private final static int checkCount=50;

    public Validator(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCheckCount() {
        return checkCount;
    }


}
