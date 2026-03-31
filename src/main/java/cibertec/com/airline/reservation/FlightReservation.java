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
        //validamos nombre del pasajero(5 caracteres)
        if(passengerName == null || !passengerName.matches("[A-Za-z ]{5,}")){
            return "El nombre del pasajero debe tener al menos cinco caracteres alfabeticos";
        }
        // validamos numero de pasaporte entre 8 a 10
        if(passportNumber == null || !passportNumber.matches("[A-Za-z0-9]{8,10}")){
            return "Ingrese un numero de pasaporte valido";
        }
        //validamos cantidad de asientos
        if (seats <= 0){
            return "La cantidad de asientos debe ser mayor a cero";
        }
        //validamos fecha de vuelo
        if (flightDate== null || !flightDate.isAfter(LocalDate.now())){
            return "La fecha del vuelo debe ser posterior a la fecha actual";
        }

    //Caso 1
    return "La reserva ha sido registrada correctamente";
    }

}
