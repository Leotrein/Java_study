package hotel.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import hotel.model.exceptions.DomainException;

public class Reservation {

    // atributes
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    Date now = new Date();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // constructors
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (checkIn.before(now) || checkOut.before(checkOut)) {
            throw new DomainException("Reservation dates fot update must be future dates");
        } else if (checkIn.after(checkOut)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    // getters and setters
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkIn;
    }

    public Date getCheckout() {
        return checkOut;
    }

    // methods
    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return diff / 1000 / 60 / 60 / 24;
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        if (checkIn.before(now) || checkOut.before(checkOut)) {
            throw new DomainException("Reservation dates fot update must be future dates");
        } else if (checkIn.after(checkOut)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // toString
    @Override
    public String toString() {
        return "Reservation: Room: "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }

}
