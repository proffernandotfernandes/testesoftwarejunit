package com.mycompany.testesoftware.utils;

import java.time.LocalDate;

public class DataUtils {

    public static boolean ehMesmaData(LocalDate data1, LocalDate data2){
        boolean retorno = false;

        if(data1.equals(data2)){
            retorno = true;
        }

        return retorno;
    }

    public static LocalDate obterDataComDiferencaDias(int dias){
         return LocalDate.now().plusDays(dias);
    }
}
