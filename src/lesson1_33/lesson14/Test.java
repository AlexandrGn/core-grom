package lesson1_33.lesson14;

public class Test implements Cloneable {
    private int someName;
    private String name;

    public Test(int someName, String name) {
        this.someName = someName;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws  Exception{
        Test test = new Test(1000, "name");
        System.out.println(test);
        System.out.println(test.hashCode());

        Test test1 =(Test) test.clone();
        System.out.println(test1);
        System.out.println(test1.hashCode());

//        Test test2 = new Test(test.getSomeName(),test.getName());
    }

    public int getSomeName() {
        return someName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "someName=" + someName +
                ", name='" + name + '\'' +
                '}';
    }

}
