package lesson35.model;

import lesson35.exceptions.InvalidInput;

import java.util.Date;

public class Order extends IdEntity {
    private User user;
    private Room room;
    private Date dateRoom;
    private Date dateTo;
    private double moneyPaid;

    public Order(User user, Room room, Date dateRoom, Date dateTo, double moneyPaid) {
        this.user = user;
        this.room = room;
        this.dateRoom = dateRoom;
        this.dateTo = dateTo;
        this.moneyPaid = moneyPaid;
    }

    public Order(long id, User user, Room room, Date dateRoom, Date dateTo, double moneyPaid) {
        this(user,room,dateRoom,dateTo,moneyPaid);
        super.setId(id);
    }

    public User getUser() {
        return user;
    }

    public Room getRoom() {
        return room;
    }

    public Date getDateRoom() {
        return dateRoom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public double getMoneyPaid() {
        return moneyPaid;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                Long.toString(user.getId()) + "," +
                Long.toString(room.getId()) + "," +
                toStringFormat(dateRoom) + "," +
                toStringFormat(dateTo) + "," +
                Double.toString(moneyPaid);
    }
}
