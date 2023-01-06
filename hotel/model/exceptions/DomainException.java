package hotel.model.exceptions;

// custom exception

public class DomainException extends Exception {

    // constructors
    public DomainException() {

    }

    public DomainException(String msg) {
        super(msg);
    }

}
