package lesson35.model;

import lesson35.exceptions.CreateIdException;
import lesson35.exceptions.InvalidInput;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class IdEntity {
    private long id;
    private static final String formatDate = "d-MM-yyyy";

    public final void setId(long id){
        if (id == 0 || this.id != 0) {
            System.err.println("объекту " + this.getClass().toString() + " id=" + this.id + " уже присвоен. Метод: setId.");
        }
        this.id = id;
    }

    public final long getId() {
        return id;
    }

    @Override
    public String toString() {
        return Long.toString(id);
    }


    public static final Date toDateFormat(String strinfDate) throws Exception {
        return new SimpleDateFormat(formatDate).parse(strinfDate);
    }

    public static final String toStringFormat(Date date) {
        return new SimpleDateFormat(formatDate).format(date);

    }

    public static final boolean equalsDate(Date date1, Date date2) {
        return toStringFormat(date1).equals(toStringFormat(date2));
    }
}
