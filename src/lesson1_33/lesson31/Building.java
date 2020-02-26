package lesson1_33.lesson31;

public class Building {
    private String name;
    private int count;


    /**
     * Creates a new character-stream reader whose critical sections will
     * synchronize on the given object.
     *
     * @param name null
     */
    public Building(String name, int count) {
        if(name==null)
            throw new NullPointerException();
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
