package lesson1_33.lesson8.studentExample;

import java.util.Arrays;

public class CollegeStudent extends Student {

    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken) {
        super(firstName, lastName, group, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "collegeName='" + collegeName + '\'' +
                ", rating=" + rating +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", coursesTaken=" + Arrays.toString(coursesTaken) +
                ", age=" + age +
                '}';
    }
}
