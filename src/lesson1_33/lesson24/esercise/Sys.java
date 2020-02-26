package lesson1_33.lesson24.esercise;

public class Sys {

    private int filesCount;
    private String location;

    public Sys(int filesCount, String location) {
        this.filesCount = filesCount;
        this.location = location;
    }

    @Override
    public String toString() {
        return "System{" +
                "filesCount=" + filesCount +
                ", location='" + location + '\'' +
                '}';
    }

}
