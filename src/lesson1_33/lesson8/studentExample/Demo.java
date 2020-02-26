package lesson1_33.lesson8.studentExample;

public class Demo {

    public Student createHighestParent() {
        Course[] courseMassiv=new Course[0];
//        Course course = new Course(new Date(), "two", 5, "Teatcher", studentMassiv);
//        Course[] c = {course};
        Student student = new Student("Ann", "Kovalenko", 2, courseMassiv);

        return student;

    }

    public SpecialStudent createLowestChild() {
        Course[] courseMassiv=new Course[0];
        SpecialStudent specialStudent = new SpecialStudent("Andrey", "Shevchenko", 1, courseMassiv, 5, "ASh@");
        return specialStudent;
    }
}
