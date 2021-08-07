package com.redbee.academy.clase3;

public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {

        Integer count = 0;
        do {
            numero/=10;
            count++;
        }
        while(numero != 0);


        return count;
    }
}
