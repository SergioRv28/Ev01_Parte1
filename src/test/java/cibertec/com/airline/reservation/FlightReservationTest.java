package cibertec.com.airline.reservation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FlightReservationTest {
/*
    //TEST01
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

        assertEquals("La reserva ha sido registrada correctamente", result);
    }
*/
 /*
    //TEST02
    @Test
    @DisplayName("Codigo de reserva invalido debe mostrar mensaje de error")
    void testInvalidReservationCode(){
        FlightReservation reservation = new FlightReservation();
        String code= "ab12";
        String passengerName= "Sergio Rodriguez";
        String passportNumber= "AB1234567";
        int seats = 2;
        LocalDate flightDate = LocalDate.of(2026,12,31);

        String  result= reservation.registerReservation(code, passengerName, passportNumber,seats,flightDate);

        assertEquals("Ingrese un codigo de reserva valido", result);
    }
*/
/*
    @Test
    @DisplayName("Nombre de pasajero invalido debe mostrar mensaje de error")
    void testInvalidPassengerName(){
        FlightReservation reservation = new FlightReservation();
        String code = "ABC123";
        String passengerName="Jose"; // Solo debe tener 4 caracteres a si que mi nombre no sirve
        String passportNumber= "AB1234567";
        int seats = 2;
        LocalDate flightDate = LocalDate.of(2026,12,31);

        String result = reservation.registerReservation(code, passengerName,passportNumber, seats,flightDate);

        assertEquals("El nombre del pasajero debe tener al menos cinco caracteres alfabeticos", result);
    }

 */

    @Test
    @DisplayName("Numero de pasaporte invalido debe mostrar error")
    void  testInvalidPassportNumber(){
        FlightReservation reservation = new FlightReservation();
        String code= "ABC123";
        String passengerName = "Sergio Rodriguez";
        String passportNumber = "AB123"; // entre 8 a 10
        int seats = 2 ;
        LocalDate flightDate = LocalDate.of(2026,12,31);

        String result = reservation.registerReservation(code, passengerName,passportNumber, seats,flightDate);

        assertEquals("Ingrese un numero de pasaporte valido", result);

    }
}