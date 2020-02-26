package lesson1_33.lesson27.UserRepositoryWork;

import java.util.Objects;

public class User {
    private long id;
    private String name;
    private String sessioId;

    public User(long id, String name, String sessioId) {
        this.id = id;
        this.name = name;
        this.sessioId = sessioId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessioId() {
        return sessioId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(sessioId, user.sessioId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, sessioId);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}
