package ar.com.ada.api.apihotel.excepciones;

import ar.com.ada.api.apihotel.entities.*;

/**
 * HuespedEdadException
 */
public class HuespedEdadException extends HuespedInfoException {

    public HuespedEdadException(Huesped huesped, String mensaje) {
        super(huesped, mensaje);
    }

}