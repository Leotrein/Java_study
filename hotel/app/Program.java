package hotel.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hotel.model.entities.Reservation;
import hotel.model.exceptions.DomainException;

// code made just to train exceptions in some ways

public class Program {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("\nRoom number: ");
            int number = scan.nextInt();

            System.out.print("Check-in (dd/MM/yyy): ");
            Date checkIn = sdf.parse(scan.next());

            System.out.print("Check-out (dd/MM/yyy): ");
            Date checkOut = sdf.parse(scan.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnnter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("New reservation: " + reservation);
            scan.close();
        } catch (ParseException e) {
            System.err.println("\nError: Invalid date format\n");
        } catch (DomainException e) {
            System.err.printf("%nError in reservation: %s%n%n", e.getMessage());
        } catch (RuntimeException e) {
            System.err.printf("%nUnspected error: %s%n%n", e.getMessage());
        }
    }

}
