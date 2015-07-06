package br.com.amil.conversorcsv.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Util {

    public static String getDataHoraAtual() {

        DateFormat dateFormat = new SimpleDateFormat(Constantes.FORMATO_DATA);
        Calendar cal = Calendar.getInstance();

        return dateFormat.format(cal.getTime());

    }

}
