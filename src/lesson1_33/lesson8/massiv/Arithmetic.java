package lesson1_33.lesson8.massiv;

public class Arithmetic {

    public boolean check(int array[]) {
        if (array == null || array.length==0) return false;

        return maxElement(array) + minElement(array) > 100;
    }

    int maxElement(int array[]) {
        int max = array[0];
        for (int el : array) {
            if (max < el) {
                max = el;
            }
        }
        return max;
    }

    int minElement(int array[]) {
        int min = array[0];
        for (int el : array) {
            if (min > el) {
                min = el;
            }
        }
        return min;
    }

}
