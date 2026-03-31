package cibertec.com.airline.reservation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FlightReservationTest {

    @Test
    @DisplayName("Caso 1")
    void testValidReservation(){
        FlightReservation reservation = new FlightReservation();
        String code="ABC123";
        String passengerName= "Sergio Rodriguez";
        String passportNumber= "AB1234567";
        int seats = 2;
        LocalDate flightDate = LocalDate.of(2026,12,31);

        String result = reservation.registerReservation(code, passengerName, passportNumber, seats, flightDate);

        assertEquals("La resera ha sido registrada correctamente", result);
    }
}