package lesson1_33.lesson25.Homework;

public class GeneralDAO<T> {
    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[10];

    public T save(T t) throws Exception {

        for (T t1 : array)
            if (t.equals(t1))
                throw new Exception("error, file already exists");


        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = t;
                return array[i];
            }
        }

        throw new Exception("error, no save");
    }

    public T[] getAll() {
        int count = 0;
        for (T t : array) {
            if (t != null)
                count++;
        }

        T[] newArray = (T[]) new Object[count];

        int index = 0;
        for (T t : array) {
            if (t != null)
                newArray[index] = t;
            index++;
        }

        return newArray;
    }

}
