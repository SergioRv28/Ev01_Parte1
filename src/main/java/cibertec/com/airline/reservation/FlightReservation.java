package cibertec.com.airline.reservation;


import java.time.LocalDate;

public class FlightReservation {
    public String registerReservation(
            String code, String passengerName,
            String passportNumber,int seats, LocalDate flightDate){

        // validamos el codigo de reserva
        if( code== null || !code.matches("[A-Z]{3}[0-9]{3}")){
            return "Ingrese un codigo de reserva valido";
        }

    return "La reserva ha sido registrada correctamente";
    }

}
